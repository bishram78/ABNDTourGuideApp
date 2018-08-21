package com.bishram.tour.guide.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bishram.tour.guide.R;
import com.bishram.tour.guide.adapters.CategoryAdapter;
import com.bishram.tour.guide.fragments.DamsLakesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.act_main_view_pager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        categoryAdapter.addFragment(new DamsLakesFragment(), getString(R.string.txt_dams_lakes));
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = findViewById(R.id.act_main_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
