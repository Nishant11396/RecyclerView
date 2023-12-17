package com.example.recyclerview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclersecondActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclersecond);
        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView4);


        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("imG",0));
        textView.setText(intent.getStringExtra("txT"));
        textView2.setText(intent.getStringExtra("txTT"));



    }
}