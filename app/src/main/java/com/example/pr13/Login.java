package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Login extends AppCompatActivity implements View.OnClickListener {
Button signIn;
Button Profile;
ImageView logo;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logo=findViewById(R.id.imageView);
        logo.setOnClickListener(this);
        signIn=findViewById(R.id.sign_in);
        signIn.setOnClickListener(this);
        Profile=findViewById(R.id.btnProfile);
        Profile.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.sign_in:
        case R.id.btnProfile:
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
            break;
        case R.id.imageView:
            Intent intent1 = new Intent(this,Onboarding.class);
            startActivity(intent1);break;
    }
    }
}
