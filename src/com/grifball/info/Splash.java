package com.grifball.info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    setTheme(android.R.style.Theme_Light_NoTitleBar);
    setContentView(R.layout.splash);

    Handler handler = new Handler();

    handler.postDelayed(new Runnable(){
        public void run(){

            finish();
            Intent intent = new Intent(Splash.this, MainActivity.class);
            Splash.this.startActivity(intent);
        }
    }, 2000);
}

}
