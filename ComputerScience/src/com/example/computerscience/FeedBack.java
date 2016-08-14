package com.example.computerscience;

import android.os.Bundle;
import android.app.Activity;
import android.text.util.Linkify;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FeedBack extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed_back);
		LinearLayout feedback_layout = (LinearLayout)findViewById(R.id.feedback_layout);
        TextView myWebSite = new TextView(this);
		myWebSite .setText("http://localhost/Computer_science/feedback.php/");
        Linkify.addLinks(myWebSite , Linkify.WEB_URLS); 
        feedback_layout.addView(myWebSite);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feed_back, menu);
		return true;
	}

}
