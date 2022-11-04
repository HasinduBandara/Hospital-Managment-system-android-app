package com.example.health_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //    Btn for My Account
    public void onclickAB(View view){
        Intent in=new Intent(this,MyAcc.class);
        startActivity(in);
    }

    //    Btn for Create Account
    public void onclickAC(View view){
        Intent in=new Intent(this, MainActivity2.class);
        startActivity(in);
    }


}