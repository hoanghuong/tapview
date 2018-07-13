package com.example.hoang.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private static final int INDEX_ONE = 0;
    private static final int INDEX_TWO= 1;
    private static final int INDEX_THREE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addevent();
    }

    private void addevent() {
        tapView();
    }

    private void init() {
        mViewPager = findViewById(R.id.viewpager_);
        mTablayout = findViewById(R.id.tablayout_tapview);
    }

    private void tapView() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        PagerAdapter pagerAdapter = new PagerAdapter(fragmentManager);
        mViewPager.setAdapter(pagerAdapter);
        mTablayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayout));
        mTablayout.setTabsFromPagerAdapter(pagerAdapter);
        mTablayout.getTabAt(INDEX_ONE).setIcon(R.drawable.tap_icon);
        mTablayout.getTabAt(INDEX_TWO).setIcon(R.drawable.tap_icon);
        mTablayout.getTabAt(INDEX_THREE).setIcon(R.drawable.tap_icon);
        mTablayout.getTabAt(INDEX_ONE).setText(R.string.first_tap_name);
        mTablayout.getTabAt(INDEX_TWO).setText(R.string.second_tap_name);
        mTablayout.getTabAt(INDEX_THREE).setText(R.string.third_tap_name);
    }
}




