package com.kevin.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloworldActivity extends Activity {

	private Button b = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_helloworld);
		b = (Button) findViewById(R.id.button1);
		b.setText("My button \n enter");
		b.setOnClickListener(new myButtonListener());
		System.out.println(this.getComponentName());
	}

	class myButtonListener implements OnClickListener
	{
		public void onClick(View v)
		{
//			Intent intent = new Intent();
//			intent.putExtra("value", "123");
//			intent.setClass(HelloworldActivity.this, OtherActivity.class);
//			HelloworldActivity.this.startActivity(intent);
			Uri uri = Uri.parse("smsto:18622696024");
			Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
			intent.putExtra("sms_body", "Hello Kevin!");
			startActivity(intent);
		}
	}

}
