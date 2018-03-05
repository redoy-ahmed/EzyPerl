package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amitshekhar.DebugDB;
import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.AutoFitGridLayoutManager;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterHome;
import com.example.redoyahmed.ezyperl.Model.HomeItem;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 13-Feb-2018.
 */

public class FragmentHome extends Fragment {

    View rootView;

    @BindView(R.id.recycler_view_home)
    public RecyclerView homeRecyclerView;
    public AutoFitGridLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Home");
        ((MainActivity) getActivity()).showFloatingActionButton();
    }

    private void initializeData() {
        DebugDB.getAddressLog();
        ArrayList<HomeItem> rowListItem = getAllItemList();
        RecyclerViewAdapterHome adapterHome = new RecyclerViewAdapterHome(rootView.getContext(), rowListItem, getFragmentManager());
        homeRecyclerView.setAdapter(adapterHome);

        layoutManager = new AutoFitGridLayoutManager(rootView.getContext(), 500);
        homeRecyclerView.setLayoutManager(layoutManager);
    }

    private ArrayList<HomeItem> getAllItemList() {

        ArrayList<HomeItem> allItems = new ArrayList<>();
        allItems.add(new HomeItem("Tutorial", R.drawable.tutorial, "#09A9FF"));
        allItems.add(new HomeItem("practise", R.drawable.programming, "#3E51B1"));
        allItems.add(new HomeItem("Quiz", R.drawable.quiz, "#673BB7"));
        allItems.add(new HomeItem("Links", R.drawable.link, "#4BAA50"));

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
