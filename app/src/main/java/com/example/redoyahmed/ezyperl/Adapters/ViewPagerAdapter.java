package com.example.redoyahmed.ezyperl.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorialText;
import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorialVideo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static final int TAB_1 = 0;
    private static final int TAB_2 = 1;

    private static final int NB_TABS = 2;

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case TAB_1:
                FragmentTutorialText text = new FragmentTutorialText();
                return text;

            case TAB_2:
                FragmentTutorialVideo video = new FragmentTutorialVideo();
                return video;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NB_TABS;
    }
}