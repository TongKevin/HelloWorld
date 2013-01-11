package com.kevin.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity{

	private TextView v = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_other);
		Intent intent = this.getIntent();
		String str = intent.getStringExtra("value");
		v = (TextView)findViewById(R.id.myTextView);
		v.setText(str);
	}

	
}
