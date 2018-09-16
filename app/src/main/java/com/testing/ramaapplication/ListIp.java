package com.testing.ramaapplication;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;

import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;


public class ListIp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ip);
    }

    public void getListIp(View view)  {

        WifiManager wm = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        String ip = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
        String netAddress = null;
        try
        {
            netAddress = new NetTask().execute("www.google.com").get();
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }

        Log.d("test", "my ip wifi is " +ip+ " and my network ip is " +netAddress);
    }

}
