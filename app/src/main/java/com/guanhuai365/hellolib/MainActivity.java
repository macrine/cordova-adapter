package com.guanhuai365.hellolib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guanhuai365.cordova_adapter.CordovaViewerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CordovaViewerActivity.class);
//                intent.putExtra("url","https://www.guanhuai365.com/testapp/tmp_embed_test");
                startActivity(intent);
            }
        });
    }
}
