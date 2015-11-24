package com.example.n551.alesson6_broadcast.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by N551 on 20.11.2015.
 */
public class InternetRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("receive","hello");
    }
}
