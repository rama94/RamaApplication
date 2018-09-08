package com.testing.ramaapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class T01_HomeFragment extends Fragment {

    private Button button;

    public T01_HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_t01__home, container, false);

        button = view.findViewById(R.id.t01_home_button);

        // make button go to FirstFragment
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  T01_MainActivity.fm.beginTransaction().replace(R.id.t01_main_fragment,new T01_FirstFragment(), null).addToBackStack(null).commit();
              }
          }
        );

        return view;
    }

}
