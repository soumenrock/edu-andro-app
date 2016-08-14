package com.example.computerscience;


import android.os.Bundle;
import android.app.Activity;
import android.text.util.Linkify;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CourseContent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_content);
		LinearLayout mainLayout = (LinearLayout)findViewById(R.id.main_layout);
        TextView myWebSite = new TextView(this);
		myWebSite .setText("http://localhost/Computer_science/course_fetch.php/");
        Linkify.addLinks(myWebSite , Linkify.WEB_URLS); 
        mainLayout.addView(myWebSite);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course_content, menu);
		return true;
	}

}
