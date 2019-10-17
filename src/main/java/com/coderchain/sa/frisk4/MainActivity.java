package com.coderchain.sa.frisk4;

import android.Manifest;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/*
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
*/
public class   MainActivity extends AppCompatActivity {

    private ImageView pin,cmd,htf,ui;
    private TextView Status,sms;
    IntentFilter f;
    String p="";
    String s="";
    public  DevicePolicyManager mDevicePolicyManager;
    public   ComponentName mComponentName;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

       // AdView mAdView = (AdView) findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
        //mAdView.loadAd(adRequest);
        i = new Intent(this,smser.class);
        startService(i);

        this.setTitle(getResources().getString(R.string.dash));

        mDevicePolicyManager = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        mComponentName = new ComponentName(this, MyAdminReceiver.class);

        int GET_MY_PERMISSION = 1;
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_SMS)
                != PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                    Manifest.permission.READ_SMS)){
            /* do nothing*/
            }
            else{

                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.READ_SMS},GET_MY_PERMISSION);
            }
        }


    if (!mDevicePolicyManager.isAdminActive(mComponentName)){



            Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
            intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, mComponentName);
            startActivityForResult(intent, 1);
       // Toast.makeText(getApplicationContext(),"Admin was not active",Toast.LENGTH_SHORT).show();
    }
       // else
   // { Toast.makeText(getApplicationContext(),"Admin already active",Toast.LENGTH_SHORT).show();}

        pin = (ImageView)findViewById(R.id.pin);
        cmd = (ImageView)findViewById(R.id.cmd);
        htf = (ImageView)findViewById(R.id.htf);
        ui = (ImageView)findViewById(R.id.imageView);
        Status = (TextView) findViewById(R.id.textView29);
        cmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),commlist.class));
            }
        });
    }


    public void action(View view) {

        switch (view.getId()){

            case R.id.pin:
                finish();
                stopService(i);
                Intent i = new Intent(this,PIN.class);
                startActivity(i);
                break;


            case R.id.htf:
                Intent p = new Intent(this,How.class);
                startActivity(p);
                break;

           /* case R.id.cmd:

                Intent c = new Intent(this,Comm.class);
                startActivity(c);
                break;*/

            case R.id.imageView:

                mDevicePolicyManager.removeActiveAdmin(mComponentName);
                Intent intent = new Intent(Intent.ACTION_DELETE);
                intent.setData(Uri.parse("package:com.coderchain.sa.frisk4"));
                startActivity(intent);

               break;

        }


    }
}
