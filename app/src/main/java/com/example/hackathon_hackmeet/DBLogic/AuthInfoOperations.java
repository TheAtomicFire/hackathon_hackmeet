package com.example.hackathon_hackmeet.DBLogic;

import android.util.Log;

import com.example.hackathon_hackmeet.model.AuthInfo;
import com.example.hackathon_hackmeet.model.HackerInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AuthInfoOperations {

    private static final String TAG = AuthInfoOperations.class.getName();

    public void pushAuth(AuthInfo authInfo){
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference authRef = database.getReference("authInfo/"+authInfo.getUsername());

        authRef.setValue(authInfo);


    }
}
