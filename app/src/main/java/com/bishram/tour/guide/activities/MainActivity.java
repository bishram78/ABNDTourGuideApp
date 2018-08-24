package com.bishram.tour.guide.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bishram.tour.guide.R;
import com.bishram.tour.guide.adapters.CategoryAdapter;
import com.bishram.tour.guide.fragments.DamsLakesFragment;
import com.bishram.tour.guide.fragments.WaterfallsFragment;
import com.bishram.tour.guide.fragments.ZooAndParksFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.act_main_toolbar);
//        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.act_main_view_pager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        categoryAdapter.addFragment(new DamsLakesFragment(), getString(R.string.txt_dams_lakes));
        categoryAdapter.addFragment(new WaterfallsFragment(), getString(R.string.txt_waterfalls));
        categoryAdapter.addFragment(new ZooAndParksFragment(), getString(R.string.txt_zoo_parks));
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = findViewById(R.id.act_main_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
