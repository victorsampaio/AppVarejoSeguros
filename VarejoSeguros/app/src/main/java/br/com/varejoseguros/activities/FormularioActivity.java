package br.com.varejoseguros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.varejoseguros.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static br.com.varejoseguros.util.VarejoSharedPreferences.stockVendedorOnSharedPref;

public class FormularioActivity extends AppCompatActivity {

    @BindView(R.id.editCpfVendedor) EditText cpfCnpjVendedor;
    @BindView(R.id.editCelularVendedor) EditText foneVendedor;
    @BindView(R.id.editCpfCliente) EditText cpfCnpjComprador;
    @BindView(R.id.editCelularCliente) EditText foneComprador;
    @BindView(R.id.editConfereCelularCliente) EditText confirmFoneComprador;
    @BindView(R.id.editCepCliente) EditText cepComprador;
    @BindView(R.id.editNumeroCliente) EditText numeroEnderecoComprador;
    @BindView(R.id.editComplementoCliente) EditText complEnderecoComprador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonProximo)
    public void validaCampos(View view) {
        // TODO submit data to server...
        Toast.makeText(this, "Deu certo", Toast.LENGTH_SHORT).show();
        if (cpfCnpjVendedor.getText().toString().isEmpty()) {
            cpfCnpjVendedor.setError("Vendendor");
            Toast.makeText(this, "Vendedor", Toast.LENGTH_LONG).show();
            return;
        }

        if (!testaCPF(cpfCnpjVendedor.getText().toString())) {
            cpfCnpjVendedor.setError("Vendedor");
            Toast.makeText(getApplicationContext(), "Vendedor", Toast.LENGTH_SHORT).show();
            return;
        }

        if (foneVendedor.getText().toString().isEmpty()) {
            foneVendedor.setError("Vendedor");
            Toast.makeText(this,"Vendedor", Toast.LENGTH_LONG).show();
            return;
        }

        if (foneVendedor.getText().toString().length() < 14) {
            foneVendedor.setError("foneVendedor");
            Toast.makeText(this, "foneVendedor", Toast.LENGTH_LONG).show();
            return;
        }

        if (cpfCnpjComprador.getText().toString().isEmpty()) {
            cpfCnpjComprador.setError("cpfCnpjComprador");
            Toast.makeText(this, "cpfCnpjComprador", Toast.LENGTH_LONG).show();
            return;
        }

        if (!testaCPF(cpfCnpjComprador.getText().toString())) {
            cpfCnpjComprador.setError("getText(R.string.CPFClienteInválido)");
            Toast.makeText(getApplicationContext(), "getText(R.string.CPFClienteInválido)", Toast.LENGTH_SHORT).show();
            return;
        }

        if (foneComprador.getText().toString().isEmpty()) {
            foneComprador.setError("getText(R.string.CelularClienteVazio)");
            Toast.makeText(this, "getText(R.string.CelularClienteVazio)", Toast.LENGTH_LONG).show();
            return;
        }

        if (foneComprador.getText().toString().length() < 14) {
            foneComprador.setError("getText(R.string.celularClienteIncompleto)");
            Toast.makeText(this, "getText(R.string.celularClienteIncompleto)", Toast.LENGTH_LONG).show();
            return;
        }

        if (confirmFoneComprador.getText().toString().isEmpty()) {
            confirmFoneComprador.setError("getText(R.string.CelularConfereClienteVazio)");
            Toast.makeText(this, "getText(R.string.CelularConfereClienteVazio)", Toast.LENGTH_LONG).show();
            return;
        }

        if (!foneComprador.getText().toString().equals(confirmFoneComprador.getText().toString())) {
            Toast.makeText(this, "getText(R.string.celularDiferente)", Toast.LENGTH_LONG).show();
            confirmFoneComprador.setError("getText(R.string.celularDiferente)");
            return;
        }

        if (cepComprador.getText().toString().isEmpty()) {
            cepComprador.setError("getText(R.string.CepVazio)");
            Toast.makeText(this, "getText(R.string.CepVazio)", Toast.LENGTH_LONG).show();
            return;
        }

        if (numeroEnderecoComprador.getText().toString().isEmpty()) {
            numeroEnderecoComprador.setError("getText(R.string.NumeroClienteVazio)");
            Toast.makeText(this, "getText(R.string.NumeroClienteVazio)", Toast.LENGTH_LONG).show();
            return;
        }
        saveOnSharedPref();

    }

    private void saveOnSharedPref() {
        stockVendedorOnSharedPref(cpfCnpjVendedor.getText().toString(), foneVendedor.getText().toString(), "loja1");
    }

    Boolean testaCPF(String cpf) {

        cpf = cpf.replace(".", "").replace("-", "");
        int Soma = 0;
        int Resto = 0;

        if (cpf.equals("00000000000") || cpf == "00000000000") return false;

        if (cpf.length() < 11) return false;

        for (int i = 1; i <= 9; i++) {
            Soma = Soma + Integer.parseInt(cpf.substring(i - 1, i)) * (11 - i);
            Resto = (Soma * 10) % 11;
        }

        if ((Resto == 10) || (Resto == 11)) {
            Resto = 0;
        }
        if (Resto != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }
        Soma = 0;
        for (int i = 1; i <= 10; i++) {
            Soma = Soma + Integer.parseInt(cpf.substring(i - 1, i)) * (12 - i);
        }
        Resto = (Soma * 10) % 11;

        if ((Resto == 10) || (Resto == 11)) {
            Resto = 0;
        }
        if (Resto != Integer.parseInt(cpf.substring(10, 11))) {
            return false;
        }
        return true;
    }

}