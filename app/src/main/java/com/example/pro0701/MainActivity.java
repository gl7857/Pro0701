package com.example.pro0701;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
   ImageButton imageB;

    ImageView imageV;

    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageB = findViewById(R.id.imageB);
        imageV= findViewById(R.id.imageV);

    }
    public void clicked(View view) {
        Random rnd = new Random();
        num= rnd.nextInt(3)+1;
        if (num==1){
            imageB.setImageResource(R.drawable.imn1);
            imageV.setImageResource(R.drawable.image01);
        }
        if (num==2){
            imageB.setImageResource(R.drawable.imn2);
            imageV.setImageResource(R.drawable.image02);
        }
        if (num==3){
            imageB.setImageResource(R.drawable.imn3);
            imageV.setImageResource(R.drawable.image03);
        }
    }
}