package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class ChatlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatlist);
    }

    public void onHomeButtonClicked(MenuItem mi){
        Intent intent = new Intent(ChatlistActivity.this, BoardActivity.class);
        startActivity(intent);
        finish();
    }

    public void onWritingButtonClicked(MenuItem mi){
        Intent intent = new Intent(ChatlistActivity.this, WriteActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChatlistButtonClicked(MenuItem mi){
        Intent intent = new Intent(ChatlistActivity.this, ChatlistActivity.class);
        startActivity(intent);
        finish();
    }

    public void onProfileButtonClicked(MenuItem mi){
        Intent intent = new Intent(ChatlistActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
    }
}