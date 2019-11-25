package com.example.broadcastreceiver1028;
//廣播有兩種,一種在manifests裡面(內建(手機行為是無法廣播接收的)),
// 一種是直接在activity或service註冊(自訂廣播標籤)
//8.0後,直接在manifests註冊要符合規範(因限制背景執行)(要加permission)
//1增一個類別
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//7之後學另外一種廣播(自訂廣播標籤),一樣宣告另類別
    myreceiverClass myreceiverclass;
//8設定常數
    public static final String mAction = "broadcast.Hungry";


//9去介面刪Textview拉Button

//10宣告
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsend = findViewById(R.id.btnSend);//按鈕透過下方Intent,把mAction傳給廣播

        myreceiverclass = new myreceiverClass();

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mAction);
                sendBroadcast(i);
            }
        });
    }

//13右鍵產生Override載入onResume跟onPause方法
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
//11去類別