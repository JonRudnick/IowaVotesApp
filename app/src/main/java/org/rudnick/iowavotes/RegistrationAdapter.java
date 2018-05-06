package org.rudnick.iowavotes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * {@link RegistrationAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Step} objects.
 */
class RegistrationAdapter extends FragmentPagerAdapter {

    /**
     * Create a new {@link RegistrationAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    RegistrationAdapter(FragmentManager fm) {
        super(fm);
        /* Context of the app */
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ViewRegistrationOnlineFragment();
            case 1:
                return new ViewRegistrationByMailFragment();
            default:
                return new ViewRegistrationInPersonFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Online";
            case 1:
                return "By Mail";
            default:
                return "In Person";
        }
    }
}