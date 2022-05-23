package com.example.policesirensapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class activity_sirens extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirens);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdView myAdView2 = findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        myAdView2.loadAd(adRequest2);



        final MediaPlayer ponesound = MediaPlayer.create(this, R.raw.p1normal);
        ImageButton ponebutton = (ImageButton) this.findViewById(R.id.pone);
        ponebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ponesound.isPlaying()){
                    ponesound.pause();
                } else {
                    ponesound.start();
                }
            }

        });

        final MediaPlayer ptwosound = MediaPlayer.create(this, R.raw.p2slow);
        ImageButton ptwobutton = (ImageButton) this.findViewById(R.id.ptwo);
        ptwobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptwosound.isPlaying()){
                    ptwosound.pause();
                } else {
                    ptwosound.start();
                }            }
        });

        final MediaPlayer pthreesound = MediaPlayer.create(this, R.raw.p3european);
        ImageButton pthreebutton = (ImageButton) this.findViewById(R.id.pthree);
        pthreebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pthreesound.isPlaying()){
                    pthreesound.pause();
                } else {
                    pthreesound.start();
                }            }
        });







        final MediaPlayer fonesound = MediaPlayer.create(this, R.raw.f1firetruck);
        ImageButton fonebutton = (ImageButton) this.findViewById(R.id.fone);
        fonebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fonesound.isPlaying()){
                    fonesound.pause();
                } else {
                    fonesound.start();
                }
            }

        });

        final MediaPlayer ftwosound = MediaPlayer.create(this, R.raw.f2sirenhonk);
        ImageButton ftwobutton = (ImageButton) this.findViewById(R.id.ftwo);
        ftwobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ftwosound.isPlaying()){
                    ftwosound.pause();
                } else {
                    ftwosound.start();
                }            }
        });

        final MediaPlayer fthreesound = MediaPlayer.create(this, R.raw.f3ambulance);
        ImageButton fthreebutton = (ImageButton) this.findViewById(R.id.fthree);
        fthreebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fthreesound.isPlaying()){
                    fthreesound.pause();
                } else {
                    fthreesound.start();
                }            }
        });





        final MediaPlayer monesound = MediaPlayer.create(this, R.raw.m1airhorn);
        ImageButton monebutton = (ImageButton) this.findViewById(R.id.mone);
        monebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(monesound.isPlaying()){
                    monesound.pause();
                } else {
                    monesound.start();
                }
            }

        });

        final MediaPlayer mtwosound = MediaPlayer.create(this, R.raw.m2burglaralarm);
        ImageButton mtwobutton = (ImageButton) this.findViewById(R.id.mtwo);
        mtwobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mtwosound.isPlaying()){
                    mtwosound.pause();
                } else {
                    mtwosound.start();
                }            }
        });

        final MediaPlayer mthreesound = MediaPlayer.create(this, R.raw.m3apocalypse);
        ImageButton mthreebutton = (ImageButton) this.findViewById(R.id.mthree);
        mthreebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mthreesound.isPlaying()){
                    mthreesound.pause();
                } else {
                    mthreesound.start();
                }            }
        });


    }
}
