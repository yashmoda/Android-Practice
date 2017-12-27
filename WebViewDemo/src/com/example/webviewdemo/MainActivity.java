package com.example.webviewdemo;

import android.os.Bundle;  
import android.app.Activity;  
import android.webkit.WebView;  
  
public class MainActivity extends Activity {  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
          
        WebView mywebview = (WebView) findViewById(R.id.webView1);  
          
        mywebview.loadUrl("http://www.javatechnocrat.in");  
    }  
}