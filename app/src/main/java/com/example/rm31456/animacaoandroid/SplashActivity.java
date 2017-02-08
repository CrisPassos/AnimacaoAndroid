package com.example.rm31456.animacaoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtRitmo;
    Animation animacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txtRitmo = (TextView) findViewById(R.id.txtRitmo);
        animacao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash);
        txtRitmo.startAnimation(animacao);

        animacao.setAnimationListener(this);

    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
