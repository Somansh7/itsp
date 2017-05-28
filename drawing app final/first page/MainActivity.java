package com.vogella.android.mygrassbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        EditText e1= (EditText)findViewById(R.id.editText5);// length is edittext5 and breadth is 4
        EditText e2= (EditText)findViewById(R.id.editText4);
       // TextView t1=(TextView)findViewById(R.id.re);
        int length,breadth;
        length=Integer.parseInt(e1.getText().toString());
        breadth=Integer.parseInt(e2.getText().toString());
       // int sum=length+breadth;
       // t1.setText(Integer.toString(sum));

    }

}
