package com.lcw.ex85firebasechatting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EvaluationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("KNU RUN");
    }

    public void clickReturn(View view){
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);
        finish();
    }

    public void clickOK(View view){
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
        finish();
    }
}