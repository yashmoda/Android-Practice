package com.example.checkboxdemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
	CheckBox cb1,cb2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);	
	}
	@SuppressLint("ShowToast")
	public void checkbox(View view)
	{
		
		cb1=(CheckBox)findViewById(R.id.cb1);
		cb2=(CheckBox)findViewById(R.id.cb2);
		if(cb1.isChecked())
		{
			cb2.setChecked(false);
			Toast.makeText(getApplicationContext(), "Java is selected", Toast.LENGTH_LONG).show();
			
		}
	}
	public void checkbox1(View view){
		cb1=(CheckBox)findViewById(R.id.cb1);
		cb2=(CheckBox)findViewById(R.id.cb2);
		if(cb2.isChecked())
		{
			cb1.setChecked(false);
			Toast.makeText(this,"Android is selected", Toast.LENGTH_LONG).show();
		}
		}
}
	

	