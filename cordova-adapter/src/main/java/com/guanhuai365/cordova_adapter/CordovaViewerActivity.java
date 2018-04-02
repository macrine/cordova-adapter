package com.guanhuai365.cordova_adapter;

import android.content.Intent;
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

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        if(url==null){
            loadUrl(launchUrl);
        } else {
            loadUrl(url);
        }

        // Set by <content src="index.html" /> in config.xml
//        loadUrl(launchUrl);
//        loadUrl("https://www.guanhuai365.com/testapp/tmp_embed_test");
    }
}
