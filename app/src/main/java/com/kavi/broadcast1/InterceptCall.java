package com.kavi.broadcast1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.widget.PopupMenu;
import android.widget.Toast;

/**
 * Created by kavi on 10/7/18.
 */

public class InterceptCall extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        try {
                String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
            if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_RINGING)) {
               Toast.makeText(context,"Ringing!",Toast.LENGTH_SHORT).show();


                //PopupMenu popup = new PopupMenu(InterceptCall.this,);

                //popup.getMenuInflater().inflate(R.menu.popupmenu,popup.getMenu());

            }
            if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                Toast.makeText(context,"Received",Toast.LENGTH_SHORT).show();

            }

            if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_IDLE)) {
                Toast.makeText(context,"Idle",Toast.LENGTH_SHORT).show();

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
