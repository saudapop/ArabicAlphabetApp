package com.example.sahmed.ArabicAlphabetApp;

import android.content.DialogInterface;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.view.View;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.example.sahmed.test.R;



public class AlphabetPage extends AppCompatActivity {
    private SoundPool soundPool;

    ImageButton playAlif, playBaa, playTaa, playThaa, playJeem, playHhaa, playKhaa, playDaal, playThdaal
            , playRaaw, playZaa, playSeen, playSheen, playSawwd, playDawwd, playThaww, playThdaww
            , playEyeen, playGhyeen, playFaa, playQaaf, playKaaf, playLaam, playMeem, playNoon, playWaow
            , playHaa, playHamza, playYaa;

    private int alif, baa, taa, thaa, jeem, hhaa, khaa, daal, thdaal, raaw, zaa, seen, sheen, sawwd,
            dawwd, thaww, thdaww, eyeen, ghyeen, faa, qaaf, kaaf, laam, meem, noon, waow, haa, hamza, yaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.alphabet_page);
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(AlphabetPage.this);

        alertBuilder.setPositiveButton("I'm ready!!!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
        AlertDialog alert = alertBuilder.create();
        alert.setMessage("Are you ready? \n\nTouch a letter to hear it's pronunciation!");
        alert.show();
        final Animation animPopOut = AnimationUtils.loadAnimation(this, R.anim.letter_pop);


        createSoundPool();

        playAlif = (ImageButton) this.findViewById(R.id.alif);
        playAlif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animPopOut);
                soundPool.play(alif, 1, 1, 1, 0, 1);
            }
        });

        playBaa = (ImageButton) this.findViewById(R.id.baa);
        playBaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animPopOut);
                soundPool.play(baa, 1, 1, 1, 0, 1);
            }
        });

        playTaa = (ImageButton) this.findViewById(R.id.taa);
        playTaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animPopOut);
                soundPool.play(taa, 1, 1, 1, 0, 1);
            }
        });

        final MediaPlayer thaaSoundMP = MediaPlayer.create(this, R.raw.thaa);

        playThaa = (ImageButton) this.findViewById(R.id.thaa);
        playThaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animPopOut);
                soundPool.play(thaa, 1, 1, 1, 0, 1);
            }
        });


        playJeem = (ImageButton) this.findViewById(R.id.jeem);
        playJeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animPopOut);
                soundPool.play(jeem, 1, 1, 1, 0, 1);
            }
        });

        playKhaa = (ImageButton) this.findViewById(R.id.khaa);
        playKhaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animPopOut);
                soundPool.play(khaa, 1, 1, 1, 0, 1);
            }
        });

        playHhaa = (ImageButton) this.findViewById(R.id.hhaa);
        playHhaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(hhaa, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playDaal = (ImageButton) this.findViewById(R.id.daal);
        playDaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(daal, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);

            }
        });
        playThdaal = (ImageButton) this.findViewById(R.id.thdaal);
        playThdaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(thdaal, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);

            }
        });
        playRaaw = (ImageButton) this.findViewById(R.id.raaw);
        playRaaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(raaw, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playZaa= (ImageButton) this.findViewById(R.id.zaa);
        playZaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(zaa, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playSeen= (ImageButton) this.findViewById(R.id.seen);
        playSeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(seen, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playSheen= (ImageButton) this.findViewById(R.id.sheen);
        playSheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sheen, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playSawwd= (ImageButton) this.findViewById(R.id.sawwd);
        playSawwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sawwd, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playDawwd= (ImageButton) this.findViewById(R.id.dawwd);
        playDawwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(dawwd, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playThaww= (ImageButton) this.findViewById(R.id.thaww);
        playThaww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(thaww, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playThdaww= (ImageButton) this.findViewById(R.id.thdaww);
        playThdaww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(thdaww, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playEyeen= (ImageButton) this.findViewById(R.id.eyeen);
        playEyeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(eyeen, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playGhyeen= (ImageButton) this.findViewById(R.id.ghyeen);
        playGhyeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(ghyeen, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playFaa= (ImageButton) this.findViewById(R.id.faa);
        playFaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(faa, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playQaaf= (ImageButton) this.findViewById(R.id.qaaf);
        playQaaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(qaaf, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playKaaf= (ImageButton) this.findViewById(R.id.kaaf);
        playKaaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(kaaf, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playLaam= (ImageButton) this.findViewById(R.id.laam);
        playLaam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(laam, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playMeem= (ImageButton) this.findViewById(R.id.meem);
        playMeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(meem, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playNoon= (ImageButton) this.findViewById(R.id.noon);
        playNoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noon, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playWaow= (ImageButton) this.findViewById(R.id.waow);
        playWaow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(waow, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playHaa= (ImageButton) this.findViewById(R.id.haa);
        playHaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(haa, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playHamza= (ImageButton) this.findViewById(R.id.hamza);
        playHamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(hamza, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });

        playYaa= (ImageButton) this.findViewById(R.id.yaa);
        playYaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(yaa, 1, 1, 1, 0, 1);
                v.startAnimation(animPopOut);
            }
        });
        
    }
    

    private void createSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(1)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }
        alif = soundPool.load(this, R.raw.alif, 1);
        baa = soundPool.load(this, R.raw.baa, 1);
        taa = soundPool.load(this, R.raw.taa, 1);
        thaa = soundPool.load(this, R.raw.thaa, 1);
        jeem = soundPool.load(this, R.raw.jeem, 1);
        hhaa = soundPool.load(this, R.raw.hhaa, 1);
        khaa = soundPool.load(this, R.raw.khaa, 1);
        daal = soundPool.load(this, R.raw.daal, 1);
        thdaal = soundPool.load(this, R.raw.thdaal, 1);
        raaw = soundPool.load(this, R.raw.raaw, 1);
        zaa = soundPool.load(this, R.raw.zaa, 1);
        seen = soundPool.load(this, R.raw.seen, 1);
        sheen = soundPool.load(this, R.raw.sheen, 1);
        sawwd = soundPool.load(this, R.raw.sawwd, 1);
        dawwd = soundPool.load(this, R.raw.dawwd, 1);
        thaww = soundPool.load(this, R.raw.thaww, 1);
        thdaww = soundPool.load(this, R.raw.thdaww, 1);
        eyeen = soundPool.load(this, R.raw.eyeen, 1);
        ghyeen = soundPool.load(this, R.raw.ghyeen, 1);
        faa = soundPool.load(this, R.raw.faa, 1);
        qaaf = soundPool.load(this, R.raw.qaaf, 1);
        kaaf = soundPool.load(this, R.raw.kaaf, 1);
        laam = soundPool.load(this, R.raw.laam, 1);
        meem = soundPool.load(this, R.raw.meem, 1);
        noon = soundPool.load(this, R.raw.noon, 1);
        waow = soundPool.load(this, R.raw.waow, 1);
        haa = soundPool.load(this, R.raw.haa, 1);
        hamza = soundPool.load(this, R.raw.hamza, 1);
        yaa = soundPool.load(this, R.raw.yaa, 1);
    }


}



