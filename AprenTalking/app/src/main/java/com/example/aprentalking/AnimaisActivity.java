package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AnimaisActivity extends AppCompatActivity {

    ImageButton VoltarAnimais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais);


        VoltarAnimais = findViewById(R.id.VoltarAnimais);

        VoltarAnimais.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltar);
            }
        });

    }
}