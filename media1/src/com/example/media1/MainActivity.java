package com.example.media1;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MediaPlayer mp=MediaPlayer.create(this,R.raw.cheez);
		mp.start();
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Bundle savedInstanceState=null;
		super.onRestart();
		super.onCreate(savedInstanceState);
	}
}