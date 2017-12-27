package com.example.media4;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	MediaRecorder recorder;
	private Button startButton;
	private Button stopButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startButton=(Button)findViewById(R.id.start);
		stopButton=(Button)findViewById(R.id.stop);
	}
	public void startRecording(View v)
	{
		startButton.setEnabled(false);
		stopButton.setEnabled(true);
		recorder=new MediaRecorder();
		recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
		recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_WB);
		recorder.setOutputFile("/storage/sdcard/abc.3gp");
		try {
			recorder.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recorder.start();
		
	}
	public void stopRecording(View v)
	{
		startButton.setEnabled(true);
		stopButton.setEnabled(false);
		recorder.stop();
		recorder.release();
	}

}