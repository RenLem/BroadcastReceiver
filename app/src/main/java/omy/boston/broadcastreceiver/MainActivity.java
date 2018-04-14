package omy.boston.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import omy.boston.broadcastreceiver.recievers.MyBroadcastReceiver;

import static omy.boston.broadcastreceiver.recievers.MyBroadcastReceiver.INTENT_NAME;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBroadcast = (Button) findViewById(R.id.btnBroadcast);
        btnBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyBroadcastReceiver.INTENT_NAME);
                intent.putExtra(MyBroadcastReceiver.PARAMETER_NAME, "Poruka za prijamnik!");
                sendBroadcast(intent);
            }
        });
    }

    /**Dodavanje u code bez MANIFESTA

    private MyBroadcastReceiver receiver;

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter(MyBroadcastReceiver.INTENT_NAME);
        receiver = new MyBroadcastReceiver();
        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }**/
}
