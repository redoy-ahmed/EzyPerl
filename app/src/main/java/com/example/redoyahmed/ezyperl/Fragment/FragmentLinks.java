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
import com.example.redoyahmed.ezyperl.Model.LinksItem;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentLinks extends Fragment {

    View rootView;
    @BindView(R.id.recycler_view_links)
    public RecyclerView linksRecyclerView;
    public LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_links, container, false);

        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).showFloatingActionButton();

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Links");
        MainActivity.navigationView.getMenu().getItem(4).setChecked(true);

        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        linksRecyclerView.setHasFixedSize(true);
        linksRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initializeData() {
        ArrayList<LinksItem> rowListItem = getAllItemList();
        linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        RecyclerViewAdapterLinks adapterLinks = new RecyclerViewAdapterLinks(rootView.getContext(), rowListItem, getFragmentManager());
        linksRecyclerView.setAdapter(adapterLinks);
    }

    private ArrayList<LinksItem> getAllItemList() {

        ArrayList<LinksItem> allItems = new ArrayList<>();
        allItems.add(new LinksItem("Tutorials Point", "https://www.tutorialspoint.com/perl/index.htm", 5));
        allItems.add(new LinksItem("Perl Documentation", "https://learn.perl.org/tutorials/", 5));
        allItems.add(new LinksItem("Java-T-Point", "https://www.javatpoint.com/perl-tutorial", 5));
        allItems.add(new LinksItem("Perl Maven", "https://perlmaven.com/perl-tutorial", 5));
        allItems.add(new LinksItem("Guru", "https://www.guru99.com/perl-tutorials.html", 5));
        allItems.add(new LinksItem("Tizag Tutorial", "http://www.tizag.com/perlT/", 5));
        allItems.add(new LinksItem("Perl Beginners", "http://perl-begin.org/tutorials/", 5));
        allItems.add(new LinksItem("Perl Tutorial Hub", "http://perl-tutorial.org/", 5));
        allItems.add(new LinksItem("Beginners Book", "https://beginnersbook.com/2017/02/perl-tutorial-for-beginners/", 5));

        return allItems;
    }
}