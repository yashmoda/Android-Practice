package com.example.intentdemo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Act1 extends Activity {
	@Override
	public void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.first);
	}
	public void subbtn(View view)
	{
		EditText e1=(EditText)findViewById(R.id.editText1);
		String s1=e1.getText().toString();
		Intent i=new Intent(this,Act2.class);
		i.putExtra("ab",s1);
		startActivity(i);
	}

}
