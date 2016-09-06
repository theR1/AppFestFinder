package com.example.atecdroid.appfestfinder.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.atecdroid.appfestfinder.R;

public class AvLandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

    }

    public void onClick (View v){

        Intent crono = new Intent(AvLandingPage.this, AvCronoMeses.class);
        startActivity(crono);

    }
}
