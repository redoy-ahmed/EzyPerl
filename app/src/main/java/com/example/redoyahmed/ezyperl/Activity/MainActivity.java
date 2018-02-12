package com.example.redoyahmed.ezyperl.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterHome;
import com.example.redoyahmed.ezyperl.Fragment.FragmentLinks;
import com.example.redoyahmed.ezyperl.Fragment.FragmentPractise;
import com.example.redoyahmed.ezyperl.Fragment.FragmentQuiz;
import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorial;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView homeRecyclerView;
    private FloatingActionButton fab;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeWidgets();
        initializeData();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void initializeWidgets() {
        homeRecyclerView = findViewById(R.id.recycler_view_home);
        fab = findViewById(R.id.fab);
        gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);

        homeRecyclerView.setHasFixedSize(true);
        homeRecyclerView.setLayoutManager(gridLayoutManager);
    }

    private void initializeData() {
        ArrayList<HomeItemObject> rowListItem = getAllItemList();
        gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);

        RecyclerViewAdapterHome adapterHome = new RecyclerViewAdapterHome(MainActivity.this, rowListItem);
        homeRecyclerView.setAdapter(adapterHome);
    }

    private ArrayList<HomeItemObject> getAllItemList() {

        ArrayList<HomeItemObject> allItems = new ArrayList<HomeItemObject>();
        allItems.add(new HomeItemObject("Tutorial", R.drawable.tutorial));
        allItems.add(new HomeItemObject("practise", R.drawable.programming));
        allItems.add(new HomeItemObject("Quiz", R.drawable.quiz));
        allItems.add(new HomeItemObject("Links", R.drawable.link));

        return allItems;
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

        if (id == R.id.nav_tutorial) {
            mFragment = new FragmentTutorial();
        } else if (id == R.id.nav_practise) {
            mFragment = new FragmentPractise();
        } else if (id == R.id.nav_quiz) {
            mFragment = new FragmentQuiz();
        } else if (id == R.id.nav_links) {
            mFragment = new FragmentLinks();
        }

        if (mFragment != null) {
            mFragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
