
package com.coderchain.sa.frisk4;

import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Switch;
import android.widget.Toast;

public class smser extends Service {

    String p="";
    IntentFilter f;
    MediaPlayer mp1;


/*
    private BroadcastReceiver ir = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {


            String sms=(intent.getExtras().getString("sms"));

          //  Toast.makeText(context,p,Toast.LENGTH_SHORT).show();

            if (sms.contains(p+" "+"scare")) {


                mp1 = MediaPlayer.create(context, R.raw.scr);
                mp1.start();
                mp1.setLooping(true);




            }

            if (sms.contains(p+" "+"scream")) {

                mp1 = MediaPlayer.create(context, R.raw.scr);
                mp1.start();

            }

            if (sms.contains(p+" "+"vibrate") || sms.contains(p+" "+"Vibrate") || sms.contains(p+" "+"VIBRATE")) {

                AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
                am.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
            }


            if (sms.contains(p+" "+"ring") || sms.contains(p+" "+"Ring") || sms.contains(p+" "+"RING")) {

                AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
                am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            }


             if (sms.contains(p+" "+"stop") || sms.contains(p+" "+"Stop") || sms.contains(p+" "+"STOP")) {

                mp1.stop();

            }




             if (sms.contains(p+" "+"lock") || sms.contains(p+" "+"Lock") || sms.contains(p+" "+"LOCK")) {

                                     Intent i = new Intent(context, lock.class);
                                     i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                     startActivity(i);

            }

             if (sms.contains(p+" "+"RemoveLock") || sms.contains(p+" "+"removelock")) {


                Intent i = new Intent(context,unlock.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);


            }


            else if (sms.contains(p+" "+"ChangePassTo") || sms.contains(p+" "+"changepassto")) {


                Intent i = new Intent(context,unlockC.class);
                sms = sms.replace(p+" changepassto " ,"");
                i.putExtra("sms", sms);

                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);

            }




        }
    };


    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferences sp = getSharedPreferences("My",MODE_PRIVATE);
        p= sp.getString("PIN","");

        f = new IntentFilter();
        f.addAction("SMS_RECEIVED_ACTION");
        registerReceiver(ir, f);








    }

    public smser() {
super();
    }*/

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {





        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

