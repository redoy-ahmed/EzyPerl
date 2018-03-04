package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.CustomSpinnerAdapter;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.CustomSharedPreference;
import com.example.redoyahmed.ezyperl.Services.EzyPerlApplication;

import java.util.ArrayList;

import angtrim.com.fivestarslibrary.FiveStarsDialog;
import angtrim.com.fivestarslibrary.NegativeReviewListener;
import angtrim.com.fivestarslibrary.ReviewListener;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 01-Mar-2018.
 */

public class FragmentSettings extends Fragment implements NegativeReviewListener, ReviewListener {

    View rootView;

    private boolean isMusicOn;
    private boolean isSoundOn;
    private CustomSharedPreference shared;

    @BindView(R.id.language)
    public Spinner languageSpinner;

    @BindView(R.id.music)
    public SwitchCompat musicSwitch;

    @BindView(R.id.privacy_policy)
    public TextView privacyPolicy;

    @BindView(R.id.rate_the_app)
    public TextView rateTheApp;

    @BindView(R.id.sound)
    public SwitchCompat soundSwitch;

    @BindView(R.id.terms_of_usage)
    public TextView termsOfUsage;

    @BindView(R.id.third_party_licenses)
    public TextView thirdPartyLicense;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_settings, container, false);
        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        soundSwitch.setOnCheckedChangeListener(new ChangeSound());
        musicSwitch.setOnCheckedChangeListener(new ChangeMusic());
        rateTheApp.setOnClickListener(new Rating());

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).showFloatingActionButton();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Settings");
        MainActivity.navigationView.getMenu().getItem(5).setChecked(true);
    }

    private void initializeData() {

        shared = EzyPerlApplication.getShared(rootView.getContext());

        ArrayList<String> languages = new ArrayList();
        languages.add("English");
        languageSpinner.setAdapter(new CustomSpinnerAdapter(getActivity(), languages));

        if (shared.getSavedSound()) {
            soundSwitch.setChecked(true);
        } else {
            soundSwitch.setChecked(false);
        }

        if (shared.getSavedMusic()) {
            musicSwitch.setChecked(true);
        } else {
            musicSwitch.setChecked(false);
        }
    }

    private void showRatingDialog() {
        FiveStarsDialog fiveStarsDialog = new FiveStarsDialog(rootView.getContext(), "redoyahmed@gmail.com");
        fiveStarsDialog.setRateText("How is Ezy Perl?")
                .setTitle("Rate US")
                .setForceMode(false)
                .setUpperBound(2)
                .setNegativeReviewListener(this)
                .setReviewListener(this)
                .showAfter(0);
    }

    @Override
    public void onNegativeReview(int i) {

    }

    @Override
    public void onReview(int i) {

    }

    private class Rating implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            showRatingDialog();
        }
    }

    class ChangeMusic implements CompoundButton.OnCheckedChangeListener {
        ChangeMusic() {
        }

        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            isMusicOn = isChecked;
            if (isChecked) {
                shared.saveMusic(true);
            } else {
                shared.saveMusic(false);
            }
        }
    }

    class ChangeSound implements CompoundButton.OnCheckedChangeListener {
        ChangeSound() {
        }

        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            isSoundOn = isChecked;
            if (isChecked) {
                shared.saveSound(true);
            } else {
                shared.saveSound(false);
            }
        }
    }

}