// Copyright (C) 2012 Droid Concepts c/o Lawrence Woodward

package com.droidconcepts.wallpapers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OurAppsActivity extends Activity 
{

    @Override
    public void onCreate(Bundle savedInstanceState)  
    {
    	
    	// Load layout.
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.our_apps);
        	
       // Wine Rack Button
        	Button beernotes = (Button) findViewById(R.id.beernotes_button);
        	beernotes.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent appsLink = new Intent(android.content.Intent.ACTION_VIEW);
        			appsLink.setData(Uri.parse("market://details?id=com.droidconcepts.beernotes"));
        			startActivity(appsLink);
        		}
        	});
        	
        // Cigar Box Button
        	Button cigarbox = (Button) findViewById(R.id.cigarbox_button);
        	cigarbox.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent beerLink = new Intent(android.content.Intent.ACTION_VIEW);
        			beerLink.setData(Uri.parse("market://details?id=com.droidconcepts.cigarbox"));
        			startActivity(beerLink);
        		}
        	});
        	
        // Coffee Pot Button
        	Button coffeepot = (Button) findViewById(R.id.coffeepot_button);
        	coffeepot.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent appLink = new Intent(android.content.Intent.ACTION_VIEW);
        			appLink.setData(Uri.parse("market://details?id=com.droidconcepts.coffeepot"));
        			startActivity(appLink);
        		}
        	});
	
        // Comic Box Button
        	Button comicbox = (Button) findViewById(R.id.comicbox_button);
        	comicbox.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent appLink = new Intent(android.content.Intent.ACTION_VIEW);
        			appLink.setData(Uri.parse("market://details?id=com.droidconcepts.comicbox"));
        			startActivity(appLink);
        		}
        	});
        	
        // Liquor Cabinet Button
        	Button liquorcabinet = (Button) findViewById(R.id.liquorcabinet_button);
        	liquorcabinet.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent appsLink = new Intent(android.content.Intent.ACTION_VIEW);
        			appsLink.setData(Uri.parse("market://details?id=com.droidconcepts.liquorcabinet"));
        			startActivity(appsLink);
        		}
        	});
        	
        // Wine Rack Button
        	Button winerack = (Button) findViewById(R.id.winerack_button);
        	winerack.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent appsLink = new Intent(android.content.Intent.ACTION_VIEW);
        			appsLink.setData(Uri.parse("market://details?id=com.droidconcepts.winerack"));
        			startActivity(appsLink);
        		}
        	});      
    }
    
}