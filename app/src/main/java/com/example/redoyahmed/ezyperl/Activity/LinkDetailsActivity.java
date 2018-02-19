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

import butterknife.BindView;
import butterknife.ButterKnife;

public class LinkDetailsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    @BindView(R.id.tutorial_link_webView)
    public WebView linkWebView;

    private String urlString, linkTitleString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_details);
        ButterKnife.bind(this);

        initializeWidgets();
        initializeData();
        setLoadedData();
    }

    private void initializeWidgets() {

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initializeData() {
        linkTitleString = getIntent().getStringExtra("linkTitle");
        urlString = getIntent().getStringExtra("url");
    }

    private void setLoadedData() {
        getSupportActionBar().setTitle(linkTitleString);
        linkWebView.setWebViewClient(new WebViewClient());
        linkWebView.getSettings().setJavaScriptEnabled(true);
        linkWebView.getSettings().setBuiltInZoomControls(true);
        linkWebView.getSettings().setDisplayZoomControls(false);
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
