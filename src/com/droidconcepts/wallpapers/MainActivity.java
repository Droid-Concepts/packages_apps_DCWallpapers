// Copyright (C) 2012 Droid Concepts c/o Lawrence Woodward

package com.droidconcepts.wallpapers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity 
{
	
	private Button wallpaper;
	private Button about;
	private Button our_apps;
	private Intent i;

    @Override
    public void onCreate(Bundle savedInstanceState)  
    {
    	// Show EULA.
        	requestWindowFeature(Window.FEATURE_NO_TITLE);
        	Eula.show(this);
    	
    	// Load layout from main.
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.main);
        	
        // Setup buttons
        	// Wallpaper Button
    		wallpaper = (Button)findViewById(R.id.wallpaper_button);
    		wallpaper.setOnClickListener(new OnClickListener() 
    		{
    			public void onClick(View v)
    			{
    				i = new Intent(MainActivity.this, com.droidconcepts.wallpapers.WallpapersActivity.class);
    				startActivity(i);
    			}
    		});
        	// About Button
    		about = (Button)findViewById(R.id.about_button);
    		about.setOnClickListener(new OnClickListener() 
    		{
    			public void onClick(View v)
    			{
    				i = new Intent(MainActivity.this, com.droidconcepts.wallpapers.AboutActivity.class);
    				startActivity(i);
    			}
    		});
    		// Our Apps Button
    		our_apps = (Button)findViewById(R.id.our_apps_button);
    		our_apps.setOnClickListener(new OnClickListener() 
    		{
    			public void onClick(View v)
    			{
    				i = new Intent(MainActivity.this, com.droidconcepts.wallpapers.OurAppsActivity.class);
    				startActivity(i);
    			}
    		});
    }
    
    public static Intent createIntent(Context context)  
    {
    	// Intent
    		Intent i = new Intent(context, MainActivity.class);
        	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        	return i;
    }
    
}