package com.example.broadcastreceiver1028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    myreceiverClass myreceiverclass;
    public static final String mAction = "broadcast.Hungry";
    //Button btnsend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myreceiverclass = new myreceiverClass();
        Button btnsend = findViewById(R.id.btnSend);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mAction);
                sendBroadcast(i);
            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        IntentFilter filter = new IntentFilter(mAction);
        registerReceiver(myreceiverclass, filter);
    }
    @Override
    protected void onPause(){
        super.onPause();
        unregisterReceiver(myreceiverclass);
    }
}