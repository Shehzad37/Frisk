package com.coderchain.sa.frisk4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Comm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm);
        this.setTitle(getResources().getString(R.string.comm));
    }


}
