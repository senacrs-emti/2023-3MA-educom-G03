package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class alfabetoActivity1 extends AppCompatActivity {

    ImageButton voltarbtnAlfabeto,ir_alfabeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto1);

        voltarbtnAlfabeto = findViewById(R.id.voltarbtnAlfabeto);

        voltarbtnAlfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltar);
            }
        });

        ir_alfabeto = findViewById(R.id.ir_alfabeto);
        ir_alfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alfabeto2 = new Intent(getApplicationContext(),alfabetoActivity2.class);
                startActivity(alfabeto2);
            }
        });



    }
}