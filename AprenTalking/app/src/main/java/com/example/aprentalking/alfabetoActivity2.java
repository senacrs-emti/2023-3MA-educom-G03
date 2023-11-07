package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class alfabetoActivity2 extends AppCompatActivity {

    ImageButton voltarbtnAlfabeto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto2);


        voltarbtnAlfabeto3 = findViewById(R.id.voltarbtnAlfabeto);

        voltarbtnAlfabeto3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),alfabetoActivity1.class);
                startActivity(voltar);
            }
        });



    }
}