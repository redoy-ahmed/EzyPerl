package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterHome;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterTutorial;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewHolderTutorial;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentTutorial extends Fragment {

    View rootView;

    private RecyclerView tutorialRecyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_tutorial, null);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        tutorialRecyclerView = rootView.findViewById(R.id.recycler_view_tutorial);
        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        tutorialRecyclerView.setHasFixedSize(true);
        tutorialRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initializeData() {
        ArrayList<HomeItemObject> rowListItem = getAllItemList();
        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        RecyclerViewAdapterTutorial adapterTutorial = new RecyclerViewAdapterTutorial(rootView.getContext(), rowListItem, getFragmentManager());
        tutorialRecyclerView.setAdapter(adapterTutorial);
    }

    private ArrayList<HomeItemObject> getAllItemList() {

        ArrayList<HomeItemObject> allItems = new ArrayList<HomeItemObject>();
        allItems.add(new HomeItemObject("Tutorial one", R.drawable.tutorial));
        allItems.add(new HomeItemObject("Tutorial two", R.drawable.programming));
        allItems.add(new HomeItemObject("Tutorial three", R.drawable.quiz));
        allItems.add(new HomeItemObject("Tutorial four", R.drawable.link));

        return allItems;
    }
}
