package com.example.spinnerdemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

@SuppressLint("ShowToast")
public class MainActivity extends Activity implements OnItemSelectedListener {
	String[] spinner;
	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner spin=(Spinner)findViewById(R.id.sp1);
		spin.setOnItemSelectedListener(this);
		Resources res=getResources();
		spinner=res.getStringArray(R.array.myarray);
		ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,spinner);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(aa);
		
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_SHORT ).show();
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

}
