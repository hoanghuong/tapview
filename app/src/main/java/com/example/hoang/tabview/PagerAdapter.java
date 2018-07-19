package com.example.hoang.tabview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private static final int CASEONE = 1;
    private static final int CASETWO = 2;
    private static final int CASETHREE = 3;
    private static final int CASESIZE = 3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case CASEONE:
                fragment = new FirstFragment();
                break;
            case CASETWO:
                fragment = new SecondFragment();
                break;
            case CASETHREE:
                fragment = new ThirdFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return CASESIZE;
    }
}


