package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntela2,btntela3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btntela2 = findViewById(R.id.btntela2);
    btntela3 = findViewById(R.id.btntela3);

        btntela2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tela2 = new Intent(getApplicationContext(),FrutasActivity.class);
            startActivity(tela2);
        }
    });


        btntela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela3 = new Intent(getApplicationContext(),CoresActivity.class);
                startActivity(tela3);
            }
        });

    }
}