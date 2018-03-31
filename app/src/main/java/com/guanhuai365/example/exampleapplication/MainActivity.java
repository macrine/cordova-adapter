package com.guanhuai365.example.exampleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.guanhuai365.ttgh_web_loader.WebActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_open=findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello ", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                startActivity(intent);
            }
        });
    }
}
