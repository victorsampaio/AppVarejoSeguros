package br.com.varejoseguros.util;

import android.app.Application;
import android.content.Context;

public class VarejoSegurosApp extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        VarejoSegurosApp.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return VarejoSegurosApp.context;
    }
}