package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.hackathonDashboard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HackathonDashboard(v);
            }
        });
        Button button1 = (Button) findViewById(R.id.findHacker);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findHacker(v);
            }
        });
        Button button2 = (Button) findViewById(R.id.button10);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exit(v);
            }
        });

    }
    public void goToFindHackathons(View view){
        Intent intent = new Intent(this,signUpForm.class) ;
        startActivity(intent);
    }
    public void findHacker(View view){
        Intent intent = new Intent(this,yourHackerMatch.class) ;
        startActivity(intent);
    }
    public void HackathonDashboard(View view){
        Intent intent = new Intent(this,hackathonDashboard.class) ;
        startActivity(intent);
    }
    public void Exit(View view){
        ActivityCompat.finishAffinity(this);
    }
}