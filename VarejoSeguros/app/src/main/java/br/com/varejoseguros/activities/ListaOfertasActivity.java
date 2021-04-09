package br.com.varejoseguros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import java.util.ArrayList;
import java.util.List;

import br.com.varejoseguros.R;
import br.com.varejoseguros.api.response.OfertasResponse;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

    }

    @OnClick(R.id.buttonAdicionarProdutos)
    public void adicionarCompra() {

    }

    void configuraFloatActionMenu() {
        
        btnGarantiaEstendida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE GARANTIA ESTENDIDA
                Log.e("TESTE","GARANTIA ESTENDIDA");
                floatingMenu.collapse();
            }
        });

        btnAssistenciaTecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM ASSISTENCIA TECNICA
                Log.e("TESTE","ASSISTENCIA TECNICA");
                floatingMenu.collapse();
            }
        });

        btnGarantiaCelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE GARANTIA CELULAR
                Log.e("TESTE","GARANTIA CELULAR");
                floatingMenu.collapse();
            }
        });

        btnPlanoDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE PLANO DENTAL
                Log.e("TESTE","PLANO DENTAL");
                floatingMenu.collapse();
            }
        });

        btnServicosGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE SERVICOS GERAIS
                Log.e("TESTE","SERVICOS GERAIS");
                floatingMenu.collapse();

            }
        });

        btnGarantiaRouboFurto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CHAMA A LISTAGEM DE OBJETOS ROUBO FURTO
                Log.e("TESTE","ROUBO FURTO");
                floatingMenu.collapse();
            }
        });

    }

    void configuraAdapters() {

    }
}