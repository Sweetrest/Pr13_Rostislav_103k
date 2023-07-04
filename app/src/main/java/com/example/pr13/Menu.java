package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    ImageButton imbt1, imbt2, imbt3, imbt4;
    ImageView avatar,menu,acc,logo,logo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        logo=findViewById(R.id.viewlogo);
        logo.setOnClickListener(this);
        logo1=findViewById(R.id.imageView22);
        logo1.setOnClickListener(this);
        acc=findViewById(R.id.imageacc);
        acc.setOnClickListener(this);
        avatar=findViewById(R.id.viewava);
        avatar.setOnClickListener(this);
        menu=findViewById(R.id.viewmenu);
        menu.setOnClickListener(this);
        imbt1=findViewById(R.id.imageButton);
        imbt1.setOnClickListener(this);
        imbt2=findViewById(R.id.imageButton5);
        imbt2.setOnClickListener(this);
        imbt3=findViewById(R.id.imageButton6);
        imbt3.setOnClickListener(this);
        imbt4=findViewById(R.id.imageButton9);
        imbt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton:
                Toast.makeText(this, "Спокойным", Toast.LENGTH_SHORT).show(); break;
            case R.id.imageButton5:
                Toast.makeText(this, "Расслабленным", Toast.LENGTH_SHORT).show(); break;
            case R.id.imageButton6:
                Toast.makeText(this, "Сосредоточенным", Toast.LENGTH_SHORT).show(); break;
            case R.id.imageButton9:
                Toast.makeText(this, "Взволнованным", Toast.LENGTH_SHORT).show(); break;
            case R.id.viewmenu:
                Intent intent = new Intent(this,Notmenu.class);
                startActivity(intent);break;
            case R.id.viewava:
            case R.id.imageacc:
                Intent intent1 = new Intent(this,Accounts.class);
                startActivity(intent1);break;
            case R.id.viewlogo:
            case R.id.imageView22:
                Intent intent2 = new Intent(this,Onboarding.class);
                startActivity(intent2);break;
        }
    }
}