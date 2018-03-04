package com.example.redoyahmed.ezyperl.Activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterAnalysis;
import com.example.redoyahmed.ezyperl.Model.ResultItem;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.EzyPerlApplication;
import com.example.redoyahmed.ezyperl.Utils.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AnalysisActivity extends AppCompatActivity {

    @BindView(R.id.quiz_result)
    public RecyclerView resultRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        ButterKnife.bind(this);

        loadWidgetsData();

    }

    private void loadWidgetsData() {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        List<ResultItem> submittedResult = arrayToListObject(EzyPerlApplication.getGsonObject().fromJson(getIntent().getExtras().getString(Constants.QUIZ_RESULT), ResultItem[].class));

        resultRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        resultRecyclerView.setHasFixedSize(true);
        resultRecyclerView.setAdapter(new RecyclerViewAdapterAnalysis(submittedResult));
    }

    private List<ResultItem> arrayToListObject(ResultItem[] response) {
        List<ResultItem> allCategories = new ArrayList();
        Collections.addAll(allCategories, response);
        return allCategories;
    }
}
