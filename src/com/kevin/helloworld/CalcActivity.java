package com.kevin.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends Activity {

	private EditText num1 = null;
	private EditText num2 = null;
	private TextView factoryTV = null;
	private Button factoryBTN = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		num1 = (EditText)findViewById(R.id.Num1);
		
		num2 = (EditText)findViewById(R.id.Num2);
		factoryTV = (TextView)findViewById(R.id.factory);
		factoryBTN = (Button)findViewById(R.id.button1);
		
		factoryTV.setText(R.string.symbol);
		factoryBTN.setText(R.string.calcBtn);
		factoryBTN.setOnClickListener(new clacListener());
		
	}

	class clacListener implements OnClickListener
	{
		public void onClick(View v)
		{
			String num1str = num1.getText().toString();
			String num2str = num2.getText().toString();
			Intent intent = new Intent();
			intent.putExtra("num1", num1str);
			intent.putExtra("num2", num2str);
			intent.setClass(CalcActivity.this, CalcResActivity.class);
			CalcActivity.this.startActivity(intent);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 1, 1, R.string.exit);
		menu.add(0, 2, 2, R.string.about);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if (item.getItemId() == 1)
		{
			finish();
		}
		else if (item.getItemId() == 2)
		{
			
		}
		return super.onOptionsItemSelected(item);
	}

}
