package com.example.beta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Layout layout;
    private ImageView logo;
    private View view;
    private ImageView ImageView;

    Animation animFade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo=(ImageView) findViewById(R.id.logo);
        final ImageView bgImage=(ImageView) findViewById(R.id.signin);


        animFade = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.item_fall_down );
        animFade.setInterpolator(new LinearInterpolator());
        animFade.setRepeatCount(Animation.INFINITE);
        animFade.setDuration(2000);
        logo.startAnimation(animFade);
        new Runnable() {
            int updateInterval = 3000; //=one second

            @Override
            public void run() {

                // Any code which goes here will be executed every 'updateInterval'
                // change your background here

                bgImage.postDelayed(this, updateInterval);
            }
        }.run();
    }
}
