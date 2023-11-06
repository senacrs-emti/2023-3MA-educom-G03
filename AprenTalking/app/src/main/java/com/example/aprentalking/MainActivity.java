package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton MainButton,MainButton2,MainButton3,MainButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainButton = findViewById(R.id.MainButton);
        MainButton2 = findViewById(R.id.MainButton2);
        MainButton3 = findViewById(R.id.MainButton3);
        MainButton4 = findViewById(R.id.MainButton4);

        MainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alfabeto = new Intent(getApplicationContext(),alfabetoActivity1.class);
                startActivity(alfabeto);
            }
        });

        MainButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cores = new Intent(getApplicationContext(),CoresActivity.class);
                startActivity(cores);
            }
        });

        MainButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animais = new Intent(getApplicationContext(),AnimaisActivity.class);
                startActivity(animais);
            }
        });

        MainButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frutas = new Intent(getApplicationContext(),FrutasActivity.class);
                startActivity(frutas);
            }
        });


    }
}