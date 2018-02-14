package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.R;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentQuiz extends Fragment {

    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_quiz, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Quiz");
        MainActivity.navigationView.getMenu().getItem(3).setChecked(true);

        return rootView;
    }
}