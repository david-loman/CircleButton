package com.mindpin.android.circlebutton.test;

import com.mindpin.android.circlebutton.CircleButton;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		CircleButton bt1, bt2, bt3, bt4, bt5;
		bt1 = (CircleButton) findViewById(R.id.button1);
		bt2 = (CircleButton) findViewById(R.id.button2);
		bt3 = (CircleButton) findViewById(R.id.button3);
		bt4 = (CircleButton) findViewById(R.id.button4);
		bt5 = (CircleButton) findViewById(R.id.button5);

		// bt1
		String text = "Hello";
		bt1.set_text(text);
		bt1.set_text_color(Color.BLUE);
		bt1.set_bg_color(Color.GREEN);
		bt1.set_text_size_dp(10);
		bt1.set_pressed_ring_width(8);

		// bt5
		Resources resources = getResources();
		Drawable drawable = resources.getDrawable(R.drawable.ic_action_tick);
		bt5.set_fg_drawable(drawable);
		bt5.set_pressed_ring_width(8);
		bt5.set_bg_color(Color.RED);

		bt1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "character by coding", Toast.LENGTH_SHORT).show();
			}
		});

		bt2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "character by xml", Toast.LENGTH_SHORT).show();
			}
		});

		bt3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "standard CircleButton", Toast.LENGTH_SHORT).show();
			}
		});

		bt4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Drawable by xml", Toast.LENGTH_SHORT).show();
			}
		});

		bt5.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Drawable by coding", Toast.LENGTH_SHORT).show();
			}
		});
	}

}
