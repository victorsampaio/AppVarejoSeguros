package br.com.varejoseguros.util;

import android.content.SharedPreferences;
import android.util.Log;

import br.com.varejoseguros.R;

import static android.content.Context.MODE_PRIVATE;
import static android.content.Context.USER_SERVICE;
import static br.com.varejoseguros.model.enuns.SharedPreferenceKeys.SENHA;
import static br.com.varejoseguros.model.enuns.SharedPreferenceKeys.USUARIO;
import static br.com.varejoseguros.model.enuns.SharedPreferenceKeys.VENDEDOR_CONTATO;
import static br.com.varejoseguros.model.enuns.SharedPreferenceKeys.VENDEDOR_CPF;
import static br.com.varejoseguros.model.enuns.SharedPreferenceKeys.VENDEDOR_ID_LOJA;
import static br.com.varejoseguros.util.VarejoSegurosApp.getAppContext;

import static br.com.varejoseguros.model.enuns.SharedPreferenceKeys.ACCESS_TOKEN;
public class VarejoSharedPreferences {


    //Usuario
    public static String usuario;
    public static String senha;
    public static String accessToken;

    //Vendedor
    public static String cpfCnpjVendedor;
    public static String numeroCelularVendedor;
    public static String idloja;

    //Comprador
    public static String cpfCnpj;
    public static String numeroCelular;
    public static String cep;
    public static String complemento;
    public static String numero;

    public static void updateSharedPreferences() {
        SharedPreferences sharedPref = getAppContext().getSharedPreferences(getAppContext().getString(R.string.app_package), MODE_PRIVATE);

        VarejoSharedPreferences.usuario = sharedPref.getString(USUARIO.getValue(), "");
        VarejoSharedPreferences.senha = sharedPref.getString(SENHA.getValue(), "");
        VarejoSharedPreferences.accessToken = sharedPref.getString(ACCESS_TOKEN.getValue(), "");

    }
    public static void stockLoginOnSharedPref(String username, String password, String token) {

        SharedPreferences sharedPref = getAppContext().getSharedPreferences(getAppContext().getString(R.string.app_package), MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(USUARIO.getValue(), username);
        editor.putString(SENHA.getValue(), password);
        
        editor.apply();
        updateSharedPreferences();
    }

    public static void stockVendedorOnSharedPref(String cpfCnpjVendedor, String numeroCelularVendedor, String idloja) {
        Log.d("SP_vend",  "Vendedor: " + cpfCnpjVendedor + " - " + numeroCelularVendedor + " - " + idloja);
        SharedPreferences sharedPref = getAppContext().getSharedPreferences(getAppContext().getString(R.string.app_package), MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(VENDEDOR_CPF.getValue(), cpfCnpjVendedor);
        editor.putString(VENDEDOR_CONTATO.getValue(), numeroCelularVendedor);
        editor.putString(VENDEDOR_ID_LOJA.getValue(), idloja);

        editor.apply();
        updateSharedPreferences();
    }
}
