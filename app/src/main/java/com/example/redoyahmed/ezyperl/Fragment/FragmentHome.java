package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterHome;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

/**
 * Created by redoy.ahmed on 13-Feb-2018.
 */

public class FragmentHome extends Fragment {

    View rootView;

    private RecyclerView homeRecyclerView;
    private GridLayoutManager gridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, null);
        //setHasOptionsMenu(true);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        homeRecyclerView = rootView.findViewById(R.id.recycler_view_home);
        gridLayoutManager = new GridLayoutManager(rootView.getContext(), 2);

        homeRecyclerView.setHasFixedSize(true);
        homeRecyclerView.setLayoutManager(gridLayoutManager);
    }

    private void initializeData() {
        ArrayList<HomeItemObject> rowListItem = getAllItemList();
        gridLayoutManager = new GridLayoutManager(rootView.getContext(), 2);

        RecyclerViewAdapterHome adapterHome = new RecyclerViewAdapterHome(rootView.getContext(), rowListItem, getFragmentManager());
        homeRecyclerView.setAdapter(adapterHome);
    }

    private ArrayList<HomeItemObject> getAllItemList() {

        ArrayList<HomeItemObject> allItems = new ArrayList<HomeItemObject>();
        allItems.add(new HomeItemObject("Tutorial", R.drawable.tutorial));
        allItems.add(new HomeItemObject("practise", R.drawable.programming));
        allItems.add(new HomeItemObject("Quiz", R.drawable.quiz));
        allItems.add(new HomeItemObject("Links", R.drawable.link));

        return allItems;
    }

    /*@Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_practise, menu);
    }*/
}
