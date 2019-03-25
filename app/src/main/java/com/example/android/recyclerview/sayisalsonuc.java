package com.example.android.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class sayisalsonuc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayisalsonuc);
        Intent sentintent=getIntent();
        tarih sentdata= (tarih) sentintent.getSerializableExtra("sentdata");
        Log.d("receiverd",sentdata.getTarih());

    }
}
