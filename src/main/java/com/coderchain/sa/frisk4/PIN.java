package com.coderchain.sa.frisk4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PIN extends AppCompatActivity {

    EditText e, e1,email;
    String s, s1,emails;
    int pin = 4;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        e = (EditText) findViewById(R.id.editText);
        e1 = (EditText) findViewById(R.id.editText2);

        this.setTitle(getResources().getString(R.string.cp));


    }


    public void Con(View view) {

        s = e.getText().toString();
        s1 = e1.getText().toString();



        if (s.length() == pin) {

            if (s.equals(s1)) {


                sp = getSharedPreferences("My", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("PIN", s);
                editor.putBoolean("bool", true);
                editor.commit();
                Intent intent = new Intent(this, MainActivity.class);
              //  intent.putExtra("PIN", s);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
               Intent i = new Intent(this,smser.class);
                startService(i);
                finish();
            } else {

                Toast.makeText(getApplicationContext(), "PIN Does not Match", Toast.LENGTH_SHORT).show();
                e1.setText("");
                e.setText("");

            }
        } else {

            Toast.makeText(getApplicationContext(), "Please Enter a 4-digit PIN", Toast.LENGTH_SHORT).show();
            e1.setText("");
            e.setText("");

        }
    }

    @Override
    public void onBackPressed() {

        finish();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}


