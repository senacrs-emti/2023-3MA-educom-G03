package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class alfabetoActivity2 extends AppCompatActivity {

    /* O problema tá aqui tbm */

    ImageButton voltarAlfabeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto2);

    findViewById(R.id.voltarAlfabeto);

/* O problema tá aqui, refazer amanhã */
    voltarAlfabeto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent back = new Intent(getApplicationContext(),alfabetoActivity1.class);
            startActivity(back);
        }
    });




    }
}