package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class describeYourself extends AppCompatActivity {

    //spinners
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_yourself);
        EditText txt1 = (EditText) findViewById(R.id.txt_hack_1);
        EditText txt2 = (EditText) findViewById(R.id.txt_hack_2);
        EditText txt3 = (EditText) findViewById(R.id.txt_hack_3);
        EditText txt4 = (EditText) findViewById(R.id.txt_hack_4);
        Button go = (Button) findViewById(R.id.button_continue_hacker);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SEND TEXT DATA */
                Intent intent = new Intent(getApplicationContext(), listOfHackers.class);
                startActivity(intent);
            }
        });


/*

         ArrayList<String> arrayList = new ArrayList<>();
         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
         Spinner spin =  findViewById(R.id.spinner_techstack);

       Button first = findViewById(R.id.tech_tag_1);
        //Button[] buttons = new Button[4];
/*
       buttons[0] = (Button) findViewById(R.id.tech_tag_1);
               /*
                (Button) findViewById(R.id.tech_tag_2),
                        (Button) findViewById(R.id.tech_tag_3),
                                (Button) findViewById(R.id.tech_tag_4)};
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeTag(v, buttons[0], arrayList, spin);

            }
        });
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeTag(v, buttons[1], arrayList, spin);

            }
        });
        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeTag(v, buttons[2], arrayList, spin);

            }
        });
        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeTag(v, buttons[3], arrayList, spin);

            }
        });

        arrayList.add("JAVA");
        arrayList.add("ANDROID");
        arrayList.add("C Language");
        arrayList.add("CPP Language");
        arrayList.add("Go Language");
        arrayList.add("AVN SYSTEMS");
        spin.setAdapter(arrayAdapter);

        spin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                boolean tagSet = false;
                for (int i = 0; i < 4; i++)
                {/*
                    if (buttons[i].getText().equals("0") && !tagSet)
                    {
                        buttons[i].setText(spin.getSelectedItem().toString());
                        buttons[i].setVisibility(View.VISIBLE);
                        arrayList.remove(spin.getSelectedItemPosition());
                        spin.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList));
                        tagSet = true;
                    }
                }

                if (!tagSet) { //error code
                }


            }
        });
        */
    }
/*
    public View.OnClickListener removeTag(Button b)
    {
return new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        b.setVisibility(View.INVISIBLE);
        arrayList.add(b.getText().toString());
        b.setText("0");
        spin.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList));
    }
};
    }
    */

/*
    private void removeTag(View v,Button but, ArrayList al, Spinner sp){
        but.setVisibility(View.INVISIBLE);
        al.add(but.getText().toString());
        but.setText("0");
        sp.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, al));

    } */
}