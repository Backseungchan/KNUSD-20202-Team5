package com.lcw.ex85firebasechatting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderSuccessActivity extends AppCompatActivity {

    private static String state = "text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_success);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("주문완료");

        TextView textView = findViewById(R.id.textView8);
        if ( textView.getText().equals("text") ){
            textView.setText("승인대기중");
            state = (String) textView.getText();
        }
        if ( !OrderListActivity.getState().equals("신청대기중") ){
            state = OrderListActivity.getState();
        }
    }

    public static String getState(){
        return state;
    }

    public void clickBtn3(View view){
        Intent intent= new Intent(this, ChatActivity.class);
        startActivity(intent);
        finish();
    }
}