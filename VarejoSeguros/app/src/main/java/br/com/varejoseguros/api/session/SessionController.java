package br.com.varejoseguros.api.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import br.com.varejoseguros.model.Usuario;

public class SessionController {
    private Usuario currentUser;

    private SharedPreferences sharedPref;

    private Context context;

    @SuppressLint("StaticFieldLeak")
    private static SessionController instance = null;

    private SessionController(Context context) {
        sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        this.context = context;
        retrieveUserFromSharedPreferences();
    }

    public static void initialize(Context context) {
        if(getInstance() != null){
            return;
        }

        instance = new SessionController(context);
    }

    public static SessionController getInstance() {
        return instance;
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }

    private void setCurrentUser(Usuario currentUser) {
        this.currentUser = currentUser;
    }

    public Usuario login(Usuario currentUser) {
        this.currentUser = currentUser;
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context)
                .edit();

        editor.putString("nome", currentUser.getNome());
        editor.putString("token", currentUser.getToken());
        editor.apply();

        return this.currentUser;
    }

    public void logout(){
        SharedPreferences.Editor editor =  PreferenceManager.getDefaultSharedPreferences(context)
                .edit();
        editor.remove("nome");
        editor.remove("token");
        editor.clear();
        editor.apply();
        setCurrentUser(null);
    }

    public void retrieveUserFromSharedPreferences(){
        this.currentUser = new Usuario();
        this.currentUser.setNome(sharedPref.getString("nome", null));
        this.currentUser.setToken(sharedPref.getString("token", null));
    }

    public String getToken() {
        return this.currentUser.getToken() == null ?
                sharedPref.getString("token", null) :
                this.currentUser.getToken();
    }
}
