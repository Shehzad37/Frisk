package com.coderchain.sa.frisk4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by v17 on 12/02/2016.
 */
public class OnBoot extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {



        Intent i = new Intent(context,smser.class);
       context.startService(i);


    }
}
