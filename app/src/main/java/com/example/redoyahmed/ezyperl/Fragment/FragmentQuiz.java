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
import com.example.redoyahmed.ezyperl.Model.PerformanceObject;
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
        PerformanceObject one = new PerformanceObject("Data Type", "2");
        PerformanceObject two = new PerformanceObject("String", "0");
        PerformanceObject three = new PerformanceObject("Array", "1");
        PerformanceObject four = new PerformanceObject("List", "3");
        PerformanceObject five = new PerformanceObject("Custom", "5");
        PerformanceObject six = new PerformanceObject("Class", "70");


        List<PerformanceObject> returnedScores = new ArrayList<>();
        returnedScores.add(one);
        returnedScores.add(two);
        returnedScores.add(three);
        returnedScores.add(four);
        returnedScores.add(five);
        returnedScores.add(six);

        performanceRecyclerView.setAdapter(new RecyclerViewAdapterProfile(getActivity(), returnedScores));
    }
}