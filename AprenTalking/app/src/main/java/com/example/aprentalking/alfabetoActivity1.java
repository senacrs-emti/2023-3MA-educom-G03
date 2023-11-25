package com.example.aprentalking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class alfabetoActivity1 extends AppCompatActivity {

    ImageButton voltarbtnAlfabeto;
    private SoundPool soundPool;
    private int letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterQ, letterR, letterS, letterT, letterU, letterV, letterW, letterX, letterY, letterZ;


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

        letterA = soundPool.load(this, R.raw.lettera, 1);
        letterB = soundPool.load(this, R.raw.letterb, 1);
        letterC= soundPool.load(this, R.raw.letterc, 1);
        letterD = soundPool.load(this, R.raw.letterd, 1);
        letterE = soundPool.load(this, R.raw.lettere, 1);
        letterF = soundPool.load(this, R.raw.letterf, 1);
        letterG = soundPool.load(this, R.raw.letterg, 1);
        letterH = soundPool.load(this, R.raw.letterh, 1);
        letterI= soundPool.load(this, R.raw.letteri, 1);
        letterJ = soundPool.load(this, R.raw.letterj, 1);
        letterK = soundPool.load(this, R.raw.letterk, 1);
        letterL = soundPool.load(this, R.raw.letterl, 1);
        letterM = soundPool.load(this, R.raw.letterm, 1);
        letterN = soundPool.load(this, R.raw.lettern, 1);
        letterO= soundPool.load(this, R.raw.lettero, 1);
        letterP = soundPool.load(this, R.raw.letterp, 1);
        letterQ = soundPool.load(this, R.raw.letterq, 1);
        letterR = soundPool.load(this, R.raw.letterr, 1);
        letterS = soundPool.load(this, R.raw.letters, 1);
        letterT = soundPool.load(this, R.raw.lettert, 1);
        letterU = soundPool.load(this, R.raw.letteru, 1);
        letterV = soundPool.load(this, R.raw.letterv, 1);
        letterW = soundPool.load(this, R.raw.letterw, 1);
        letterX = soundPool.load(this, R.raw.letterx, 1);
        letterY = soundPool.load(this, R.raw.lettery, 1);
        letterZ = soundPool.load(this, R.raw.letterz, 1);

        findViewById(R.id.Abtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterA);
            }
        });
        findViewById(R.id.Bbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterB);
            }
        });
        findViewById(R.id.Cbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterC);
            }
        });

        findViewById(R.id.Dbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterD);
            }
        });
        findViewById(R.id.Ebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterE);
            }
        });
        findViewById(R.id.Fbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterF);
            }
        });

        findViewById(R.id.Gbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterG);
            }
        });
        findViewById(R.id.Hbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterH);
            }
        });
        
        findViewById(R.id.Ibtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterI);
            }
        });

        findViewById(R.id.Jbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterJ);
            }
        });

        findViewById(R.id.Kbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterK);
            }
        });

        findViewById(R.id.Lbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterL);
            }
        });

        findViewById(R.id.Mbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterM);
            }
        });
        findViewById(R.id.Nbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterN);
            }
        });
        findViewById(R.id.Obtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterO);
            }
        });

        findViewById(R.id.Pbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterP);
            }
        });


        findViewById(R.id.Qbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterQ);
            }
        });
        findViewById(R.id.Rbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterR);
            }
        });
        findViewById(R.id.Sbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterS);
            }
        });
        findViewById(R.id.Tbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterT);
            }
        });
        findViewById(R.id.Ubtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterU);
            }
        });
        findViewById(R.id.Vbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterV);
            }
        });
        findViewById(R.id.Wbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterW);
            }
        });
        findViewById(R.id.Xbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterX);
            }
        });
        findViewById(R.id.Ybtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterY);
            }
        });
        findViewById(R.id.Zbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(letterZ);
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


