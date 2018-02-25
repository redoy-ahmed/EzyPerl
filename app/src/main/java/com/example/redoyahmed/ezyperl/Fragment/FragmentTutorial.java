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
import com.example.redoyahmed.ezyperl.Model.TextTutorialItem;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.redoyahmed.ezyperl.Utils.Colors.colors;

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

        ArrayList<TextTutorialItem> rowListItem = getAllItemList();
        RecyclerViewAdapterTutorial adapterHome = new RecyclerViewAdapterTutorial(rootView.getContext(), rowListItem, getFragmentManager());
        tutorialTextRecyclerView.setAdapter(adapterHome);

        layoutManager = new AutoFitGridLayoutManager(rootView.getContext(), 500);
        tutorialTextRecyclerView.setLayoutManager(layoutManager);
    }

    private ArrayList<TextTutorialItem> getAllItemList() {

        ArrayList<TextTutorialItem> allItems = new ArrayList<>();
        allItems.add(new TextTutorialItem("Tutorial one", R.drawable.tutorial, colors[new Random().nextInt(colors.length)]));
        allItems.add(new TextTutorialItem("Tutorial two", R.drawable.programming, colors[new Random().nextInt(colors.length)]));
        allItems.add(new TextTutorialItem("Tutorial three", R.drawable.quiz, colors[new Random().nextInt(colors.length)]));
        allItems.add(new TextTutorialItem("Tutorial four", R.drawable.link, colors[new Random().nextInt(colors.length)]));

        return allItems;
    }
}
