package com.ernest33.xposedcustombackgroundnotif;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CNB_Settings extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cnb__settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cnb__settings, menu);
		return true;
	}

}
