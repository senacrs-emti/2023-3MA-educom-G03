package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CoresActivity extends AppCompatActivity {

        ImageButton voltar_azul;
        private SoundPool soundPool;
        private int red,purple,green,yellow,blue,orange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cores);


        voltar_azul = findViewById(R.id.voltar_azul);

        voltar_azul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(voltar);
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes
                    .Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool
                    .Builder()
                    .setMaxStreams(3)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        }

        red = soundPool.load(this, R.raw.red, 1);
        blue = soundPool.load(this, R.raw.blue, 1);
        yellow= soundPool.load(this, R.raw.yellow, 1);
        orange = soundPool.load(this, R.raw.orange, 1);
        purple = soundPool.load(this, R.raw.purple, 1);
        green = soundPool.load(this, R.raw.green, 1);

        findViewById(R.id.btn_vermelho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(red);
            }
        });
        findViewById(R.id.btn_azul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(blue);
            }
        });

        findViewById(R.id.btn_roxo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(purple);
            }
        });

        findViewById(R.id.btn_laranja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(orange);
            }
        });

        findViewById(R.id.btn_verde).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(green);
            }
        });

        findViewById(R.id.btn_amarelo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(yellow);
            }
        });


    }
        private void playSound(int audioId) {
            soundPool.play(audioId, 1, 1, 0, 0, 1);
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            soundPool.release();
            soundPool = null;
        }
    }


