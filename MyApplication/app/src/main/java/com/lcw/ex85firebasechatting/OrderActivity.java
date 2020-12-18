package com.lcw.ex85firebasechatting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("주문하기");

        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void clickOrder(View view){
        Intent intent= new Intent(this, OrderSuccessActivity.class);
        startActivity(intent);
        finish();
    }
}