package com.example.hackathon_hackmeet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hackathon_hackmeet.DBLogic.AuthInfoOperations;
import com.example.hackathon_hackmeet.DBLogic.HackerInfoOperations;
import com.example.hackathon_hackmeet.model.AuthInfo;
import com.example.hackathon_hackmeet.model.HackerInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class login_page extends AppCompatActivity {

    private static final String TAG = login_page.class.getName();
    public Boolean isPasswordRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Button login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SEND TEXT DATA */
                try {
                    Login(v);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void Login(View view) throws InterruptedException {
        Editable Logpassword = ((EditText) findViewById(R.id.editTextTextPassword)).getText();
        Editable Logusername = ((EditText) findViewById(R.id.editTextTextPersonName2)).getText();
        AuthInfo authInfo = new AuthInfo();
        authInfo.setUsername(Logusername.toString());
        authInfo.setPassword(Logpassword.toString());

        AuthInfoOperations ops = new AuthInfoOperations();


        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference authRef = database.getReference("authInfo/"+authInfo.getUsername());

//        AtomicBoolean done = new AtomicBoolean(false);
        isPasswordRight = false;

            authRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    if (snapshot == null) {
                        // The child doesn't exist
                        Log.w(TAG, "Username doesn't exist.");
                    } else {
                        String dbpassword = snapshot.getValue(String.class);
                        if (dbpassword.equals(authInfo.getPassword())) {
                            Log.w(TAG, "Password is right.");
                            isPasswordRight = true;
                        }
                    }
//                    done.set(true);
//                    synchronized (done) {
//                        done.notifyAll(); // notify the main thread which is waiting
//                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    // Failed to read value
                    Log.w(TAG, "Failed to read value.", error.toException());
                }
            });

//        synchronized (done) {
//            while (done.get() == false) {
//                done.wait(); // wait here until the listener fires
//            }
//        }


        TextView output = findViewById(R.id.textView2);
//        Get String from database and chekc with the password
        String dataName =  "";
        String password = "" ;
        boolean yesName = false;
        boolean yesPassword = false;
        if(isPasswordRight){
            yesPassword = true;
        }
        if(isPasswordRight == false){
            output.setVisibility(View.VISIBLE);
            output.setText("ERROR : Password Incorrect ");
        }
        else{
            Intent intent = new Intent(this,MainActivity.class) ;
            startActivity(intent);
        }
    }

}