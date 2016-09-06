package com.example.atecdroid.appfestfinder.modelo;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */
public class Mes extends ArrayList<Mes> {

    String nome;
    ArrayList<Festival> festivais;


    public ArrayList<Festival> getFestivais() {return festivais;}

    public void setFestivais(ArrayList<Festival> festivais) {
        this.festivais = festivais;
    }

    public Mes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
