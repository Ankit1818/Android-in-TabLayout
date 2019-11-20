package com.example.mydemo;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class ViewPagerAadapter extends FragmentStatePagerAdapter
{
    List<Fragment>listfragment=new ArrayList<>();
    List<String>listtitle=new ArrayList<>();


    public ViewPagerAadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        return listfragment.get(position);
    }

    @Override
    public int getCount()
    {
        return listfragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listtitle.get(position);
    }

    public void Addfragment(Fragment fragment,String title)
    {
        listfragment.add(fragment);
        listtitle.add(title);

    }
}
