package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void Login(View view){
        Editable Logpassword = ((EditText) findViewById(R.id.editTextTextPassword)).getText();
        TextView output = findViewById(R.id.textView2);
//        Get String from database and chekc with the password
        String dataName =  "";
        String password = "" ;
        boolean yesName = false;
        boolean yesPassword = false;
        if(Logpassword.toString().equals(password)){
                   yesPassword = true;
        }
        if(yesPassword == false){
            output.setVisibility(View.VISIBLE);
            output.setText("ERROR : Password Incorrect ");
        }
        else{
            Intent intent = new Intent(this,MainActivity.class) ;
            startActivity(intent);
        }
    }

}