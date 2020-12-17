package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
//        ActionBar ab = getSupportActionBar();
//        ab.hide();
    }

    public void onBackButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), com.example.apptest.BoardActivity.class);
        startActivity(intent);
    }

    public void onEditButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), EditActivity.class);
        startActivity(intent);
    }
}