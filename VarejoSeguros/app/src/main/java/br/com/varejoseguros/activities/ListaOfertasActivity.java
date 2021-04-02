package br.com.varejoseguros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.varejoseguros.R;
import br.com.varejoseguros.api.response.OfertasResponse;
import butterknife.OnClick;

public class ListaOfertasActivity extends AppCompatActivity {
    List<OfertasResponse> produtosList = new ArrayList<OfertasResponse>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ofertas);
        setTitle(getText(R.string.produtos_disponiveis));

    }

    @OnClick(R.id.buttonAdicionarProdutos)
    public void adicionarCompra() {

    }
}