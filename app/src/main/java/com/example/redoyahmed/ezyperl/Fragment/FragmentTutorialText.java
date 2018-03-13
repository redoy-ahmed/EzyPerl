package com.example.redoyahmed.ezyperl.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.TutorialItems;
import com.example.redoyahmed.ezyperl.R;

import java.util.List;

import butterknife.ButterKnife;


@SuppressLint("ValidFragment")
public class FragmentTutorialText extends Fragment {

    private View rootView;
    private int category_id;
    private List<TutorialItems> tutorialItems;

    public FragmentTutorialText(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tutorial_text, container, false);
        ButterKnife.bind(this, rootView);

        loadData(category_id);
        loadDataIntoWidgets();

        return rootView;
    }

    private void loadData(int category_id) {
        DbHelper db = new DbHelper(rootView.getContext());
        tutorialItems = db.getTutorialDetailsByCategory(category_id);
    }

    private void loadDataIntoWidgets() {

    }
}
