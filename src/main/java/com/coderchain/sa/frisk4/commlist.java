package com.coderchain.sa.frisk4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class commlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commlist);
        final ImageView lock,unlock,vibrate,ring,changepass,rempass,prank,wipe;
        this.setTitle(getResources().getString(R.string.comm));
        lock=(ImageView)findViewById(R.id.lock);
        //unlock=(ImageView)findViewById(R.id.unlock);
        vibrate=(ImageView)findViewById(R.id.vibrate);
        ring=(ImageView)findViewById(R.id.ring);
        changepass=(ImageView)findViewById(R.id.changepass);
        rempass=(ImageView)findViewById(R.id.removepass);
        prank=(ImageView)findViewById(R.id.prank);
        lock.setBackgroundColor(Color.rgb(0, 202, 116));
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout,clist.newInstance("lock","This Command will immediately Lock the Screen.(When the device is in the Wrong hands).\n\nSMS: \n           Your PIN<space>lock"));
        ft.commit();

        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock.setBackgroundColor(Color.rgb(0, 202, 116));
               // unlock.setBackgroundColor(Color.rgb(255,255,255));
                vibrate.setBackgroundColor(Color.rgb(255, 255, 255));
                ring.setBackgroundColor(Color.rgb(255, 255, 255));
                changepass.setBackgroundColor(Color.rgb(255, 255, 255));
                rempass.setBackgroundColor(Color.rgb(255, 255, 255));
                prank.setBackgroundColor(Color.rgb(255, 255, 255));

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,clist.newInstance("lock","This Command will immediately Lock the Screen.(When the device is in the Wrong hands).\n\nSMS: \n           Your PIN<space>lock"));
                ft.commit();
            }
        });

        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock.setBackgroundColor(Color.rgb(255, 255, 255));
                //unlock.setBackgroundColor(Color.rgb(255, 255, 255));
                vibrate.setBackgroundColor(Color.rgb(0, 202, 116));
                ring.setBackgroundColor(Color.rgb(255, 255, 255));
                changepass.setBackgroundColor(Color.rgb(255, 255, 255));
                rempass.setBackgroundColor(Color.rgb(255, 255, 255));
                prank.setBackgroundColor(Color.rgb(255, 255, 255));

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,clist.newInstance("vibrate","This Command will change the device to Vibrate mode.\n\nSMS: \n\n          Your PIN<space>vibrate"));
                ft.commit();
            }
        });
        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock.setBackgroundColor(Color.rgb(255, 255, 255));
               // unlock.setBackgroundColor(Color.rgb(255, 255, 255));
                vibrate.setBackgroundColor(Color.rgb(255, 255, 255));
                ring.setBackgroundColor(Color.rgb(0, 202, 116));
                changepass.setBackgroundColor(Color.rgb(255, 255, 255));
                rempass.setBackgroundColor(Color.rgb(255, 255, 255));
                prank.setBackgroundColor(Color.rgb(255, 255, 255));

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,clist.newInstance("ring","This Command will change the device to Ring mode.\n\nSMS: \n\n           Your PIN<space>ring"));
                ft.commit();
            }
        });
        changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock.setBackgroundColor(Color.rgb(255, 255, 255));
               // unlock.setBackgroundColor(Color.rgb(255, 255, 255));
                vibrate.setBackgroundColor(Color.rgb(255, 255, 255));
                ring.setBackgroundColor(Color.rgb(255, 255, 255));
                changepass.setBackgroundColor(Color.rgb(0, 202, 116));
                rempass.setBackgroundColor(Color.rgb(255, 255, 255));
                prank.setBackgroundColor(Color.rgb(255, 255, 255));

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,clist.newInstance("changepassto","It changes the screnn lock(e.g. Pattern,Password,Pin etc.) to a new password. Useful when you forget your password,pattern or anykind of screen lock.\n\nSMS: \nYour PIN<space>changepassto<space>\nYourNewPassword\n\nFor example:\n\n1234 changepassto 123frisk\nNow your new password will be 123frisk."));
                ft.commit();
            }
        });
        rempass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock.setBackgroundColor(Color.rgb(255, 255, 255));
               // unlock.setBackgroundColor(Color.rgb(255, 255, 255));
                vibrate.setBackgroundColor(Color.rgb(255, 255, 255));
                ring.setBackgroundColor(Color.rgb(255, 255, 255));
                changepass.setBackgroundColor(Color.rgb(255, 255, 255));
                rempass.setBackgroundColor(Color.rgb(0, 202, 116));
                prank.setBackgroundColor(Color.rgb(255, 255, 255));

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,clist.newInstance("removelock","It Removes the screnn lock(e.g. Pattern,Password,Pin etc.).Useful when you forget your password,pattern or anykind of screen lock.\n\nSMS: \n Your PIN<space>removelock"));
                ft.commit();
            }
        });
        prank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock.setBackgroundColor(Color.rgb(255, 255, 255));
                //unlock.setBackgroundColor(Color.rgb(255, 255, 255));
                vibrate.setBackgroundColor(Color.rgb(255, 255, 255));
                ring.setBackgroundColor(Color.rgb(255, 255, 255));
                changepass.setBackgroundColor(Color.rgb(255, 255, 255));
                rempass.setBackgroundColor(Color.rgb(255, 255, 255));
                prank.setBackgroundColor(Color.rgb(0, 202, 116));

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,clist.newInstance("scream","Activates Horror Screaming sound,specially useful to find your device lost in your house, office, or even during a trip.\n\nSMS: \nYour PIN<space>scream"));
                ft.commit();
            }
        });

    }
}
