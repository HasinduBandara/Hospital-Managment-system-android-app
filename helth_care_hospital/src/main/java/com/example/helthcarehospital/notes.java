package com.example.helthcarehospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class notes extends AppCompatActivity {



EditText editTextTextPersonName3,editTextTextPersonName4,editTextTextPersonName2;
Button button,button3u,buttonuu,button4u;
DatabaseReference dbRef;
addnote addnote;


private void clearControls(){

    editTextTextPersonName3.setText("");
    editTextTextPersonName4.setText("");
    editTextTextPersonName2.setText("");
}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4=findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);

        button =findViewById(R.id.button);
        button3u=findViewById(R.id.button3u);
        buttonuu=findViewById(R.id.buttonuu);
       // button4u=finishFromChild(R.id.button4uo);

        addnote = new addnote();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //adding

                dbRef = FirebaseDatabase.getInstance().getReference().child("Student");



                try {
                    if (TextUtils.isEmpty(editTextTextPersonName3.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter an note no", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(editTextTextPersonName4.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter a date", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(editTextTextPersonName2.getText().toString()))
                        Toast.makeText(getApplicationContext(), "type description", Toast.LENGTH_SHORT).show();



                    else{
                        addnote.setNoteNo(editTextTextPersonName3.getText().toString().trim());
                        addnote.setDate(editTextTextPersonName4.getText().toString().trim());
                        addnote.setDescription(editTextTextPersonName2.getText().toString().trim());
                       // addnote.setConNo(Integer.parseInt(txtConNo.getText().toString().trim()));



                        dbRef.push().setValue(addnote);



                        Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();
                        clearControls();
                    }



                }



                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Invalid Contact Number", Toast.LENGTH_SHORT).show();
                }













            }
        });


    }

    //    Btn for Add Building Page
    public void onclickAC(View view){
        Intent in=new Intent(this,updatenote.class);
        startActivity(in);

    }

    //    Btn for Add Building Page
    public void onclickAD(View view){
        Intent in=new Intent(this,viewnote.class);
        startActivity(in);

    }
}