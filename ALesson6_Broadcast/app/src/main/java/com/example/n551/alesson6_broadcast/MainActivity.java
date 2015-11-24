package com.example.n551.alesson6_broadcast;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import com.example.n551.alesson6_broadcast.receivers.InternetRecevier;

public class MainActivity extends Activity {

    BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private InternetRecevier internetRecevier;

    @Override
    protected void onResume() {
        super.onResume();

//        broadcastReceiver = new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                Log.d("State","Hello");
//                String action = intent.getAction();
//                if(action.equals(BluetoothAdapter.ACTION_STATE_CHANGED))
//                {
//                    switch (intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,-1))
//                    {
//                        case BluetoothAdapter.STATE_ON:
//                            Log.d("State","Connected");
//                            break;
//                        case BluetoothAdapter.STATE_OFF:
//                            Log.d("State","Connecting");
//                            break;
//
//                        case BluetoothAdapter.STATE_DISCONNECTED:
//                            Log.d("State","Disconected");
//                            break;
//
//                        case BluetoothAdapter.STATE_DISCONNECTING:
//                            Log.d("State","Disconecting");
//                            break;
//                    }
//                }
//
//            }
//        };



        //internetRecevier = new InternetRecevier();

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);
        registerReceiver(broadcastReceiver, intentFilter);
    }

    BroadcastReceiver broadcastReceiverLocal = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("Local","Local");
        }
    };
    @Override
    protected void onPause() {
        super.onPause();

        //unregisterReceiver(broadcastReceiver);
    }

}
