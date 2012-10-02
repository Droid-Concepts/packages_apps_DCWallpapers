// Copyright (C) 2012 Droid Concepts c/o Lawrence Woodward

package com.droidconcepts.wallpapers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutActivity extends Activity 
{

    @Override
    public void onCreate(Bundle savedInstanceState)  
    {
    	
    	// Load layout.
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.about);
        		
        // Feedback Button
        	Button feedback = (Button) findViewById(R.id.feedback_button);
        	feedback.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent feedbackLink = new Intent(android.content.Intent.ACTION_VIEW);
        			feedbackLink.setData(Uri.parse("mailto:apps@droidconcepts.com"));
        			startActivity(feedbackLink);
        		}
        	});
        	
        // Website Button
        	Button website = (Button) findViewById(R.id.website_button);
        	website.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent websiteLink = new Intent(android.content.Intent.ACTION_VIEW);
        			websiteLink.setData(Uri.parse("http://www.droidconcepts.com/"));
        			startActivity(websiteLink);
        		}
        	});
        	
        // Forum Button
        	Button forums = (Button) findViewById(R.id.forums_button);
        	forums.setOnClickListener(new OnClickListener()
        	{
        		public void onClick(View v)
        		{
        			Intent forumLink = new Intent(android.content.Intent.ACTION_VIEW);
        			forumLink.setData(Uri.parse("http://www.forums.droidconcepts.com/"));
        			startActivity(forumLink);
        		}
        	});
    }
    
}