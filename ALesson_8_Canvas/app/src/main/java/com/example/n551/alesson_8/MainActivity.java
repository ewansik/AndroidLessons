package com.example.n551.alesson_8;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Iterator;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends Activity {

    private MyView my = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my = (MyView)findViewById(R.id.view);

        final TextView editText = (TextView)findViewById(R.id.txt1);
        final TextView editText1 = (TextView)findViewById(R.id.txt2);
        final TextView editText2 = (TextView)findViewById(R.id.txt3);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int [] array = new int[3];
                array[0] = Integer.valueOf(editText.getText().toString());
                array[1] = Integer.valueOf(editText1.getText().toString());
                array[2] = Integer.valueOf(editText2.getText().toString());


                my.setArray(array);
                my.invalidate();
            }
        });
    }

}
