package com.example.eventexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

public class MyButton extends Button{
	
	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public boolean onTouchEvent(MotionEvent event)
	{
		// super.onTouchEvent(event);
		Toast.makeText(MyApplication.getInstance().getApplicationContext(), "�Զ���MyButton����Ӧ�������¼�", Toast.LENGTH_SHORT).show();
		// ����true���¼�����������ɢ
		return false;
	}
}
