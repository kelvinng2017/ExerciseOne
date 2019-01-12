package com.example.kelvinng.exerciseone;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class AppBarAndTabLayout extends AppCompatActivity {

    public Toolbar activity_app_bar_and_tab_layout_toolbar;
    public ActionBar activity_app_bar_and_tab_layout_actionbar;
    public TabLayout activity_app_bar_and_tab_layout_tabLayout;
    public ViewPager activity_app_bar_and_tab_layout_ViewPager;
    public AppBarAndTabLayoutPagerAdapter appBarAndTabLayoutPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_and_tab_layout);
        activity_app_bar_and_tab_layout_toolbar=(Toolbar)findViewById(R.id.activity_app_bar_and_tab_layout_toolbar);
        setSupportActionBar(activity_app_bar_and_tab_layout_toolbar);
        activity_app_bar_and_tab_layout_actionbar=getSupportActionBar();
        activity_app_bar_and_tab_layout_actionbar.setTitle("TabLayout頁面");
        activity_app_bar_and_tab_layout_actionbar.setDisplayHomeAsUpEnabled(true);

        activity_app_bar_and_tab_layout_ViewPager=(ViewPager)findViewById(R.id.activity_app_bar_and_tab_layout_ViewPager);
        appBarAndTabLayoutPagerAdapter =new AppBarAndTabLayoutPagerAdapter(getSupportFragmentManager());

        activity_app_bar_and_tab_layout_ViewPager.setAdapter(appBarAndTabLayoutPagerAdapter);

        activity_app_bar_and_tab_layout_tabLayout=(TabLayout)findViewById(R.id.activity_app_bar_and_tab_layout_tabLayout);
        activity_app_bar_and_tab_layout_tabLayout.setupWithViewPager(activity_app_bar_and_tab_layout_ViewPager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(AppBarAndTabLayout.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(AppBarAndTabLayout.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        finish();
        startActivity(intent);
    }
}
