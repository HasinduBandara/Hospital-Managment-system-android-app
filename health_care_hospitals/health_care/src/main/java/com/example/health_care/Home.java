package com.example.health_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    //    Btn for Home2 Page
    public void onclickAH2(View view){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }
}