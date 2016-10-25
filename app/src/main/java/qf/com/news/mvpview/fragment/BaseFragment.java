package qf.com.news.mvpview.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

import qf.com.news.R;
import qf.com.news.adapter.NewsPagerAdapter;
import qf.com.news.image_utils.MessageEvent;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment implements ViewPager.OnPageChangeListener, View.OnClickListener {
    private TabLayout base_tab;
    private ViewPager base_pager;
    private ArrayList<NewsBaseFragment> fragmentlist;
    private String titles[]={"头条","科技","军事","论坛","视频","专享","纯图","纯文","穿越","精华"};
    public RadioButton base_news_button;
    public RadioButton base_happy_button;

    public BaseFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //注册EventBus
        EventBus.getDefault().register(BaseFragment.this);
        base_tab = ((TabLayout) view.findViewById(R.id.base_tab));
        base_pager = ((ViewPager) view.findViewById(R.id.base_pager));
        base_news_button = (RadioButton) view.findViewById(R.id.base_news);
        base_happy_button = (RadioButton) view.findViewById(R.id.base_happy);
        base_happy_button.setOnClickListener(this);
        base_news_button.setOnClickListener(this);
        fragmentlist = new ArrayList<>();
        fragmentlist.add(new HomeFragment());
        fragmentlist.add(new ScienceFragment());
        fragmentlist.add(new AffairsFragment());
        fragmentlist.add(new BbsFragment());

        fragmentlist.add(new VideoFragment());
        fragmentlist.add(new SuggestFragment());
        fragmentlist.add(new ImgrankFragment());
        fragmentlist.add(new TextFragment());
        fragmentlist.add(new HistoryFragment());
        fragmentlist.add(new DayFragment());

        NewsPagerAdapter adapter = new NewsPagerAdapter(getFragmentManager(), fragmentlist, titles);
        base_pager.setAdapter(adapter);
        base_tab.setupWithViewPager(base_pager);
        base_pager.addOnPageChangeListener(this);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(position>=4){
            base_happy_button.setChecked(true);
        }else if(position<4){
            base_news_button.setChecked(true);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.base_happy:
                base_pager.setCurrentItem(4);
                break;
            case R.id.base_news:
                base_pager.setCurrentItem(0);
                break;
        }
    }
    @Subscribe
    public void onEventMainThread(MessageEvent event){
        String msg = event.getMessage();
        if(msg.equals("hot")){
            base_pager.setCurrentItem(1);
        }else if(msg.equals("funny")){
            base_pager.setCurrentItem(5);
        }else if(msg.equals("home")){
            base_pager.setCurrentItem(0);
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(BaseFragment.this);
    }
}
