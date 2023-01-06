package com.example.health_care_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
    }
    //    Btn for Home2 Page
    public void onclickAdelH(View view){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }
}