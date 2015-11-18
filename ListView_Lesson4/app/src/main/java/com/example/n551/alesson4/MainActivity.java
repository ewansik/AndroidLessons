package com.example.n551.alesson4;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<String> list = new ArrayList<>();
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("Elem 1");
        list.add("Elem 2");
        list.add("Elem 3");
        list.add("Elem 4");
        list.add("Elem 5");
        list.add("Elem 6");
        list.add("Elem 7");
        list.add("Elem 8");
        list.add("Elem 9");
        list.add("Elem 10");

        mListView = (ListView)findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter(this,list);
        mListView.setAdapter(myAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
