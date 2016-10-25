package qf.com.news.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import qf.com.news.mvpview.fragment.NewsBaseFragment;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class NewsPagerAdapter extends FragmentStatePagerAdapter {
    private List<NewsBaseFragment> list;
    private String titles[];

    public NewsPagerAdapter(FragmentManager fm, List<NewsBaseFragment> list, String titles[]) {
        super(fm);
        this.list = list;
        this.titles = titles;

    }


    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
