package com.lcw.ex85firebasechatting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("프로필");

        actionBar.setDisplayHomeAsUpEnabled(true);

        if (G.nickName.equals("Seungchan")) {
            TextView name = findViewById(R.id.name);
            name.setText("Seungchan");
            ImageView profile = findViewById(R.id.profile);
            Drawable drawable = getResources().getDrawable(R.drawable.myprofile2);
            profile.setImageDrawable(drawable);
            TextView email = findViewById(R.id.email);
            email.setText("Seungchan98@knu.ac.kr");
        } else if (G.nickName.equals("Jaehui")) {
            TextView name = findViewById(R.id.name);
            name.setText("Jaehui");
            ImageView profile = findViewById(R.id.profile);
            Drawable drawable = getResources().getDrawable(R.drawable.myprofile);
            profile.setImageDrawable(drawable);
            TextView email = findViewById(R.id.email);
            email.setText("Jaehui98@knu.ac.kr");
            TextView textView = findViewById(R.id.textView);
            textView.setText("칭찬합니다!!");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("짱이에요~");
        }
    }

    public void clickBtn4(View view){
//        if ( G.nickName.equals("Jaehui")){
//            Intent intent = new Intent(this, OrderListJActivity.class);
//            startActivity(intent);
//        }else if ( G.nickName.equals("Seungchan")){
//            Intent intent= new Intent(this, OrderListJActivity.class);
//            startActivity(intent);
//        }
        Intent intent = new Intent(this, OrderListActivity.class);
        startActivity(intent);
    }
}