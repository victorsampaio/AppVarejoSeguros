package br.com.varejoseguros.api.interfaces;

import br.com.varejoseguros.api.request.OfertasVarejoRequest;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface OfertaVarejoInterface {

    @GET("api/v1/Product")
    Call<OfertaVarejoInterface> getAllProducts(@Body OfertasVarejoRequest request);

}
