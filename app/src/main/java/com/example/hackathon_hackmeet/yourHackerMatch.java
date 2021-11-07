package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class yourHackerMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_hacker_match);
        EditText txt1 = (EditText) findViewById(R.id.math_txt_1);
        EditText txt2 = (EditText) findViewById(R.id.math_txt_2);
        EditText txt3 = (EditText) findViewById(R.id.math_txt_3);
        Button go = (Button) findViewById(R.id.button_continue_match);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SEND TEXT DATA */
                Intent intent = new Intent(getApplicationContext(), listOfHackers.class);
                startActivity(intent);
            }
        });
    }
}