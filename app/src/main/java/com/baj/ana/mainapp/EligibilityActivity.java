package com.baj.ana.mainapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class EligibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligibility);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView htawebview = (WebView) findViewById(R.id.eligibilitywebview);
        htawebview.loadUrl("file:///android_asset/eligibility.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu1, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Bookmark:
                SharedPreferences bookmarks = getSharedPreferences("bookmarks", MODE_PRIVATE);
                String name = bookmarks.getString("EligibilityActivity", "");
                if (name.isEmpty()) {
                    bookmarks.edit().putString("EligibilityActivity", "EligibiltyActivity.class");
                } else {
                    Toast.makeText(EligibilityActivity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.home:
                Intent i = new Intent(this, Gate1Activity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                break;

            case R.id.logout:
                Intent j = new Intent(this, Logout.class);
                startActivity(j);
                break;

            case R.id.About:
                Intent k = new Intent(this, Aboutus.class);
                startActivity(k);
                break;


        }
        return true;

    }

}
