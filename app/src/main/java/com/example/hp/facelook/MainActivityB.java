package com.example.hp.facelook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {
  TextView tView ; //Creating Text View object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        tView = (TextView)findViewById(R.id.textView2); //Intializing text view object
        Bundle bundle= getIntent().getExtras(); //Message passing to Activity B by intent and bundle.
        String data= bundle.getString("vname"); //Passing the bundle into the data String through key.
        tView.setText(data); //Prints the data


    }
}
