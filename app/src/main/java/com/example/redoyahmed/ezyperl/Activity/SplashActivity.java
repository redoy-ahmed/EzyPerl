package com.example.redoyahmed.ezyperl.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.CustomSharedPreference;
import com.example.redoyahmed.ezyperl.Services.EzyPerlApplication;
import com.ramotion.paperonboarding.PaperOnboardingEngine;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    private CustomSharedPreference shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_main_layout);

        shared = EzyPerlApplication.getShared(getApplicationContext());

        if (shared.getSavedIsFirstTimeOpening() == true) {
            initializeWidgets();
            loadData();
        } else {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
    }

    private void initializeWidgets() {
        ButterKnife.bind(this);
    }

    private void loadData() {
        PaperOnboardingEngine engine = new PaperOnboardingEngine(findViewById(R.id.onboardingRootView), getDataForOnBoarding(), getApplicationContext());
        engine.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {
                shared.saveIsFirstTimeOpening(false);
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }

    private ArrayList<PaperOnboardingPage> getDataForOnBoarding() {
        PaperOnboardingPage scr1 = new PaperOnboardingPage("Learning", "A simple way to learn Perl everyday", Color.parseColor("#9B90BC"), R.drawable.tutorial, R.drawable.ic_menu_tutorial);
        PaperOnboardingPage scr2 = new PaperOnboardingPage("Practise", "Practise the code by running it anytime", Color.parseColor("#678FB4"), R.drawable.programming, R.drawable.ic_menu_practise);
        PaperOnboardingPage scr3 = new PaperOnboardingPage("Guideline", "Simple and easy guidelines for better performance in quiz", Color.parseColor("#65B0B4"), R.drawable.quiz, R.drawable.ic_menu_quiz);

        ArrayList<PaperOnboardingPage> elements = new ArrayList();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);
        return elements;
    }
}
