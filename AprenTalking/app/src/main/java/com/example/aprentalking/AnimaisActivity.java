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
    private int Chicken,Cow,Horse, Pig,Rabbit,Sheep,chickens,;



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

        Apple = soundPool.load(this, R.raw.apple, 1);
        Banana = soundPool.load(this, R.raw.banana, 1);
        Grape = soundPool.load(this, R.raw.grape, 1);
        Lemon = soundPool.load(this, R.raw.lemon, 1);
        Strawberry = soundPool.load(this, R.raw.strawberry, 1);
        Watermelon = soundPool.load(this, R.raw.watermelon, 1);

        findViewById(R.id.btn_apple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Apple);
            }
        });

        findViewById(R.id.btn_banana).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Banana);
            }
        });

        findViewById(R.id.btn_lemon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Lemon);
            }
        });
        findViewById(R.id.btn_strawberry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Strawberry);
            }
        });
        findViewById(R.id.btn_watermelon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Watermelon);
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




