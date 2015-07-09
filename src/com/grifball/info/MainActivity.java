package com.grifball.info;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	Button bhammer, bsword, bball;
	ImageButton binfo;
	TextView tvintro;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bhammer = (Button) findViewById(R.id.button_hammer);
		bsword = (Button) findViewById(R.id.button_sword);
		bball = (Button) findViewById(R.id.button_ball);
		binfo = (ImageButton) findViewById(R.id.infobutton);
		tvintro = (TextView) findViewById(R.id.intro);
		
		//custom font
		Typeface tf = Typeface.createFromAsset(getAssets(),
			"fonts/neuropol.ttf");
		tvintro.setTypeface(tf);
		
		bhammer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                Intent myIntent = new Intent(MainActivity.this, HammerActivity.class);
                myIntent.setAction(Intent.ACTION_VIEW);
                
                myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                MainActivity.this.startActivity(myIntent);

            }
        });
		
		bsword.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                Intent myIntent = new Intent(MainActivity.this, SwordActivity.class);
                myIntent.setAction(Intent.ACTION_VIEW);
                
                myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                MainActivity.this.startActivity(myIntent);

            }
        });
		
		bball.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                Intent myIntent = new Intent(MainActivity.this, BallActivity.class);
                myIntent.setAction(Intent.ACTION_VIEW);
                
                myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                MainActivity.this.startActivity(myIntent);

            }
        });
		
		binfo.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
            Intent myIntent = new Intent(MainActivity.this, InfoActivity.class);
            myIntent.setAction(Intent.ACTION_VIEW);
            
            myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            MainActivity.this.startActivity(myIntent);

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
