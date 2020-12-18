package com.lcw.ex85firebasechatting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderListActivity extends AppCompatActivity {

    private static String state = "신청대기중";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("주문내역");

        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.textView8);
        textView.setText("승인대기중");
        if ( G.nickName.equals("Jaehui") ){
            Button button1 = findViewById(R.id.button5);
            Button button2 = findViewById(R.id.button6);
            Button button3 = findViewById(R.id.button7);
            Button button4 = findViewById(R.id.button8);
            button1.setVisibility(View.GONE);
            button2.setVisibility(View.GONE);
            button3.setVisibility(View.GONE);
            button4.setVisibility(View.GONE);
            if ( OrderSuccessActivity.getState().equals("승인대기중") ){
                OrderSuccessActivity.setState("거래완료");
            }else{
                textView.setText("거래완료");
                button4.setVisibility(View.VISIBLE);
            }
        }else if ( G.nickName.equals("Seungchan") ){
            Button button3 = findViewById(R.id.button7);
            Button button4 = findViewById(R.id.button8);
            button3.setVisibility(View.GONE);
            button4.setVisibility(View.GONE);
        }
    }

    public static String getState(){
        return state;
    }

    public void clickAccept(View view){
        TextView textView = findViewById(R.id.textView8);
        textView.setText("거래중");
        state = (String) textView.getText();
        Button button1 = findViewById(R.id.button5);
        Button button2 = findViewById(R.id.button6);
        Button button3 = findViewById(R.id.button7);
        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.VISIBLE);
    }

    public void clickReject(View view){
        TextView textView = findViewById(R.id.textView8);
        textView.setText("거래취소");
        state = (String) textView.getText();
        Button button1 = findViewById(R.id.button5);
        Button button2 = findViewById(R.id.button6);
        Button button3 = findViewById(R.id.button7);
        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);
    }

    public void clickEnd(View view){
        TextView textView = findViewById(R.id.textView8);
        textView.setText("거래완료");
        state = (String) textView.getText();
        Button button3 = findViewById(R.id.button7);
        Button button4 = findViewById(R.id.button8);
        button3.setVisibility(View.GONE);
        button4.setVisibility(View.VISIBLE);
    }

    public void clickEval(View view){
        Intent intent= new Intent(this, EvaluationActivity.class);
        startActivity(intent);
        finish();
    }
}