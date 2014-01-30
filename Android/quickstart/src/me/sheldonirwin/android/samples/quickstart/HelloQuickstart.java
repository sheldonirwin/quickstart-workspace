package me.sheldonirwin.android.samples.quickstart;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

/**
 * HelloQuickstart is a sample Activity showing a simple "Hello Quickstart" message.
 *
 * @author Sheldon Irwin <sheldon.irwin@gmail.com>
 */
public class HelloQuickstart extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// get all the view components
		// table = (TableLayout) findViewById(R.id.Table);
		
		// default the full screen to white
		// table.setBackgroundColor(Color.WHITE);
		
		// hook up all the buttons with a table color change on click listener
		// button.setOnClickListener(OnClickChangeColor(Color.RED));
		
	}

	/*
	/**
	* An OnClickListener that changes the color of the table.
	* @param color
	* @return
	* /
	View.OnClickListener OnClickChangeColor(final int color) {
		return new View.OnClickListener() {
			public void onClick(View view) {
				table.setBackgroundColor(color);
			}
		};
	}
	*/
	
}
