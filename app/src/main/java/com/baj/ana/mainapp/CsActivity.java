package com.baj.ana.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class CsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout llsyllabus = (LinearLayout) findViewById(R.id.llsyllabus);
        LinearLayout llquestion = (LinearLayout) findViewById(R.id.llquestion);
        LinearLayout llmockup = (LinearLayout) findViewById(R.id.llmockup);

        llsyllabus.setOnClickListener(this);
        llquestion.setOnClickListener(this);
        llmockup.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llsyllabus:
                Intent i = new Intent(CsActivity.this,CssyllabusActivity.class);
                startActivity(i);
                break;

            case R.id.llquestion:
                Intent j = new Intent(CsActivity.this, CsqpActivity.class);
                startActivity(j);
                break;

            case R.id.llmockup:
                Intent mi= new Intent(this,MockListActivity.class);
                getSharedPreferences("mock_pref",MODE_PRIVATE).edit().putString("category","cs").apply();
                startActivity(mi);
                break;


        }

    }
}
