package org.rudnick.iowavotes;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * {@link ElectionAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Step} objects.
 */
public class ElectionAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link ElectionAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public ElectionAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ElectionDatesFragment();
        } else if (position == 1) {
            return new ElectionTwoDatesFragment();
        } else {
            return new ElectionThreeDatesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 3;
    }

    /*@Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Election 1";
        } else if (position == 1) {
            return "Election 2";
        } else {
            return "Election 3";
        }
    }*/
}