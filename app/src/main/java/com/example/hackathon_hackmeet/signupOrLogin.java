package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;

public class signupOrLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_or_login);
        Button b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLogIn(v);
            }
        });
        Button button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProfileCreation(v);
            }
        });
    }
    public void goToProfileCreation(View view){
        Intent intent = new Intent(this,signUpForm.class) ;
        startActivity(intent);
    }
    public void goToLogIn(View view){
        Intent intent = new Intent(this,login_page.class) ;
        startActivity(intent);
    }

}


