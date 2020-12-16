package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BoardActivity extends AppCompatActivity {

//    private ListView listView;
//    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);


//        //Adapter 생성
//        adapter = new ListViewAdapter();
//
//        //리스트뷰 참조 및 Adapter 달기
//        listView = (ListView)findViewById((R.id.listview));
//        listView.setAdapter(adapter);
//
//        adapter.addItem("제목1",R.drawable.mark,"내용1");
//        adapter.addItem("제목2",R.drawable.mark,"내용2");
//
//        adapter.notifyDataSetChanged();
    }
}