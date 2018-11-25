package com.example.sahmed.ArabicAlphabetApp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.sahmed.test.R;

public class MainActivity extends AppCompatActivity {

private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer salaamMP = MediaPlayer.create(this, R.raw.salaam);
        salaamMP.start();
        final MediaPlayer bismillahmMP = MediaPlayer.create(this, R.raw.bismillah);

        final Animation nextPagePop = AnimationUtils.loadAnimation(this, R.anim.nextpage_pop);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bismillahmMP.start();
                view.startAnimation(nextPagePop);

                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        openAlphabetPage();

                    }
                }, 50);
            }
        });
    }

    public void openAlphabetPage(){
        Intent intent = new Intent(this, AlphabetPage.class);
        startActivity(intent);

    }

}
