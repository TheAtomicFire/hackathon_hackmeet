package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hackathonDashboard extends AppCompatActivity {
//cool comments
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathon_dashboard);
        Button b = (Button) findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoHome(v);
            }
        });
    }
    public void GoHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}