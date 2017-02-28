package com.mrivan.citest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.connectedinteractive.connectsdk.ConnectTracker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConnectTracker.init(this);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume()  {
        super.onResume();
        ConnectTracker.onResume();
    }

    @Override
    protected void onPause()  {
        super.onPause();
        ConnectTracker.onPause();
    }
}
