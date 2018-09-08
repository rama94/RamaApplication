package com.testing.ramaapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class T01_MainActivity extends AppCompatActivity {

    public static FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t01__main);

        fm = getSupportFragmentManager();

        if(findViewById(R.id.t01_main_fragment) != null) {
            if(savedInstanceState != null) return;

            FragmentTransaction ft = fm.beginTransaction();
            T01_HomeFragment hf = new T01_HomeFragment();
            ft.add(R.id.t01_main_fragment,hf,null);
            ft.commit();

        }
    }
}
