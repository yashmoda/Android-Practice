package com.example.intentdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class Act2 extends Activity {

	@Override
	protected void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.second);
		b=getIntent().getExtras();
		String s2=b.getString("ab");
		EditText e2=(EditText)findViewById(R.id.editText1);
		e2.setText(s2);
		
		
	}
}
