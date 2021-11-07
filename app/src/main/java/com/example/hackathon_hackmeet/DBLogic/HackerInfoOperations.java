package com.example.hackathon_hackmeet.DBLogic;

import android.util.Log;

import com.example.hackathon_hackmeet.model.HackerInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class HackerInfoOperations {

    private static final String TAG = HackerInfoOperations.class.getName();

    public void pushDescribeYourself(HackerInfo hackerInfo){
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference hackerRef = database.getReference("hackerInfo/"+hackerInfo.getHackerId());

        hackerRef.setValue(hackerInfo);

//        hackerRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                HackerInfo value = dataSnapshot.getValue(HackerInfo.class);
//                Log.d(TAG, "Value is: " + value.toString());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//                Log.w(TAG, "Failed to read value.", error.toException());
//            }
//        });
    }
}
