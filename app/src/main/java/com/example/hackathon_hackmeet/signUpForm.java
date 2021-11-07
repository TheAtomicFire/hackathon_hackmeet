package com.example.hackathon_hackmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signUpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);
        Button button = (Button) findViewById(R.id.button_continue_signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitDataAndGo();
            }
        });
    }
    protected void submitDataAndGo()
    {

        TextView error_nothing = (TextView) findViewById(R.id.text_fillAll);
        TextView error_nomatch = (TextView) findViewById(R.id.txt_notMatching);
        error_nothing.setVisibility(View.INVISIBLE);
        error_nomatch.setVisibility(View.INVISIBLE);

        EditText fullName = (EditText) findViewById(R.id.txtbox_name);
        EditText email = (EditText) findViewById(R.id.txtbox_email);
        EditText username = (EditText) findViewById(R.id.txtbox_username);
        EditText password = (EditText) findViewById(R.id.txtbox_password);
        EditText reenter = (EditText) findViewById(R.id.txtbox_reenter);

        String fullName_Content = fullName.getText().toString();
        String email_Content = email.getText().toString();
        String username_Content = username.getText().toString();
        String password_Content = password.getText().toString();
        String reenter_Content = reenter.getText().toString();




        if (fullName_Content.equals("") || email_Content.equals("")
                ||username_Content.equals("") ||password_Content.equals("") || reenter_Content.equals(""))
        {
            error_nothing.setVisibility(View.VISIBLE);

        }
        else if (!password_Content.equals(reenter_Content))
        {
            error_nomatch.setVisibility(View.VISIBLE);
        }
        else {

            /* CODE HERE FOR SUBMITTING TO DATABASE */
            //PASSWORD, EMAIL AND USERNAME GOING TO OUR DATABASE
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}