package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.R;

import butterknife.ButterKnife;


public class FragmentTutorialText extends Fragment {

    View rootView;

    public FragmentTutorialText() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tutorial_text, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

}
