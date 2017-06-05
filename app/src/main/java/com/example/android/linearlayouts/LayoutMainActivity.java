package com.example.android.linearlayouts;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class LayoutMainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Button1;
    Button Button2;
    CheckBox CheckBox1;

    //Used to pull the String of this app's name. In turn this is used in Logcat
    public static final String Tag = LayoutMainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);


       Button1 = (Button)findViewById(R.id.button1);
        Button2 = (Button)findViewById(R.id.button2);
        CheckBox1 =(CheckBox)findViewById(R.id.checkBox1);

        Button1.setOnClickListener(LayoutMainActivity.this);
        Button2.setOnClickListener(LayoutMainActivity.this);
        CheckBox1.setOnClickListener(LayoutMainActivity.this);


    }

    @Override
    public void onClick(View v) {
        if(v==Button1) {
            Log.d(Tag, "Button 1 was Pressed");
        } else if(v==Button2) {
            Log.d(Tag, "Button 2 was Pressed");
        } else if(v==CheckBox1) {
            Log.d(Tag, "CheckBox 1 was pressed");;
        }


    }

}
