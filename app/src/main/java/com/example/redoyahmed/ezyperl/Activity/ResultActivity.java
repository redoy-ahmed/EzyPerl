package com.example.redoyahmed.ezyperl.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.redoyahmed.ezyperl.R;

import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
    }
}
