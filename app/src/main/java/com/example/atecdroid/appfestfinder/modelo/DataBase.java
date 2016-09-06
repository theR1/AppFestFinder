package com.example.atecdroid.appfestfinder.modelo;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */
public class DataBase {

    public static ArrayList<Mes> getData() {
        ArrayList<Mes> meses = new ArrayList<Mes>();

        Mes maio = new Mes("Maio");
        ArrayList<Festival> festmaio = new ArrayList<>();


//        {"Sumol Summerfest","Lisboa Dance Festival","Sons de Vez"},

        Festival sumol = new Festival("Sumol Summerfest", "Ericeira Camping\n" +
                "Parque de Campismo de Mil Regos\n" +
                "Estrada Nacional 247, km 49,4\n" +
                "2655-319 ERICEIRA", "05/05/16", "Bilhete diário: 30 euros\n" +
                "Passe 2 dias sem camping: 45 euros\n" +
                "Passe 2 dias com camping: 55 euros\n", "http://www.sumolsummerfest.com/", "ssf1", "ssf");
        festmaio.add(sumol);
        Festival lisdance = new Festival("Lisboa Dance Festival", "LX FACTORY\n" +
                "Rua Rodrigues Faria, 103\n" +
                "1300 - 501 Lisboa","15/05/16","Bilhete diário: 40 euros","http://www.lisboadancefestival.com/", "ldf1", "ldf");
        festmaio.add(lisdance);
        Festival sonsvez = new Festival("Rock in Rio Lisboa", "Parque da Bela Vista, Lisboa","25/05/16","Bilhete diário: 69 euros","http://rockinriolisboa.sapo.pt/", "rir1", "rir");
        festmaio.add(sonsvez);


        maio.setFestivais(festmaio);


        meses.add(maio);

        Mes junho = new Mes("Junho");
        ArrayList<Festival> festjunho = new ArrayList<>();


        Festival lispsych = new Festival("Lisbon Psych Fest", "Rua dos Caetanos, 26, Lisboa","05/06/16","Bilhete Diário: 16 euros\n" +
                "Bilkhete de fim-de-semana: 25 euros","http://lisbonpsychfest.com/", "lpf1", "lpf");
        festjunho.add(lispsych);
        Festival swr = new Festival("NOS PRIMAVERA SOUND", "Parque da Cidade, Porto","15/06/16","Bilhetes diários: 55 euros","https://www.nosprimaverasound.com/", "nps1", "nps");
        festjunho.add(swr);

        junho.setFestivais(festjunho);

        meses.add(junho);

        Mes julho = new Mes("Julho");
        ArrayList<Festival> festjulho = new ArrayList<>();

//        {"Rock In Rio"},

        Festival rir = new Festival("NOS ALIVE'16", "Passeio Marítimo de Algés, Oeiras","05/07/16","Bilhete diário: 56 euros\n" +
                "Passe de três dias: 119 euros","http://nosalive.com/", "na1", "na");
        festjulho.add(rir);
        Festival nos = new Festival("RFM SOMNII", "Praia do Relógio, Figueira da Foz","De 8 a 10 de julho","Bilhete diário (até 31 maio): 13 euros\n" +
                "Passe de três dias (até 31 maio): entre 23,50 e 38,50 euros","http://rfm.sapo.pt/somnii/", "rs1", "rs");
        festjulho.add(nos);

        julho.setFestivais(festjulho);

        meses.add(julho);

        Mes agosto = new Mes("Agosto");
        ArrayList<Festival> festagosto = new ArrayList<>();

//        {"Caixa Ribeira","Mirandela Music Fest", "Rock na Vila"},

        Festival cxRibeira = new Festival("Caixa Ribeira","Rua Infante Dom Henrique, Porto","05/08/16","Bilhete 2 dias: 28 euros","http://www.caixaribeira.pt/", "cr1", "ca");
        festagosto.add(cxRibeira);

        Festival mirandelaMF = new Festival("MEO SUDOESTE","Zambujeira do mar","02/08/16","Bilhete diário: 48 euros\n" +
                "Passe 5 dias com camping: 95 euros","\n" +
                "http://sudoeste.meo.pt/", "msw1", "msw");
        festagosto.add(mirandelaMF);


        agosto.setFestivais(festagosto);

        meses.add(agosto);

        return meses;
    }
}
