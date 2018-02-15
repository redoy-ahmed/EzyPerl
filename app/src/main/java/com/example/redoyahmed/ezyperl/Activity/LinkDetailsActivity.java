package com.example.redoyahmed.ezyperl.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterHome;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

public class LinkDetailsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private WebView linkWebView;
    private String urlString, linkTitleString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_details);

        initializeWidgets();
        initializeData();
        setLoadedData();
    }

    private void initializeWidgets() {

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        linkWebView = findViewById(R.id.tutorial_link_webView);
    }

    private void initializeData() {
        linkTitleString = getIntent().getStringExtra("linkTitle");
        urlString = getIntent().getStringExtra("url");
    }

    private void setLoadedData() {
        getSupportActionBar().setTitle(linkTitleString);
        linkWebView.setWebViewClient(new WebViewClient());
        linkWebView.getSettings().setJavaScriptEnabled(true);
        linkWebView.loadUrl(urlString);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
