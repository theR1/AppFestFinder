package com.example.atecdroid.appfestfinder.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.atecdroid.appfestfinder.AppFest;
import com.example.atecdroid.appfestfinder.R;
import com.example.atecdroid.appfestfinder.modelo.Festival;
import com.example.atecdroid.appfestfinder.modelo.Mes;

import java.util.ArrayList;

public class AvMesPerfil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_perfil);

        LinearLayout ld = (LinearLayout) findViewById(R.id.id_linear);

        final AppFest mApp;

        mApp = (AppFest) getApplication();

        ArrayList<Festival> festivais = mApp.getMesEscolhido().getFestivais();

        TextView mes = (TextView) findViewById(R.id.festivais);
        mes.setText(mApp.getMesEscolhido().getNome());

        for (final Festival f: festivais){

            Button bt = new Button(this);
            bt.setWidth(500);
            bt.setTextColor(Color.WHITE);
            bt.setBackgroundResource(R.drawable.button);
            bt.setText(f.getNome());
            LinearLayout.LayoutParams ll = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            ll.setMargins(10, 10, 10, 10);
            bt.setLayoutParams(ll);

            bt.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    mApp.setFestivalEscolhido(f);
                    Intent fest = new Intent(AvMesPerfil.this, AvFestivalPerfil.class);
                    startActivity(fest);
                }
            });


            ld.addView(bt);

        }

        /*
        for (int i = 0; i< AvCronoMeses.fests[AvCronoMeses.choice].length; i++){

            lb[i] = new Button(this);
            lb[i].setText(AvCronoMeses.fests[AvCronoMeses.choice][i]);
            ld.addView(lb[i]);

            lb[i].setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));

            lb[i].setWidth(500);

        }
        */

    }

}
