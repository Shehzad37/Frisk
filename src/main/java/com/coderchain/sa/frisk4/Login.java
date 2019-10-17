package com.coderchain.sa.frisk4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/*import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;*/

public class Login extends AppCompatActivity {

    String p,s;


    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.setTitle(getResources().getString(R.string.ep));


        SharedPreferences sp = getSharedPreferences("My",MODE_PRIVATE);
        p = sp.getString("PIN","");


        //sms.setText(p);
        e = (EditText)findViewById(R.id.pin);






    }


    public void act(View view) {

        s = e.getText().toString();

        if (p.equals(s)){


            Intent intent = new Intent(this, MainActivity.class);
             intent.putExtra("PIN", s);
            startActivity(intent);
            finish();

        }
        else {

            Toast.makeText(getApplicationContext(), "Invalid PIN", Toast.LENGTH_SHORT).show();
            e.setText("");

        }

    }
}
