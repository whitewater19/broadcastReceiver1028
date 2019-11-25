package com.example.broadcastreceiver1028;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class myreceiverClass extends BroadcastReceiver {
//2                          extends BroadcastReceiver
//3紅,implement methods
//4去設定manifests
    @Override
    public void onReceive(Context context, Intent intent) {
                //收到廣播
//6(2)
//        if(intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED || intent.getAction() == MainActivity.mAction){
//                                 //系統裡的Intent
//            Toast.makeText(context,"收到廣播了"+intent.getAction().toString(),Toast.LENGTH_LONG).show();



//12註解(16-18)改(23-25)
        if (intent.getAction()== MainActivity.mAction){//判斷是不是標籤,是就做什麼動作
                   //據不同Action做不同動作
           Toast.makeText(context,"我餓了",Toast.LENGTH_LONG).show();

        }

        }

    }

