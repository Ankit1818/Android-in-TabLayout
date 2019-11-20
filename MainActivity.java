package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager pager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        pager=findViewById(R.id.pager);
        setupwithmydata();

        tabLayout=findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);


    }

    private void setupwithmydata()
    {
ViewPagerAadapter viewPagerAadapter=new ViewPagerAadapter(getSupportFragmentManager());
viewPagerAadapter.Addfragment(new chatfragment(),"chat");
        viewPagerAadapter.Addfragment(new chatfragment(),"call");
        viewPagerAadapter.Addfragment(new chatfragment(),"status");
        pager.setAdapter(viewPagerAadapter);

    }
}
