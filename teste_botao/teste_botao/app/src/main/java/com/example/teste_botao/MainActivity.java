package com.example.teste_botao;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_som, btn_som2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_som = findViewById(R.id.btn_som);
        btn_som2 = findViewById(R.id.btn_som2);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.audio_apple);

        btn_som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
}