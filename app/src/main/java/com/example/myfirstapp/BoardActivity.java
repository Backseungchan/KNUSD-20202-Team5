package com.example.apptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BoardActivity extends AppCompatActivity {

    // Array of strings...
    String[] mobileArray = {"공대 9호관으로 커피갔다주실분","IT5호관으로 프린트해주실 분","복현우체국에 우편물 갔다주실 분","도서관에 책 대신 반납해주실 분",
            "프로그래밍 가르쳐주실 분","공대 9호관으로 커피갔다주실분","IT5호관으로 프린트해주실 분","복현우체국에 우편물 갔다주실 분","도서관에 책 대신 반납해주실 분",
            "프로그래밍 가르쳐주실 분","공대 9호관으로 커피갔다주실분","IT5호관으로 프린트해주실 분","복현우체국에 우편물 갔다주실 분","도서관에 책 대신 반납해주실 분",
            "프로그래밍 가르쳐주실 분"};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        adapter = new ArrayAdapter<String>(this, R.layout.list_view, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        //onItemClickListener를 추가
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BoardActivity.this, ViewActivity.class);
                startActivity(intent);

                //Toast.makeText(BoardActivity.this ,listView.get(position).getNickname(),Toast.LENGTH_LONG).show();
            }
        });

        ActionBar ab = getSupportActionBar();
        ab.hide();
    }

    public void onHomeButtonClicked(MenuItem mi){
        Intent intent = new Intent(BoardActivity.this, BoardActivity.class);
        startActivity(intent);
        finish();
    }

    public void onWritingButtonClicked(MenuItem mi){
        Intent intent = new Intent(BoardActivity.this, WriteActivity.class);
        startActivity(intent);
        finish();
    }

    public void onProfileButtonClicked(MenuItem mi){
        Intent intent = new Intent(BoardActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChatlistButtonClicked(MenuItem mi){
        Intent intent = new Intent(BoardActivity.this, ChatlistActivity.class);
        startActivity(intent);
        finish();
    }

    public void onSearchButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
        startActivity(intent);
        finish();
    }
}