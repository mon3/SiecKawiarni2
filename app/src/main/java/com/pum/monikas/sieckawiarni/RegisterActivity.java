package com.pum.monikas.sieckawiarni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

// for commit
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText new_user_name = (EditText) findViewById(R.id.editText_Name);
        final EditText new_user_surname = (EditText) findViewById(R.id.editText_surname);
        final EditText new_user_email = (EditText) findViewById(R.id.editText_email);
        final EditText new_user_pass = (EditText) findViewById(R.id.editText_newpass);

        final Button bRegister = (Button) findViewById(R.id.new_register_button);






    }
}
