package com.example.radiogroupdemo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	RadioButton rb1,rb2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);		
	}
	public void radiobox(View view)
	{
		
		rb1=(RadioButton)findViewById(R.id.rb1);
		rb2=(RadioButton)findViewById(R.id.rb2);
		if(rb1.isChecked())
		{
			Toast.makeText(this,"Male is selected",Toast.LENGTH_LONG).show();		
		}
		if(rb2.isChecked())
		{
			Toast.makeText(this,"Female is selected",Toast.LENGTH_LONG).show();
		}
	}
	/*public void radiobox1(View view)
	{
		rb1=(RadioButton)findViewById(R.id.rb1);
		rb2=(RadioButton)findViewById(R.id.rb2);
		
	 if(rb2.isChecked())
		{
			Toast.makeText(this,"Female is selected",Toast.LENGTH_LONG).show();
		}
	}*/
}