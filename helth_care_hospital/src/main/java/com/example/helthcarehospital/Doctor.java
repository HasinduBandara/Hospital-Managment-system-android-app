package com.example.helthcarehospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
    }

    //    Btn for Add Building Page
    public void onclickAB(View view){
        Intent in=new Intent(this,viewappoinments.class);
        startActivity(in);
    }

    //    Btn for Add Building Page
    public void onclickAC(View view){
        Intent in=new Intent(this,notes.class);
        startActivity(in);
    }
}