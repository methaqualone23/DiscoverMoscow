package com.example.stepanenko.discovermoscow;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class FragmentTabsPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"Sightseeings", "Museums", "Restaurants", "Parks"};
    private Context context;

    public FragmentTabsPagerAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SightseeingsFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
                return new ParksFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}