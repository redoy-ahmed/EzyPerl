package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.ViewPagerAdapter;
import com.example.redoyahmed.ezyperl.R;
import com.loicteillard.easytabs.EasyTabs;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentTutorial extends Fragment {

    View rootView;

    @BindView(R.id.viewpager)
    public ViewPager viewPager;

    @BindView(R.id.easytabs)
    public EasyTabs easyTabs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_tutorial, container, false);
        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Tutorial");
        MainActivity.navigationView.getMenu().getItem(1).setChecked(true);

        ((MainActivity) getActivity()).showFloatingActionButton();
    }

    private void initializeData() {
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        easyTabs.setViewPager(viewPager, 0); // Set viewPager to EasyTabs with default index

        /*easyTabs.setPagerListener(new EasyTabs.PagerListener() { // Optional, add a listener
            @Override
            public void onTabSelected(int position) {
                Toast.makeText(rootView.getContext(), "tab selected:"+position, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
