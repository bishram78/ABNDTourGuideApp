/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bishram.tour.guide.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bishram.tour.guide.R;

public class SplashActivity extends AppCompatActivity {

    // CONSTANT that hold the duration of Thread in MilliSeconds.
    private static final int MILLIS_DELAYED = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_splash.xml layout file
        setContentView(R.layout.activity_splash);

        // Method called after the 'onCreate' of the SplashActivity to load MainActivity
        loadMainActivity();
    }

    private void loadMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent that lead the current activity (SplashActivity) to next activity(MainActivity)
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

                // Destroy the current activity (The SplashActivity).
                finish();
            }
        }, MILLIS_DELAYED);
    }
}
