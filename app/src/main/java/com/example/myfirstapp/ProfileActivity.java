package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void onWritingButtonClicked(MenuItem mi){
        Intent intent = new Intent(ProfileActivity.this, WriteActivity.class);
        startActivity(intent);
        finish();
    }

    public void onHomeButtonClicked(MenuItem mi){
        Intent intent = new Intent(ProfileActivity.this, BoardActivity.class);
        startActivity(intent);
        finish();
    }

    public void onProfileButtonClicked(MenuItem mi){
        Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
    }
}