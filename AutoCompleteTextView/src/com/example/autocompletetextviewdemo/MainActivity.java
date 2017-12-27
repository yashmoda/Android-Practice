package com.example.autocompletetextviewdemo;

import android.os.Bundle;  
import android.app.Activity;  
import android.graphics.Color;  
import android.widget.ArrayAdapter;  
import android.widget.AutoCompleteTextView;  
  
public class MainActivity extends Activity {  
    String[] food ={"Chicken","Chowmein","Puri","Paneer","idly","Ice-cream"};  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
          
           ArrayAdapter<String> adapter = new ArrayAdapter<String>
           (this,android.R.layout.select_dialog_item,food);  
           AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);  
           actv.setThreshold(1);
           actv.setAdapter(adapter);
           actv.setTextColor(Color.RED);  
                          
    }  
}