package com.example.tienthanh.mysecond.Activity;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tienthanh.mysecond.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.nav_open_drawer, R.string.nav_close_drawer);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        ImageView viewContent1 = findViewById(R.id.view_content1);
        ImageView viewContent2 = findViewById(R.id.view_content2);
        ImageView viewContent3 = findViewById(R.id.view_content3);
        ImageView viewContent4 = findViewById(R.id.view_content4);

        final LinearLayout content1 = findViewById(R.id.content1);
        final LinearLayout content2 = findViewById(R.id.content2);
        final LinearLayout content3 = findViewById(R.id.content3);
        final LinearLayout content4 = findViewById(R.id.content4);

        viewContent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content1.getVisibility() == View.GONE) {
                    content1.setVisibility(View.VISIBLE);
                } else {
                    content1.setVisibility(View.GONE);
                }
            }
        });
        viewContent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content2.getVisibility() == View.GONE) {
                    content2.setVisibility(View.VISIBLE);
                } else {
                    content2.setVisibility(View.GONE);
                }
            }
        });
        viewContent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content3.getVisibility() == View.GONE) {
                    content3.setVisibility(View.VISIBLE);
                } else {
                    content3.setVisibility(View.GONE);
                }
            }
        });
        viewContent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content4.getVisibility() == View.GONE) {
                    content4.setVisibility(View.VISIBLE);
                } else {
                    content4.setVisibility(View.GONE);
                }
            }
        });
    }

    public void onClickSlide(View view) {
        Intent intent = new Intent(this, ScreenSlidePagerActivity.class);
        startActivity(intent);
    }
}
