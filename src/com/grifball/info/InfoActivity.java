package com.grifball.info;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class InfoActivity extends Activity {

public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    setTheme(android.R.style.Theme_Light_NoTitleBar);
    setContentView(R.layout.info_page);

    TextView link = (TextView) findViewById(R.id.usagerules);
    Linkify.addLinks(link, Linkify.WEB_URLS);



}

}
