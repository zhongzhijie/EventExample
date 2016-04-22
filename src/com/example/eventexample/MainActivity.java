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
		// �ڲ���MyClickListener��Ϊ�¼�������
		bt01.setOnClickListener(new MyClickListener());
		
		Button bt02 = (Button)findViewById(R.id.bt02);
		// �ⲿ��OuterClassListener��Ϊ�¼�������
		bt02.setOnLongClickListener(new OuterClassListener());
		
		Button bt03 = (Button)findViewById(R.id.bt03);
		// Activity��Ϊ�¼�������
		bt03.setOnClickListener(this);
		
		Button bt04 = (Button)findViewById(R.id.bt04);
		// Activity��Ϊ�¼�������
		bt04.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "�����ڲ����¼���������Ӧ", Toast.LENGTH_SHORT).show();
			}
			
		});
		
		MyButton bt07 = (MyButton)findViewById(R.id.bt07);
		bt07.setOnTouchListener(new OnTouchListener()
		{

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "�󶨵ļ�������Ӧ�����¼�", Toast.LENGTH_SHORT).show();
				return false;
			}
	
		});
	}
	// MyClickListener��Ϊ�ڲ��¼���������
	class MyClickListener implements View.OnClickListener
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "�ڲ����¼���������Ӧ", Toast.LENGTH_SHORT).show();
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
		Toast.makeText(this, "Activity������Ӧ", Toast.LENGTH_SHORT).show();
	}
	
	public void clickHandler(View v)
	{
		Toast.makeText(this, "��ǩ�󶨵ļ�������Ӧ", Toast.LENGTH_SHORT).show();	
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Activity��Ӧ�������¼�", Toast.LENGTH_SHORT).show();
		return false;
	}
}