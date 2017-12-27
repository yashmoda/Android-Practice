package com.example.video1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends Activity{

	private static final int ACTIVITY_START_CAMERA_APP=1;
	Button capturevideoButton;
	Button playvideoButton;
	VideoView videoview;
	Uri videoFileUri;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		capturevideoButton=(Button)findViewById(R.id.button1);
		playvideoButton=(Button)findViewById(R.id.button2);
		videoview=(VideoView)findViewById(R.id.videoView1);
		capturevideoButton.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent video=new Intent();
				video.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
				startActivityForResult(video,ACTIVITY_START_CAMERA_APP);
			}
		});
		playvideoButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				videoview.start();
			}
		});
	}
	protected void onActivityResult(int requestcode,int resultcode,Intent data)
	{
		if(requestcode==ACTIVITY_START_CAMERA_APP && resultcode==RESULT_OK)
		{
			Uri videoUri=data.getData();
			videoview.setVideoURI(videoUri);
			
		}
	}
}