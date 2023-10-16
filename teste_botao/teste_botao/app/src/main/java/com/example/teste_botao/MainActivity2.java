package com.example.teste_botao;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;



public class MainActivity2 extends AppCompatActivity {

    private SoundPool soundPool;
    private int audio1,audio2,audio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
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
        }else{                     //numero de audios
            soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC,0);
        }

        audio1 = soundPool.load(this,R.raw.audio1,1);
        audio2 = soundPool.load(this,R.raw.audio2,1);
        audio3 = soundPool.load(this,R.raw.audio3,1);

        public void playSound(View v)
        {
            switch (v.getId()){
                case R.id.button:
                    soundPool.play(audio1,1,1,0,0,1);
                    break;
                case R.id.button2:
                    soundPool.play(audio2,1,1,0,0,1);
                    break;
                case R.id.button3:
                    soundPool.play(audio3,1,1,0,0,1);
                    break;

            }
        }

        @Override
        protected void onDestroy(){
            super.onDestroy();
            soundPool.release();
            soundPool = null;
        }


    }
}