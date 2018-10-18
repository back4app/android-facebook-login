package com.example.back4app.facebookloginexample;

import com.parse.Parse;
import com.parse.facebook.ParseFacebookUtils;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                // if desired
                .clientKey(getString(R.string.back4app_client_key))
                .server("https://parseapi.back4app.com/")
                .build()
        );

        ParseFacebookUtils.initialize(this);
    }
}
