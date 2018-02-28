package com.example.redoyahmed.ezyperl.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.redoyahmed.ezyperl.R;

import butterknife.ButterKnife;

public class QuizDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_detail);
        ButterKnife.bind(this);


    }
}
