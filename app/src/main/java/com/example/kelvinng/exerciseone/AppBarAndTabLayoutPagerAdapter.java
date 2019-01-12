package com.example.kelvinng.exerciseone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AppBarAndTabLayoutPagerAdapter extends FragmentPagerAdapter {
    public AppBarAndTabLayoutPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                RecyclerView2 recyclerView =new RecyclerView2();
                return recyclerView;

            case 1:
                ListView listView=new ListView();
                return  listView;



            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            case 0:
                return "recyclerView";

            case 1:
                return "listView";

            default:
                return null;
        }

    }
}
