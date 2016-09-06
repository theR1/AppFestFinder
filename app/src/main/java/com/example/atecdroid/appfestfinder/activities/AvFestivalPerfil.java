package com.example.atecdroid.appfestfinder.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atecdroid.appfestfinder.AppFest;
import com.example.atecdroid.appfestfinder.R;
import com.example.atecdroid.appfestfinder.modelo.Festival;
import com.example.atecdroid.appfestfinder.modelo.Mes;

import java.util.ArrayList;

public class AvFestivalPerfil extends BaseActivity {
    TextView mNomeFest, mDescFest, mDateFest, mPriceFest, mWebsiteFest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festdesc);

        mNomeFest = (TextView) findViewById(R.id.tv_FestName);
        mDescFest = (TextView) findViewById(R.id.tv_Description);
        mDateFest = (TextView) findViewById(R.id.tv_Date);
        mPriceFest = (TextView) findViewById(R.id.tv_Prices);
        mWebsiteFest = (TextView) findViewById(R.id.tv_Website);

        mNomeFest.setText(mApp.getFestivalEscolhido().getNome());
        mDescFest.setText(mApp.getFestivalEscolhido().getDescription());
        mDateFest.setText(mApp.getFestivalEscolhido().getDate());
        mPriceFest.setText(mApp.getFestivalEscolhido().getPrice());
        mWebsiteFest.setText(mApp.getFestivalEscolhido().getWebsite());


        ImageView j = (ImageView) findViewById(R.id.logoView);
        String img = mApp.getFestivalEscolhido().getImg();
        int id = getResources().getIdentifier(img, "drawable", getPackageName());
        Drawable drawable = getResources().getDrawable(id);
        j.setBackground(drawable);

    }

    public void cartazOnClick(View v){

        Intent j = new Intent(this, AvCartaz.class);
        startActivity(j);

    }


}
