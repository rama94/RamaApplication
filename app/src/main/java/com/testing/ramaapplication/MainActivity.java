package com.testing.ramaapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();

        if(findViewById(R.id.mainFragment) != null) {
            if(savedInstanceState != null) return;

            FragmentTransaction ft = fm.beginTransaction();
            HomeFragment hf = new HomeFragment();
            ft.add(R.id.mainFragment,hf,null);
            ft.commit();

        }

    }
}
