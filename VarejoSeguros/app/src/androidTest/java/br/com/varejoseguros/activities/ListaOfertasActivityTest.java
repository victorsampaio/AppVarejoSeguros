package br.com.varejoseguros.activities;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.List;

import br.com.varejoseguros.api.interfaces.OfertaVarejoInterface;
import br.com.varejoseguros.api.request.Comprador;
import br.com.varejoseguros.api.request.Endereco;
import br.com.varejoseguros.api.request.OfertasVarejoRequest;
import br.com.varejoseguros.api.request.Vendedor;
import retrofit2.Call;
import retrofit2.Callback;
import br.com.varejoseguros.api.VarejoApi;
import retrofit2.Response;

import static org.junit.Assert.*;

public class ListaOfertasActivityTest {



    private void requestProducts() {
        Vendedor vendedor = new Vendedor("38271870874", "1302", "11966100936");
        Endereco endereco = new Endereco("04080012", "",  "55");
        Comprador comprador = new Comprador("29160032820", "11966100936", endereco);
        OfertasVarejoRequest  request = new OfertasVarejoRequest(vendedor, comprador);
        request.getComprador().getCpfCnpj();
        request.getVendedor().getIdloja();

        VarejoApi.getAllProducts(request).enqueue(new Callback<OfertaVarejoInterface>() {
            @Override
            public void onResponse(Call<OfertaVarejoInterface> call, Response<OfertaVarejoInterface> response) {
                Integer statusCode = response.code();

                if (statusCode == 200) {



                } else if (statusCode == 401) {
                    //   Log.e(ListaOfertasActivity.class.getSimpleName(), "TAREFAS: Não autorizado!");
                } else {
                    // Log.e(ListaOfertasActivity.class.getSimpleName(), "TAREFAS: Erro Desconhecido! " + response.toString());
                }
            }

            @Override
            public void onFailure(Call<OfertaVarejoInterface> call, Throwable t) {

            }


        });
    }

}