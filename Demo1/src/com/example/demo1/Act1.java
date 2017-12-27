package com.example.demo1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

@SuppressLint("ShowToast")
public class Act1 extends Activity {
	Button b1,b2;
	@Override
	public void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.second);
		b1=(Button)findViewById(R.id.bt1);
		b2=(Button)findViewById(R.id.bt2);
	}
	public void androidbtn(View v)
	{
		Toast.makeText(getApplicationContext(),"Android Was developed by Andy Rubin",3000).show();	
	}
	public void javabtn(View v)
	{
		Toast t=Toast.makeText(this,"Java was developed by James Gossling",Toast.LENGTH_LONG);
		t.show();
	}
	
}
