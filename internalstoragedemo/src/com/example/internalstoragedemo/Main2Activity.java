package com.example.internalstoragedemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;

public class Main2Activity extends Activity {

    TextView getname, getpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getname = (TextView)findViewById(R.id.getname);
        getpass = (TextView)findViewById(R.id.getpass);
    }
    public void  load(View view)
    {
        try {
          FileInputStream fileInputStream =  openFileInput("Code.txt");
            int read = -1;
            StringBuffer buffer = new StringBuffer();
           while((read =fileInputStream.read())!= -1){
               buffer.append((char)read);
           }
            
            String name = buffer.substring(0,buffer.indexOf(" "));
            String pass = buffer.substring(buffer.indexOf(" ")+1);
            getname.setText(name);
            getpass.setText(pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Toast.makeText(this,"Loaded", Toast.LENGTH_SHORT).show();
    }

    public void  back( View view)
    {
        Toast.makeText(this,"Back", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}