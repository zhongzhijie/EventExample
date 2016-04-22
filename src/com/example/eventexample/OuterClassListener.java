package com.example.eventexample;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class OuterClassListener implements OnLongClickListener{

	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub
		// Toast.makeText(act, "外部类事件处理器响应", Toast.LENGTH_SHORT).show();
		Toast.makeText(MyApplication.getInstance().getApplicationContext(), "外部类事件处理器响应", Toast.LENGTH_SHORT).show();
		return false;
	}

	
}
