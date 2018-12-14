package co.bignerdranch.android.tabletest;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Toast;


public class
MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] Titles = new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};

    public MyFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        if(position==1){
            return new Fragment2();

        }else if(position==2){
            return new Fragment3();
        }else if(position==3){
            return new Fragment4();
        }else if(position==4){
            return new Fragment5();
            }
        return new Fragment1();
    }
    @Override
    public int getCount(){
        return Titles.length;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return Titles[position];
    }


}
