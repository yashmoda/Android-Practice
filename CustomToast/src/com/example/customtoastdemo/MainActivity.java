package com.example.customtoastdemo;

import android.os.Bundle;  
import android.app.Activity;  
import android.view.Gravity;  
import android.view.LayoutInflater;   
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.Toast;  
  
public class MainActivity extends Activity {  
     @Override  
        public void onCreate(Bundle savedInstanceState) {  
            super.onCreate(savedInstanceState);  
            setContentView(R.layout.activity_main);  
               
            LayoutInflater li = getLayoutInflater();  

            View layout = li.inflate(R.layout.customtoast,  
            		(ViewGroup) findViewById(R.id.custom_toast_layout));  

            Toast toast = new Toast(getApplicationContext());  
            toast.setDuration(Toast.LENGTH_SHORT);  
            toast.setGravity(Gravity.CENTER_VERTICAL, 100, 50);  
            toast.setView(layout);//setting the view of custom toast layout  
            toast.show();  
        }  
  
}  