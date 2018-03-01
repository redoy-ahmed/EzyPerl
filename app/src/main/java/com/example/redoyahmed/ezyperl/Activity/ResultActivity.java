package com.example.redoyahmed.ezyperl.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.redoyahmed.ezyperl.Model.ResultItem;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {
    private String mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        mResult = getIntent().getExtras().getString(Constants.QUIZ_RESULT);

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        List<ResultItem> submittedResult = arrayToListObject(gson.fromJson(mResult, ResultItem[].class));

        Log.e("Result Size", submittedResult.size() + "");
    }

    private List<ResultItem> arrayToListObject(ResultItem[] response) {
        List<ResultItem> allCategories = new ArrayList();
        Collections.addAll(allCategories, response);
        return allCategories;
    }
}
