package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
//		View view = getLayoutInflater().inflate(R.layout.activity_main, null);
//		TextView text = (TextView) view.findViewById(R.id.textview);
//		text.setText("123");
		setContentView(new MC().MC_Text(this));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
