package com.coderchain.sa.frisk4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class How extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how);
        this.setTitle(getResources().getString(R.string.htf));
    }
}
