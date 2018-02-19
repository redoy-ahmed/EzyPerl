package com.example.redoyahmed.ezyperl.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.redoyahmed.ezyperl.Fragment.FragmentHome;
import com.example.redoyahmed.ezyperl.Fragment.FragmentLinks;
import com.example.redoyahmed.ezyperl.Fragment.FragmentPractise;
import com.example.redoyahmed.ezyperl.Fragment.FragmentQuiz;
import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorial;
import com.example.redoyahmed.ezyperl.R;

import angtrim.com.fivestarslibrary.FiveStarsDialog;
import angtrim.com.fivestarslibrary.NegativeReviewListener;
import angtrim.com.fivestarslibrary.ReviewListener;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements NegativeReviewListener, ReviewListener, NavigationView.OnNavigationItemSelectedListener {

    private FloatingActionButton fabPractiseButton;
    public static NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeWidgets();

        fabPractiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentPractise()).commit();

            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);
        onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_home));
    }

    private void initializeWidgets() {
        fabPractiseButton = findViewById(R.id.fab_practise_button);
        navigationView = findViewById(R.id.nav_view);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        Fragment mFragment = null;
        FragmentManager mFragmentManager = getSupportFragmentManager();

        int id = item.getItemId();

        if (id == R.id.nav_home) {
            mFragment = new FragmentHome();
        } else if (id == R.id.nav_tutorial) {
            mFragment = new FragmentTutorial();
        } else if (id == R.id.nav_practise) {
            mFragment = new FragmentPractise();
        } else if (id == R.id.nav_quiz) {
            mFragment = new FragmentQuiz();
        } else if (id == R.id.nav_links) {
            mFragment = new FragmentLinks();
        } else if (id == R.id.nav_rate_us) {
            showRatingDialog();
            onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_home));
        }

        if (mFragment != null) {
            mFragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showRatingDialog() {
        FiveStarsDialog fiveStarsDialog = new FiveStarsDialog(this, "redoyahmed@gmail.com");
        fiveStarsDialog.setRateText("How is Ezy Perl?")
                .setTitle("Rate US")
                .setForceMode(false)
                .setUpperBound(2)
                .setNegativeReviewListener(MainActivity.this)
                .setReviewListener(this)
                .showAfter(0);
    }

    @Override
    public void onNegativeReview(int i) {

    }

    @Override
    public void onReview(int i) {

    }

    public void showFloatingActionButton() {
        fabPractiseButton.show();
    }

    public void hideFloatingActionButton() {
        fabPractiseButton.hide();
    }
}
