package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Accounts extends AppCompatActivity implements View.OnClickListener{
ImageView menu,logo,logo1;
TextView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        logo=findViewById(R.id.imageView6);
        logo.setOnClickListener(this);
        logo1=findViewById(R.id.imageView24);
        logo1.setOnClickListener(this);
        menu=findViewById(R.id.imageView5);
        menu.setOnClickListener(this);
        exit=findViewById(R.id.textView18);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView5:
                Intent intent = new Intent(this,Notmenu.class);
                startActivity(intent);break;
            case R.id.textView18:
                Intent intent1= new Intent(this,Login.class);
                startActivity(intent1);break;
            case R.id.imageView6:
            case R.id.imageView24:
                Intent intent2 = new Intent(this,Onboarding.class);
                startActivity(intent2);break;
        }
    }
}