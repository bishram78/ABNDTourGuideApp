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

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bishram.tour.guide.R;
import com.bishram.tour.guide.adapters.CategoryAdapter;
import com.bishram.tour.guide.fragments.DamsLakesFragment;
import com.bishram.tour.guide.fragments.OthersFragment;
import com.bishram.tour.guide.fragments.WaterfallsFragment;
import com.bishram.tour.guide.fragments.ZooAndParksFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.act_main_view_pager);

        // Create a custom adapter that knows which fragment should be shown on each page
        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager());

        // Add fragments and its title to the activity.
        categoryAdapter.addFragment(new DamsLakesFragment(), getString(R.string.txt_dams_lakes));
        categoryAdapter.addFragment(new WaterfallsFragment(), getString(R.string.txt_waterfalls));
        categoryAdapter.addFragment(new ZooAndParksFragment(), getString(R.string.txt_zoo_parks));
        categoryAdapter.addFragment(new OthersFragment(), getString(R.string.txt_other_attractions));

        // Set the adapter onto the view pager
        viewPager.setAdapter(categoryAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.act_main_tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
