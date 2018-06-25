package com.example.stepanenko.discovermoscow;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class FragmentTabsPagerAdapter extends FragmentPagerAdapter {
    public static final String SIGHTSEEINGS = "Sightseeings";
    public static final String MUSEUMS = "Museums";
    public static final String RESTAURANTS = "Restaurants";
    public static final String PARKS = "Parks";
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{SIGHTSEEINGS, MUSEUMS, RESTAURANTS, PARKS};
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