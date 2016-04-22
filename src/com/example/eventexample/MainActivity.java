package com.example.eventexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button bt01 = (Button)findViewById(R.id.bt01);
		// 内部类MyClickListener作为事件监听器
		bt01.setOnClickListener(new MyClickListener());
		
		Button bt02 = (Button)findViewById(R.id.bt02);
		// 外部类OuterClassListener作为事件监听器
		bt02.setOnLongClickListener(new OuterClassListener());
		
		Button bt03 = (Button)findViewById(R.id.bt03);
		// Activity作为事件监听器
		bt03.setOnClickListener(this);
		
		Button bt04 = (Button)findViewById(R.id.bt04);
		// Activity作为事件监听器
		bt04.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "匿名内部类事件处理器响应", Toast.LENGTH_SHORT).show();
			}
			
		});
		
		MyButton bt07 = (MyButton)findViewById(R.id.bt07);
		bt07.setOnTouchListener(new OnTouchListener()
		{

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "绑定的监听器相应触摸事件", Toast.LENGTH_SHORT).show();
				return false;
			}
	
		});
	}
	// MyClickListener作为内部事件监听器类
	class MyClickListener implements View.OnClickListener
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "内部类事件处理器响应", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Activity自身响应", Toast.LENGTH_SHORT).show();
	}
	
	public void clickHandler(View v)
	{
		Toast.makeText(this, "标签绑定的监听器响应", Toast.LENGTH_SHORT).show();	
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Activity响应触摸屏事件", Toast.LENGTH_SHORT).show();
		return false;
	}
}