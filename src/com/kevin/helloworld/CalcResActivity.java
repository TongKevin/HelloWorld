package com.kevin.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CalcResActivity extends Activity {

	private TextView v = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_calcres);
		Intent intent = this.getIntent();
		String num1 = intent.getStringExtra("num1");
		String num2 = intent.getStringExtra("num2");
		int inum1 = Integer.parseInt(num1);
		int inum2 = Integer.parseInt(num2);
		int result = inum1 * inum2;
		
		v = (TextView) this.findViewById(R.id.calcres);
		v.setText(result+"");
	}

}
