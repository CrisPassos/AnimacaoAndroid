package com.example.rm31456.animacaoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtLogin, edtSenha;
    Animation animacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void conectar(View v){
        edtLogin = (EditText) findViewById(R.id.edLogin);
        edtSenha = (EditText) findViewById(R.id.edSenha);

        if (!edtLogin.equals("admin") && !edtSenha.equals("123")){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }else{
            animacao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash);
            edtLogin.startAnimation(animacao);
            edtSenha.startAnimation(animacao);
        }

    }
}
