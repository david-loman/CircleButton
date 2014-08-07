package com.mindpin.android.circlebutton.sample;

import com.mindpin.android.circlebutton.CircleButton;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		CircleButton button1,button2,button3,button4,button5;
		button1=(CircleButton)findViewById(R.id.button1);
		button2=(CircleButton)findViewById(R.id.button2);
		button3=(CircleButton)findViewById(R.id.button3);
		button4=(CircleButton)findViewById(R.id.button4);
		button5=(CircleButton)findViewById(R.id.button5);
		
		//获取图片资源
		Resources res=getResources();
		Drawable drawable =res.getDrawable(R.drawable.ic_action_tick);
		//设置图片信息
		button2.set_fg_drawable(drawable);
		//设置文字
		button3.set_bg_color(Color.BLUE);
		button3.set_text("你好啊");
		button3.set_text_size_dp(20);
		//设置字体，颜色
		button4.set_typeface(Typeface.DEFAULT_BOLD);
//		button4.set_text_color(Color.RED);
		
		button1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "标准按钮", Toast.LENGTH_SHORT)
						.show();
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Java中加图片", Toast.LENGTH_SHORT)
						.show();
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Java中添加文字", Toast.LENGTH_SHORT)
						.show();
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "xml中定义文字的按钮", Toast.LENGTH_SHORT)
						.show();
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "默认按钮", Toast.LENGTH_SHORT)
						.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
