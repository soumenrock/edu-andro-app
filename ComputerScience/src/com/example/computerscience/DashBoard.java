package com.example.computerscience;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class DashBoard extends Activity {
	
	ImageButton elearning,contact_us,feedback,about;
	String srcid="Computer_Science_Dashboard";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dash_board);
		
		
		
		elearning =  (ImageButton)findViewById(R.id.elearning);
		feedback =  (ImageButton)findViewById(R.id.feedback);
		contact_us =  (ImageButton)findViewById(R.id.contact_us);
		about = (ImageButton)findViewById(R.id.about_us);
		
		elearning.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent aboutIntent=new Intent(DashBoard.this,com.example.computerscience.CourseContent.class);
				startActivity(aboutIntent);
			}
		});
		feedback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent aboutIntent=new Intent(DashBoard.this,com.example.computerscience.FeedBack.class);
				startActivity(aboutIntent);
				
				
			}
		});
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent aboutIntent=new Intent(DashBoard.this,com.example.computerscience.About.class);
				startActivity(aboutIntent);
			}
		});
		
		
		contact_us.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(),"No Details Found", Toast.LENGTH_LONG).show();
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dash_board, menu);
		return true;
	}

}
