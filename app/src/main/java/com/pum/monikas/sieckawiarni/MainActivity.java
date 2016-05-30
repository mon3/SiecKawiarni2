package com.pum.monikas.sieckawiarni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText user_email = (EditText) findViewById(R.id.editText_user_email);
        final EditText userm_pass = (EditText) findViewById(R.id.editText_user_pass);

        final Button blogin = (Button) findViewById(R.id.login_button);
        // na potrzeby testowania aplikacji num ustawiamy na klienta
        final int num = 1; // num = 1 odpowiada klientowi, num = 2 odpowiada kelnerowi

        assert blogin != null;
        blogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent userAreaIntent = new Intent(MainActivity.this,UserAreaActivity.class);
                // przekazujemy informacje do intentu, kto sie zalogowal: klient czy kelner
                userAreaIntent.putExtra("userType",Integer.toString(num));
                MainActivity.this.startActivity(userAreaIntent); //wykonuje wskazana activity

            }

        });
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);
        registerLink.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent); //wykonuje wskazana activity
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        //in order to make commit
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
