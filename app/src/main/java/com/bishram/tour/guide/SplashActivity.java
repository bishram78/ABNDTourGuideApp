package com.bishram.tour.guide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bishram.tour.guide.activities.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int MILLIS_DELAYED = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        loadMainActivity();
    }

    private void loadMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, MILLIS_DELAYED);
    }
}
