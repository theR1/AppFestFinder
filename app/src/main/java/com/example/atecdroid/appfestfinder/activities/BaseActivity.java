package com.example.atecdroid.appfestfinder.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.atecdroid.appfestfinder.AppFest;

/**
 * Created by atecdroid on 7/28/16.
 */
public class BaseActivity extends Activity {
    protected AppFest mApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mApp = (AppFest) getApplication();

    }
}
