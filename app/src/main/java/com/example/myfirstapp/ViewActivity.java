package com.example.apptest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
//        ActionBar ab = getSupportActionBar();
//        ab.hide();
    }

    public void onBackButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), BoardActivity.class);
        startActivity(intent);
    }
}