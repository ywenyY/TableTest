package co.bignerdranch.android.tabletest;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;
    private TabLayout.Tab five;
    private TabLayout.Tab A,B,C,D;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//隐藏标题栏
        setContentView(R.layout.activity_main);
        initViews();//初始化视图

    }
    private void initViews(){
        mViewPager=(ViewPager)findViewById(R.id.viewPager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myFragmentPagerAdapter);
        mTabLayout = (TabLayout)findViewById(R.id.tabLayout);
       /* mTabLayout.setOnClickListener(new TabLayout.OnTabSelectedListener({
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(getApplicationContext(),tab.getPosition(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        })*/

        mTabLayout.setupWithViewPager(mViewPager);
        one = mTabLayout.getTabAt(0);
       two = mTabLayout.getTabAt(1);
        three= mTabLayout.getTabAt(2);
        four = mTabLayout.getTabAt(3);
        five = mTabLayout.getTabAt(4);
        A = mTabLayout.getTabAt(5);
        one.setIcon(R.mipmap.pic1);
        two.setIcon(R.mipmap.pic1);
        three.setIcon(R.mipmap.pic1);
        four.setIcon(R.mipmap.pic1);
        five.setIcon(R.mipmap.pic1);
        A.setIcon(R.mipmap.pic1);
    }
}
