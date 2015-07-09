package com.grifball.info;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class LinkActivity extends Activity {

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.info_page);
    // 1) How to replace link by text like "Click Here to visit Google" and
    // the text is linked with the website url ?
    TextView link = (TextView) findViewById(R.id.link);
    TextView hub = (TextView) findViewById(R.id.hub);
    
    Linkify.addLinks(link, Linkify.WEB_URLS);
    Linkify.addLinks(hub, Linkify.WEB_URLS);
    
	}
}
