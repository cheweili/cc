package com.example.cofco.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AAAAAAAAAAAAAAAAAA
        initView();
    }

    private void initView() {
        imageView = new ImageView(this);

    }
}
