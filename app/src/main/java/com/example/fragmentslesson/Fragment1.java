package com.example.fragmentslesson;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */

public class Fragment1 extends Fragment {
private View view3;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view3=inflater.inflate(R.layout.fragment_fragment1, container, false);
        ExtendedFloatingActionButton button= view3.findViewById(R.id.floatingActionButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(view3,R.string.hello_blank_fragment,Snackbar.LENGTH_LONG).show();
            }
        });

        return view3;
    }

}
