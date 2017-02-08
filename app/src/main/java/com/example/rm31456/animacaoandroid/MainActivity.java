package com.example.rm31456.animacaoandroid;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView)findViewById(R.id.ivQuadro);
        img.setBackgroundResource(R.drawable.quadro);
        AnimationDrawable frameAnimation = (AnimationDrawable)
                img.getBackground();
        frameAnimation.start();
    }
}
