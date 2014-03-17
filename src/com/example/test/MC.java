package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MC
{
	private LayoutInflater layoutInflater;

	public View MC_Text(Context context)
	{
		layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View view = layoutInflater.inflate(R.layout.activity_main, null);
		TextView text = (TextView)view.findViewById(R.id.textview);
		text.setText("yes");
		return view;
	}
}
