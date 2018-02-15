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
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterLinks;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterTutorial;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.Model.LinksItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentLinks extends Fragment {

    View rootView;
    private RecyclerView linksRecyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_links, container, false);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).showFloatingActionButton();

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Links");
        MainActivity.navigationView.getMenu().getItem(4).setChecked(true);

        linksRecyclerView = rootView.findViewById(R.id.recycler_view_links);
        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        linksRecyclerView.setHasFixedSize(true);
        linksRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initializeData() {
        ArrayList<LinksItemObject> rowListItem = getAllItemList();
        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        RecyclerViewAdapterLinks adapterLinks = new RecyclerViewAdapterLinks(rootView.getContext(), rowListItem, getFragmentManager());
        linksRecyclerView.setAdapter(adapterLinks);
    }

    private ArrayList<LinksItemObject> getAllItemList() {

        ArrayList<LinksItemObject> allItems = new ArrayList<>();
        allItems.add(new LinksItemObject("Tutorials Point", "https://www.tutorialspoint.com/perl/index.htm", 5));
        allItems.add(new LinksItemObject("Perl Documentation", "https://learn.perl.org/tutorials/", 5));
        allItems.add(new LinksItemObject("Java-T-Point", "https://www.javatpoint.com/perl-tutorial", 5));
        allItems.add(new LinksItemObject("Perl Maven", "https://perlmaven.com/perl-tutorial", 5));

        return allItems;
    }
}