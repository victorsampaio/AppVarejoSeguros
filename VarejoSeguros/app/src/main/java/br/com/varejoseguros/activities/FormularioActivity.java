package br.com.varejoseguros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.varejoseguros.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormularioActivity extends AppCompatActivity {

    @BindView(R.id.editCpfVendedor) EditText cpfVendedor;
    @BindView(R.id.editCelularVendedor) EditText foneVendedor;
    @BindView(R.id.editCpfCliente) EditText cpfComprador;
    @BindView(R.id.editCelularCliente) EditText foneComprador;
    @BindView(R.id.editConfereCelularCliente) EditText confirmFoneComprador;
    @BindView(R.id.editCepCliente) EditText cepComprador;
    @BindView(R.id.editNumeroCliente) EditText numeroEnderecoComprador;
    @BindView(R.id.editComplementoCliente) EditText complEnderecoComprador;
   // @BindView(R.id.buttonProximo) Button btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonProximo)
    public void submit(View view) {
        // TODO submit data to server...
        Toast.makeText(this, "Deu certo", Toast.LENGTH_SHORT).show();
    }
}