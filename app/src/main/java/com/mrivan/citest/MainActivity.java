package com.mrivan.citest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

    public void btnManualInstall(View view) {
        Intent i = new Intent(null, MainActivity.class);
        i.putExtra("referrer", "126733777");

        ConnectTracker connectTracker = new ConnectTracker();
        connectTracker.onReceive(MainActivity.this, i);

        //sendBroadcast(i);
        //i.setPackage(this.getPackageName()); //com.playmoneymedia.pmmshowcase) //referrer is a composition of the parameter of the campaing
        //getBaseContext() -> works
        //MainActivity.this -> works
        //getApplicationContext() -> works
    }
}
