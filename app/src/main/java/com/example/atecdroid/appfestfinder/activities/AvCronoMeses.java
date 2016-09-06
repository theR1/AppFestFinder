package com.example.atecdroid.appfestfinder.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.atecdroid.appfestfinder.AppFest;
import com.example.atecdroid.appfestfinder.R;
import com.example.atecdroid.appfestfinder.modelo.Mes;

import java.util.ArrayList;


public class AvCronoMeses extends AppCompatActivity {

    int ct = 0;
    static int choice = 0;
    //Boolean [] qual = new Boolean[str.length];

    Button[] bt;
    TextView lb_fest;
    AppFest mApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crono_meses);

        mApp = (AppFest) getApplication();
        bt = new Button[mApp.getMeses().size()];
        LinearLayout ld = (LinearLayout) findViewById(R.id.id_linear);

        ArrayList<Mes> meses = mApp.getMeses();

        lb_fest = new TextView(this);
        lb_fest.setText("Fest Finder");

        for (final Mes m : meses) {
            Button bt = new Button(this);
            bt.setWidth(500);
            bt.getBackground();
            bt.setBackgroundResource(R.drawable.button);
            bt.setText(m.getNome());
            LinearLayout.LayoutParams ll = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            ll.setMargins(10, 10, 10, 10);
            bt.setLayoutParams(ll);
            bt.setTextColor(Color.WHITE);

            bt.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    //   Toast.makeText(AvCronoMeses.this, "" + m.getNome(), Toast.LENGTH_SHORT).show();
                    mApp.setMesEscolhido(m);
                    Intent mes = new Intent(AvCronoMeses.this, AvMesPerfil.class);
                    startActivity(mes);

                }
            });


            ld.addView(bt);

        }

    }

}



