package com.example.broadcastreceiver1028;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class myreceiverClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            //Toast.makeText(context,"已重新啟動完成",Toast.LENGTH_LONG).show();
        //if(intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED || intent.getAction() == MainActivity.mAction){
        if (intent.getAction()== MainActivity.mAction){
           Toast.makeText(context,"我餓了",Toast.LENGTH_LONG).show();
            //Toast.makeText(context,"收到廣播了!是"+intent.getAction().toString(),Toast.LENGTH_LONG).show();
        }

        }

    }

