package br.com.varejoseguros.api.controllers;


import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import br.com.varejoseguros.R;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class ApiController<T> {

    protected T apiInterface;

    private Context context;

    protected Resources resources;

    protected Retrofit retrofit;

    protected String baseUrl;

    protected ApiController(final Class<T> apiInterfaceClass,
                            Context context,
                            String baseUrl,
                            Resources resources){
        this.context = context;
        this.resources = resources;
        this.baseUrl = baseUrl;
        initializeRetrofit();
        initializeApiInterface(apiInterfaceClass);
    }

    protected Context getContext() {
        return context;
    }

    protected void initializeApiInterface(final Class<T> apiInterfaceClass){
        apiInterface = retrofit.create(apiInterfaceClass);
    }

    protected String getBaseUrl(){
        return baseUrl;/*resources.getString(android.R.string.api_endpoint);*/
    }

    protected void initializeRetrofit(){
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .disableHtmlEscaping()
                .create();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override public void log(String message) {
                Log.i("OkHttp", message);
            }
        });
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(90, TimeUnit.SECONDS)
                .readTimeout(90, TimeUnit.SECONDS)
                .writeTimeout(90, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

    }

    public void displayGenericServerError(){
        Toast.makeText(getContext(), R.string.msg_server_error, Toast.LENGTH_SHORT).show();
    }

    public T getApiInterface() {
        return apiInterface;
    }

    public void setApiInterface(T apiInterface) {
        this.apiInterface = apiInterface;
    }

    public String generateAuthorizationHeaderFromToken(String token) {
        return "Bearer " + token;
    }
}
