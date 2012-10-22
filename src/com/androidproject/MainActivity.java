package com.androidproject;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return false;
	}

	public void rollDice(View view) {
		EditText editText = (EditText) findViewById(R.id.editText1);
		String text = editText.getText().toString();
		EditText editText2 = (EditText) findViewById(R.id.editText2);
		String text2 = editText2.getText().toString();
		EditText editText3 = (EditText) findViewById(R.id.editText3);
		String text3 = editText3.getText().toString();

		int diceNumber = Integer.parseInt(text);
		int diceSize = Integer.parseInt(text2);
		int result = Integer.parseInt(text3);
		Random random = new Random();
		for (int i = 0; i < diceNumber; i++) {
			result += random.nextInt(diceSize) + 1;
		}
		TextView textView = (TextView) findViewById(R.id.textView3);
		textView.setText(Integer.toString(result));
	}

}
