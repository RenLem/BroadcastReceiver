package omy.boston.broadcastreceiver.recievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    public static final String PARAMETER_NAME = "receiver.param";
    public static final String INTENT_NAME = "omy.boston.receiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.hasExtra(PARAMETER_NAME)){
            String value = intent.getStringExtra(PARAMETER_NAME);
            Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
        }
    }
}
