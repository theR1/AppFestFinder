package com.example.atecdroid.appfestfinder.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.atecdroid.appfestfinder.R;

/**
 * Created by atecdroid on 7/29/16.
 */
public class AvCartaz extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartaz);


        ImageView j = (ImageView) findViewById(R.id.cartaz_img);
        String img = mApp.getFestivalEscolhido().getCartaz_img();
        int id = getResources().getIdentifier(img, "drawable", getPackageName());
        Drawable drawable = getResources().getDrawable(id);
        j.setBackground(drawable);

    }



}
