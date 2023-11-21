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

public class AnimaisActivity extends AppCompatActivity {

    ImageButton VoltarAnimais;
    private SoundPool soundPool;
    private int cavalo,coelho,galinha,ovelha,porco,vaca,chickens,cow,horse,pig,rabbit,sheep;



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

        cavalo = soundPool.load(this, R.raw.cavalo, 1);
        coelho = soundPool.load(this, R.raw.coelho, 1);
        galinha = soundPool.load(this, R.raw.galinha, 1);
        ovelha = soundPool.load(this, R.raw.ovelha, 1);
        porco = soundPool.load(this, R.raw.porco, 1);
        vaca = soundPool.load(this, R.raw.vaca, 1);

        horse = soundPool.load(this, R.raw.horse, 1);
        rabbit = soundPool.load(this, R.raw.rabbit, 1);
        chickens = soundPool.load(this, R.raw.chickens, 1);
        sheep = soundPool.load(this, R.raw.sheep, 1);
        pig = soundPool.load(this, R.raw.pig, 1);
        cow = soundPool.load(this, R.raw.cow, 1);

        findViewById(R.id.sheep_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(ovelha);
            }
        });
        findViewById(R.id.sheep_sound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(sheep);
            }
        });

        findViewById(R.id.horse_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(cavalo);
            }
        });
        findViewById(R.id.horse_sound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(horse);
            }
        });


        findViewById(R.id.pig_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(porco);
            }
        });
        findViewById(R.id.pig_sound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(pig);
            }
        });

        findViewById(R.id.chicken_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(galinha);
            }
        });
        findViewById(R.id.chicken_sound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(chickens);
            }
        });

        findViewById(R.id.cow_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(vaca);
            }
        });
        findViewById(R.id.cow_sound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(cow);
            }
        });


        findViewById(R.id.rabbit_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(coelho);
            }
        });
        findViewById(R.id.rabbit_sound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(rabbit);
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




