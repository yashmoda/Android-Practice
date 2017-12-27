package com.example.implicitintentdemo;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void conbtn(View view)
	{
		Intent i=new Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI);
		
		startActivity(i);
	}
	public void browsebtn(View view)
	{
		EditText e1=(EditText)findViewById(R.id.editText1);
		String s1=e1.getText().toString();
		Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse(s1));
		startActivity(i1);
	}
	public void searchbtn(View view)
	{
		EditText e2=(EditText)findViewById(R.id.editText2);
		String s2=e2.getText().toString();
		Intent i2=new Intent(Intent.ACTION_WEB_SEARCH);
		i2.putExtra(SearchManager.QUERY,s2);
		startActivity(i2);
	}
	public void mapbtn(View view)
	{
		EditText e3=(EditText)findViewById(R.id.editText3);
		String s3=e3.getText().toString();
		Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0 ? ="+s3));
		startActivity(i3);
	}
	public void callbtn(View view)
	{
		EditText e4=(EditText)findViewById(R.id.editText4);
		String s4=e4.getText().toString();
		Intent i4=new Intent(Intent.ACTION_CALL,Uri.parse("tel://+91"+s4));
		startActivity(i4);
		
	}
}