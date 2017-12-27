package com.example.camera1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements android.view.View.OnClickListener {

	private static final int CAMERA_PIC_REQUEST=1888;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
	}
	protected void onActivityResult(int requestcode,int resultcode,Intent data)
	{
		if(requestcode==CAMERA_PIC_REQUEST)
		{
			Bitmap thumbanail=(Bitmap)data.getExtras().get("data");
			ImageView iv=(ImageView)findViewById(R.id.imageView1);
			iv.setImageBitmap(thumbanail);
		}
	}
		@Override
		public void onClick(View v)
		{
		Intent cameraIntent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(cameraIntent,CAMERA_PIC_REQUEST);
		}
}