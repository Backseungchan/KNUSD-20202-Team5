package com.example.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
    }

    public void onBackButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), BoardActivity.class);
        startActivity(intent);
    }
}