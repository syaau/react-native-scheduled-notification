package com.sharingapples.react.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by rpidanny on 1/25/16.
 */

public class MyBroadcastListener extends BroadcastReceiver{

    @Override
    public void onReceive(Context context,Intent intent){
        if(intent.hasExtra("notification")){
            Bundle b= intent.getBundleExtra("notification");
            new NotificationHelper(context).sendNotification(b);
        }
    }
}