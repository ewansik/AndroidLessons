package com.example.n551.alesson5.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;

import com.example.n551.alesson5.R;
import com.example.n551.alesson5.adapter.SummaAdapter;
import com.example.n551.alesson5.model.Summa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends Activity {

    private List<Summa> list = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private  SummaAdapter summaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);

        Summa summa;


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(gridLayoutManager);
        summaAdapter = new SummaAdapter(list);
        recyclerView.setAdapter(summaAdapter);

        showData();

        summaAdapter.setItemOnClickListener(new SummaAdapter.ItemOnClickListener() {
            @Override
            public void onClick(Summa summa) {
                Log.d("VIEW", "item name" + summa.getName());
            }
        });
    }

    private void showData()
    {
        for (int i = 0; i < 12;i++)
        {
            list.add(new Summa(1.1,new Date(),"MyName"));
        }

        summaAdapter.addItems(list);
    }
}
