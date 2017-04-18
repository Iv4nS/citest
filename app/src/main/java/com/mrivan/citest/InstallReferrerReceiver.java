package com.mrivan.citest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.connectedinteractive.connectsdk.ConnectTracker;

/**
 * Created by ivan on 2017-04-18.
 */

public class InstallReferrerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectTracker connectTracker = new ConnectTracker();
        connectTracker.onReceive(context, intent);
    }
}
