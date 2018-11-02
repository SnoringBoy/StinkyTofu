package com.example.kota.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class guestActivity extends AppCompatActivity{

    private TextView mTextMessage;
    ListView listView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_items:
                    return true;
                case R.id.navigation_home:
                    finish();
                    return true;

                case R.id.navigation_purchase:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        mTextMessage = (TextView) findViewById(R.id.message);

        listView = (ListView) findViewById(R.id.myListView);

        ArrayList<item> list = new ArrayList<item>();
        addItem(list);
        MyAdapter myAdapter = new MyAdapter(this, 0, list);

        listView.setAdapter(myAdapter);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void addItem(ArrayList<item> list){
        item Item = new item();
        Item.setName("Stinky Tohu");
        Item.setPrice(3.00);
        list.add(Item);
        item Item2 = new item();
        Item2.setName("Stinky Tohu with Soda");
        Item2.setPrice(5.00);
        list.add(Item2);
        item Item3 = new item();
        Item3.setName("Stinky Tohu with Coffee");
        Item3.setPrice(5.00);
        list.add(Item3);

    }

//    public void onClick(View view){
//        switch (view.getId()){
//            case R.id.navigation_home:
//                finish();
//                break;
//        }
//    }
}
