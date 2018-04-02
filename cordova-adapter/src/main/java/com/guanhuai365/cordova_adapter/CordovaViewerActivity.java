package com.guanhuai365.cordova_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class CordovaViewerActivity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_cordova_viewer);

        // enable Cordova apps to be started in the background
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);
//        loadUrl("https://www.guanhuai365.com/testapp/shangu_180319/");
    }
}
