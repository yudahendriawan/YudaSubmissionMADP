package com.example.yudasubmissionmadp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutMe extends AppCompatActivity {
    private String titleToolbar = "About Me";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        getSupportActionBar().setTitle(titleToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onBackPressed(){

    }

}
