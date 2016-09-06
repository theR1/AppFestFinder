package com.example.atecdroid.appfestfinder;

import android.app.Application;
import android.provider.ContactsContract;

import com.example.atecdroid.appfestfinder.modelo.DataBase;
import com.example.atecdroid.appfestfinder.modelo.Festival;
import com.example.atecdroid.appfestfinder.modelo.Mes;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */
public class AppFest extends Application{

    protected ArrayList<Mes> meses;
    protected Mes mesEscolhido;
    protected Festival festivalEscolhido;


    @Override
    public void onCreate() {
        super.onCreate();

        meses = DataBase.getData();
    }

    public ArrayList<Mes> getMeses() {
        return meses;
    }

    public void setMeses(ArrayList<Mes> meses) {
        this.meses = meses;
    }

    public Mes getMesEscolhido() {
        return mesEscolhido;
    }

    public void setMesEscolhido(Mes mesEscolhido) {
        this.mesEscolhido = mesEscolhido;
    }

    public Festival getFestivalEscolhido() {
        return festivalEscolhido;
    }

    public void setFestivalEscolhido(Festival festivalEscolhido) {
        this.festivalEscolhido = festivalEscolhido;
    }
}
