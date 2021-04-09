package br.com.varejoseguros.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import java.util.ArrayList;
import java.util.List;

import br.com.varejoseguros.R;
import br.com.varejoseguros.api.VarejoApi;
import br.com.varejoseguros.api.interfaces.OfertaVarejoInterface;
import br.com.varejoseguros.api.request.Comprador;
import br.com.varejoseguros.api.request.Endereco;
import br.com.varejoseguros.api.request.OfertasVarejoRequest;
import br.com.varejoseguros.api.request.Vendedor;
import br.com.varejoseguros.api.response.OfertasResponse;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaOfertasActivity extends AppCompatActivity {
    @BindView(R.id.floatingMenu)
    FloatingActionsMenu floatingMenu;

    @BindView(R.id.btnGarantiaEstendida)
    FloatingActionButton btnGarantiaEstendida;

    @BindView(R.id.btnAssistenciaTecnica)
    FloatingActionButton btnAssistenciaTecnica;

    @BindView(R.id.btnGarantiaCelular)
    FloatingActionButton btnGarantiaCelular;

    @BindView(R.id.btnPlanoDental)
    FloatingActionButton btnPlanoDental;

    @BindView(R.id.btnServicosGerais)
    FloatingActionButton btnServicosGerais;

    @BindView(R.id.btnGarantiaRouboFurto)
    FloatingActionButton btnGarantiaRouboFurto;

    List<OfertasResponse> produtosList = new ArrayList<OfertasResponse>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ofertas);
        ButterKnife.bind(this);
        setTitle(getText(R.string.produtos_disponiveis));

        configuraFloatActionMenu();
        configuraAdapters();

        configuraObjFake();
    }

    @OnClick(R.id.buttonAdicionarProdutos)
    public void adicionarCompra() {

    }

    void configuraFloatActionMenu() {

        btnGarantiaEstendida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE GARANTIA ESTENDIDA
                Log.e("TESTE", "GARANTIA ESTENDIDA");
                floatingMenu.collapse();
            }
        });

        btnAssistenciaTecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM ASSISTENCIA TECNICA
                Log.e("TESTE", "ASSISTENCIA TECNICA");
                floatingMenu.collapse();
            }
        });

        btnGarantiaCelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE GARANTIA CELULAR
                Log.e("TESTE", "GARANTIA CELULAR");
                floatingMenu.collapse();
            }
        });

        btnPlanoDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE PLANO DENTAL
                Log.e("TESTE", "PLANO DENTAL");
                floatingMenu.collapse();
            }
        });

        btnServicosGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE SERVICOS GERAIS
                Log.e("TESTE", "SERVICOS GERAIS");
                floatingMenu.collapse();

            }
        });

        btnGarantiaRouboFurto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE OBJETOS ROUBO FURTO
                Log.e("TESTE", "ROUBO FURTO");
                floatingMenu.collapse();
            }
        });

    }

    void configuraAdapters() {

    }

    private void configuraObjFake() {
        Vendedor vendedor = new Vendedor("38271870874", "1302", "11966100936");
        Endereco endereco = new Endereco("04080012", "", "55");
        Comprador comprador = new Comprador("29160032820", "11966100936", endereco);
        OfertasVarejoRequest request = new OfertasVarejoRequest(vendedor, comprador);

        requestProducts(request);
    }


    private void requestProducts(OfertasVarejoRequest request) {

        VarejoApi.getAllProducts(request).enqueue(new Callback<OfertaVarejoInterface>() {
            @Override
            public void onResponse(@NonNull Call<OfertaVarejoInterface> request, @NonNull Response<OfertaVarejoInterface> response) {
                Integer statusCode = response.code();

                if (statusCode == 200) {

                } else if (statusCode == 401) {

                } else {

                }
            }

            @Override
            public void onFailure(@NonNull Call<OfertaVarejoInterface> call, @NonNull Throwable t) {

            }
        });
    }

}
