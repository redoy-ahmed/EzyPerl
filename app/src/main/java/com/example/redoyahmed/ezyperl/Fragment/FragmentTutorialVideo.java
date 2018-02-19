package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterTutorial;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class FragmentTutorialVideo extends Fragment {

    View rootView;
    @BindView(R.id.recycler_view_tutorial_video)
    public RecyclerView tutorialVideoTextRecyclerView;
    public LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_tutorial_video, container, false);

        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).showFloatingActionButton();

        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        tutorialVideoTextRecyclerView.setHasFixedSize(true);
        tutorialVideoTextRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initializeData() {
        ArrayList<HomeItemObject> rowListItem = getAllItemList();
        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        RecyclerViewAdapterTutorial adapterTutorial = new RecyclerViewAdapterTutorial(rootView.getContext(), rowListItem, getFragmentManager());
        tutorialVideoTextRecyclerView.setAdapter(adapterTutorial);
    }

    private ArrayList<HomeItemObject> getAllItemList() {

        ArrayList<HomeItemObject> allItems = new ArrayList<>();
        allItems.add(new HomeItemObject("Tutorial one", R.drawable.tutorial));
        allItems.add(new HomeItemObject("Tutorial two", R.drawable.programming));
        allItems.add(new HomeItemObject("Tutorial three", R.drawable.quiz));
        allItems.add(new HomeItemObject("Tutorial four", R.drawable.link));

        return allItems;
    }
}