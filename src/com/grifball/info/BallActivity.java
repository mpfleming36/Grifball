package com.grifball.info;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;

public class BallActivity extends Activity {

private ShakeDetector mShakeDetector;
private SensorManager mSensorManager;

// Declare the MediaPlayer object
private MediaPlayer mMediaPlayer;

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.ball_page);

    // ShakeDetector initialization
    mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    mShakeDetector = new ShakeDetector();
    mMediaPlayer = MediaPlayer.create(BallActivity.this, R.raw.ball);
    

    mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {
        public void onShake() {
            // Initialize media player

            if (!mMediaPlayer.isPlaying()){
            mMediaPlayer.start();
            
            
            }
          }
            
        });
        };

        @Override
        protected void onResume() {
          super.onResume();
          mSensorManager.registerListener(mShakeDetector,
              mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
              SensorManager.SENSOR_DELAY_UI);
        }

        @Override
        protected void onPause() {
          mSensorManager.unregisterListener(mShakeDetector);
          super.onStop();
        }

		@Override
		protected void onDestroy() {
			// TODO Auto-generated method stub
			mMediaPlayer.release();
			super.onDestroy();
		}
        




}



