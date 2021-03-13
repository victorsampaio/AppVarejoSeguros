package br.com.varejoseguros.api.interfaces;

import br.com.varejoseguros.api.response.LoginResponse;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApiInterface {

    @POST("api/token")
    Observable<LoginResponse> usuarioLogin(@Body RequestBody body);

}
