package com.lionheart.newtest;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    int [] Images = new int[]{
            R.drawable.java ,
            R.drawable.javaee ,
            R.drawable.swift ,
            R.drawable.ajax ,
            R.drawable.html };

    ImageView imageView;
    int nCurImage = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view);
        imageView.setImageResource(Images[0]);
        DrawView drawView = new DrawView(this);
        drawView.setMinimumWidth(300);
        drawView.setMinimumHeight(500);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.layout_root);
        linearLayout.addView(drawView);
    }

    public void onClickBtnOk(View view)
    {
        Toast.makeText(getApplicationContext() , "Hello World" , Toast.LENGTH_SHORT).show();
    }

    public void onClickImageView(View view)
    {
        imageView.setImageResource(Images[++nCurImage%Images.length]);
    }
}
