package com.coderchain.sa.frisk4;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class IncomingSms extends BroadcastReceiver {
    public static final String SMS_BUNDLE = "pdus";
    SmsMessage smsMessage;
    String smsBody;
    MediaPlayer mp1;
    String p;
    SharedPreferences sp;




    String s;

    @Override
    public void onReceive(Context context, Intent intent) {

        sp = context.getSharedPreferences("My", context.MODE_PRIVATE);
        p= sp.getString("PIN","");

            Bundle intentExtras = intent.getExtras();

            if (intentExtras != null) {


                Object[] sms = (Object[]) intentExtras.get(SMS_BUNDLE);


                for (int i = 0; i < sms.length; ++i) {

                    String format = intentExtras.getString("format");

                    if(Build.VERSION.SDK_INT > 22) {
                        smsMessage = SmsMessage.createFromPdu((byte[]) sms[i], format);
                    }
                    else{
                        smsMessage = SmsMessage.createFromPdu((byte[]) sms[i]);
                    }

                    smsBody = smsMessage.getMessageBody().toString();

                }

                 //String r = smsMessage.getOriginatingAddress();

                // Toast.makeText(context, r, Toast.LENGTH_LONG).show();

               // String sms=(intent.getExtras().getString("sms"));

                //  Toast.makeText(context,p,Toast.LENGTH_SHORT).show();

                if (smsBody.contains(smsBody+" "+"scare")) {


                    mp1 = MediaPlayer.create(context, R.raw.scr);
                    mp1.start();
                    mp1.setLooping(true);


                }

                if (smsBody.contains(p+" "+"scream")) {

                    mp1 = MediaPlayer.create(context, R.raw.scr);
                    mp1.start();

                }

                if (smsBody.contains(p+" "+"vibrate") || smsBody.contains(p+" "+"Vibrate") || smsBody.contains(p+" "+"VIBRATE")) {

                    AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
                    am.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                }


                if (smsBody.contains(p+" "+"ring") || smsBody.contains(p+" "+"Ring") || smsBody.contains(p+" "+"RING")) {

                    AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
                    am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                }


                if (smsBody.contains(p+" "+"stop") || smsBody.contains(p+" "+"Stop") || smsBody.contains(p+" "+"STOP")) {

                    mp1.stop();

                }

                if (smsBody.contains(p+" "+"lock") || smsBody.contains(p+" "+"Lock") || smsBody.contains(p+" "+"LOCK")) {

                    Intent i = new Intent(context, lock.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);

                }

                if (smsBody.contains(p+" "+"Removelock") || smsBody.contains(p+" "+"removelock")) {


                    Intent i = new Intent(context,unlock.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);

                }

                else if (smsBody.contains(p+" "+"Changepassto") || smsBody.contains(p+" "+"changepassto")) {


                    Intent i = new Intent(context,unlockC.class);
                    smsBody = smsBody.replace(p+" changepassto " ,"");
                    i.putExtra("sms", smsBody);
                   // Toast.makeText(context,smsBody,Toast.LENGTH_SHORT).show();
                    //Log.d(TAG, "onReceive: "+smsBody);
                    //System.out.println(smsBody);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);

                }


              /*  smser s = new smser();
                Intent b = new Intent();
                b.setAction("SMS_RECEIVED_ACTION");
                b.putExtra("sms", smsBody);
                // b.putExtra("origin",r);
                context.sendBroadcast(b);*/
            }


    }
}