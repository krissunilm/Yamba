package com.example.yamba;

import com.marakana.android.yamba.clientlib.YambaClient;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StatusActivity extends Activity implements TextWatcher, OnClickListener {

	private static final int MAX_CHARS =140;
	private TextView charCountText;
	private EditText statusText;

	private int numLeft = MAX_CHARS;
	private Button postButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_status);
		
		
		charCountText= (TextView)findViewById(R.id.char_count) ;
		statusText = (EditText)findViewById(R.id.status);
	    postButton = (Button)findViewById(R.id.post);
		
		charCountText.setText(String.valueOf(numLeft));
		
		statusText.addTextChangedListener(this);
		postButton.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.status, menu);
		return true;
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		numLeft = MAX_CHARS - s.length();
		charCountText.setText(String.valueOf(numLeft));
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		YambaClient yambaClient = new YambaClient("student","password"); 
		
	}

}
