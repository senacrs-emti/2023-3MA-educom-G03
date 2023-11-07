package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CoresActivity extends AppCompatActivity {

        ImageButton voltar_azul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cores);


        voltar_azul = findViewById(R.id.voltar_azul);

        voltar_azul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltar);
            }
        });



    }
}