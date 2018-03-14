package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.AutoFitGridLayoutManager;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterTutorial;
import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.Category;
import com.example.redoyahmed.ezyperl.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class FragmentTutorial extends Fragment {

    View rootView;
    @BindView(R.id.recycler_view_tutorial_Text)
    public RecyclerView tutorialTextRecyclerView;
    public AutoFitGridLayoutManager layoutManager;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_tutorial, container, false);

        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).showFloatingActionButton();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Tutorial");
        MainActivity.navigationView.getMenu().getItem(1).setChecked(true);
    }

    private void initializeData() {

        DbHelper db = new DbHelper(rootView.getContext());
        List<Category> rowListItem = db.getAllTutorials();
        RecyclerViewAdapterTutorial adapterTutorial = new RecyclerViewAdapterTutorial(rootView.getContext(), rowListItem);
        tutorialTextRecyclerView.setAdapter(adapterTutorial);

        layoutManager = new AutoFitGridLayoutManager(rootView.getContext(), 500);
        tutorialTextRecyclerView.setLayoutManager(layoutManager);
    }
}
