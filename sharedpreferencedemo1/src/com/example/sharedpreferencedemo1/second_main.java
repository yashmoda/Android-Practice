package com.example.sharedpreferencedemo1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_main extends Activity {
   Button bu=null;
   Button bu2=null;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.second_main);

      bu=(Button)findViewById(R.id.button2);
      bu2=(Button)findViewById(R.id.button3);
   }

   public  void logout(View view){
      SharedPreferences sharedpreferences = getSharedPreferences(MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
      SharedPreferences.Editor editor = sharedpreferences.edit();
      editor.clear();
      editor.commit();
      startActivity(new Intent(this,MainActivity.class));
      finish();
   }

   public void close(View view){
      finish();
   }
}
