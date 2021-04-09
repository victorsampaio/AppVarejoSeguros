package br.com.varejoseguros.api;

import com.google.gson.GsonBuilder;

import java.lang.ref.Reference;

import br.com.varejoseguros.api.interfaces.OfertaVarejoInterface;
import br.com.varejoseguros.api.request.OfertasVarejoRequest;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import static br.com.varejoseguros.api.AccessConfig.BASE_URL;

public class VarejoApi {

    private static Retrofit retrofit;

    private static Retrofit getRetRrofitInstance() {
        return retrofit == null
                ? retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL.getValue())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().setDateFormat("dd/MM/yyyy HH:mm:ss").create()))
                .build()
                : retrofit;
    }


    public static Call<OfertaVarejoInterface> getAllProducts(OfertasVarejoRequest request) {
        return getRetRrofitInstance().create(OfertaVarejoInterface.class).getAllProducts(request);
    }
}
