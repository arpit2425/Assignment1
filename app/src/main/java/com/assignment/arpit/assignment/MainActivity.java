package com.assignment.arpit.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<listItem> listItems;
    Random r=new Random();
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            listItem listItem=new listItem("User "+(i+1),(10+r.nextInt(30)));
            listItems.add(listItem);

        }



        adapter=new MyAdaptor(listItems,this);
        recyclerView.setAdapter(adapter);
    }
}
