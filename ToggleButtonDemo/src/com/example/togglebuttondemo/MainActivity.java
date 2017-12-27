package com.example.togglebuttondemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	
	private ToggleButton togglebutton1,togglebutton2;
	private Button buttonsubmit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButtonClick();
	}
	public void addListenerOnButtonClick()
	{
		togglebutton1=(ToggleButton)findViewById(R.id.toggleButton1);
		togglebutton2=(ToggleButton)findViewById(R.id.toggleButton2);
		buttonsubmit=(Button)findViewById(R.id.button1);
		buttonsubmit.setOnClickListener(e->
				{
					StringBuilder result=new StringBuilder();
					result.append("ToggleButton1: ").append(togglebutton1.getText());
					result.append("\nToggleButton2: ").append(togglebutton2.getText());
					Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
				});
	}
	
}