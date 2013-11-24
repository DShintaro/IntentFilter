package com.example.intentfilter;


import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button dialButton;
	private Button mailButton;
	private Intent intent = new Intent();
	private Uri data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dialButton = (Button) findViewById(R.id.button1);
		mailButton = (Button) findViewById(R.id.button2);
		
		dialButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setAction(Intent.ACTION_CALL);
				data = Uri.parse("tel:117");
				intent.setData(data);
				startActivity(intent);
			}
		});
		
		mailButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setAction(Intent.ACTION_SENDTO);
				data = Uri.parse("sms:08052569618");
				intent.setData(data);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
