package com.testing.ramaapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    private Button button;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View homeView = inflater.inflate(R.layout.fragment_home, container, false);
        button = homeView.findViewById(R.id.homeButton);


        // make button go to FirstFragment
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  MainActivity.fm.beginTransaction().replace(R.id.mainFragment, new FirstFragment(), null).commit();
              }
          }
        );

        return homeView;
    }

}
