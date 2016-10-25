package qf.com.news.mvpview.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import qf.com.news.adapter.HomeAdapter;
import qf.com.news.bean.news.HomeBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.presenter.NewsPresent;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class HomeFragment extends NewsBaseFragment <NewView, NewsPresent> implements NewView {
    private HomeAdapter adapter;
    private View view;
    private ListView listView;
    private ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(HomeBean.class);
      /*  view = LayoutInflater.from(getContext()).inflate(R.layout.home_viewpager,container,false);
        viewPager = ((ViewPager) view.findViewById(R.id.home_viewpager));*/
       /* view = LayoutInflater.from(getContext()).inflate(R.layout.my_home,container,false);
            listView = ((ListView) view.findViewById(R.id.home_list));*/
        // return view;  //这个是用listView
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public NewsPresent CreatePresenter() {
        return new NewsPresent();
    }

    @Override
    public void ShowData(Object data) {
        base_progressbar.setVisibility(View.INVISIBLE);
        HomeBean data1 = (HomeBean) data;
        adapter = new HomeAdapter(getContext(),data1.getT1348647853363());
        recyclerView.setAdapter(adapter);
       /* HomeViewpagerAdapter viewpagerAdapter = new HomeViewpagerAdapter(getContext(), data1.getT1348647853363().get(0).getAds());
        viewPager.setAdapter(viewpagerAdapter);
        recyclerView.addView(view,0);*/
       /* homeFragmentAdapter = new HomeFragmentAdapter(getContext(),data1.getT1348647853363());
        listView.setAdapter(homeFragmentAdapter);*/
    }
}
