package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Description> usersList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        usersList = new ArrayList<>();

        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(usersList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void setUserInfo() {
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","1"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","2"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","3"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","4"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","5"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","6"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","7"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","8"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","9"));
            usersList.add(new Description("Заголовок","Заголовок","10.05.2021","10"));
    }
}