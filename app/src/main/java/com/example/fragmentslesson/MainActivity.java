package com.example.fragmentslesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ExtendedFloatingActionButton btn2;
    ExtendedFloatingActionButton btn3;
    FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn2=findViewById(R.id.floatingActionButton2);
         btn3=findViewById(R.id.floatingActionButton3);
        // frame=findViewById(R.id.fragmentLayouter);
         btn2.setOnClickListener(this);
         btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.floatingActionButton2){
            loadFragment(new Fragment1());
        }
        else {
            loadFragment(new Fragment2());
        }
    }
    public void loadFragment(Fragment f){
        FragmentManager frMan=getSupportFragmentManager();
        FragmentTransaction tr=frMan.beginTransaction();
        tr.replace(R.id.fragmentLayouter,f);
        tr.commit();
    }
}
