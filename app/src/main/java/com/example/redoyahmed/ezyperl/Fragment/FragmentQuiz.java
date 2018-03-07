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
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterProfile;
import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.PerformanceItem;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentQuiz extends Fragment {

    View rootView;
    @BindView(R.id.performance_list)
    public RecyclerView performanceRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_quiz, container, false);
        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Quiz");
        MainActivity.navigationView.getMenu().getItem(3).setChecked(true);
        performanceRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void initializeData() {
        DbHelper db = new DbHelper(rootView.getContext());
        List<PerformanceItem> returnedScores = db.getAllCategories();
        performanceRecyclerView.setAdapter(new RecyclerViewAdapterProfile(getActivity(), returnedScores));
    }
}