package com.example.health_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyAcc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_acc);
    }
    //    Btn for Add Building Page
    public void onclickAUp(View view){
        Intent in=new Intent(this,Update.class);
        startActivity(in);
    }

    //    Btn for Add Building Page
    public void onclickADel(View view){
        Intent in=new Intent(this,Delete.class);
        startActivity(in);
    }
}