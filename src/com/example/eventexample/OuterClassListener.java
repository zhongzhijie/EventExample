package com.example.eventexample;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class OuterClassListener implements OnLongClickListener{

	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub
		// Toast.makeText(act, "�ⲿ���¼���������Ӧ", Toast.LENGTH_SHORT).show();
		Toast.makeText(MyApplication.getInstance().getApplicationContext(), "�ⲿ���¼���������Ӧ", Toast.LENGTH_SHORT).show();
		return false;
	}

	
}
