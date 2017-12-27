package com.example.fragmentexample1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void changeFragment(View v)
	{
		Fragment fragment;
		if(v==findViewById(R.id.button1))
				{
				fragment=new FragmentOne();
				FragmentManager fm=getFragmentManager();
				FragmentTransaction ft=fm.beginTransaction();
				ft.replace(R.id.fragment1,fragment);
				ft.addToBackStack(null);
				ft.commit();
				}
		if(v==findViewById(R.id.button2))
				{
				fragment=new FragmentTwo();
				FragmentManager fm=getFragmentManager();
				FragmentTransaction ft=fm.beginTransaction();
				ft.replace(R.id.fragment1,fragment);
				ft.addToBackStack(null);
				ft.commit();
				}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
