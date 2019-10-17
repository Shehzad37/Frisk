package com.coderchain.sa.frisk4;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class unlockC extends AppCompatActivity {


    private DevicePolicyManager mDevicePolicyManager;
    private ComponentName mComponentName;
    String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_unlock_c);

        Intent i = getIntent();
       s =  i.getStringExtra("sms");


        mDevicePolicyManager = (DevicePolicyManager) getSystemService (Context.DEVICE_POLICY_SERVICE);
        mComponentName = new ComponentName(this, MyAdminReceiver.class);
        Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
        intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, mComponentName);
        startActivity(intent);

       if(mDevicePolicyManager.isAdminActive(mComponentName))

{
        mDevicePolicyManager.resetPassword(s, 0);
         mDevicePolicyManager.lockNow();
    Toast.makeText(getBaseContext(),"Screen lock has been Changed", Toast.LENGTH_SHORT).show();
}



        else{


           Toast.makeText(getApplicationContext(), " First Activate Frisk as Admin then resend the command to use this feature", Toast.LENGTH_LONG).show();

        }


        finish();
    }
}
