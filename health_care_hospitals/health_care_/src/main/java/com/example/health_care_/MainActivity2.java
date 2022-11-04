package com.example.health_care_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //    Btn for My Acc
    public void onclickAcc(View view){
        Intent in=new Intent(this, MyAcc.class);
        startActivity(in);
    }
}