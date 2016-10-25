package qf.com.news.mvpview.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qf.com.news.adapter.ScienceAdapter;
import qf.com.news.bean.news.ScienceBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.presenter.NewsPresent;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class ScienceFragment extends NewsBaseFragment <NewView, NewsPresent> implements NewView{
    private ScienceAdapter scienceAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(ScienceBean.class);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public NewsPresent CreatePresenter() {
        return new NewsPresent();
    }

    @Override
    public void ShowData(Object data) {
        base_progressbar.setVisibility(View.INVISIBLE);
        ScienceBean data1 = (ScienceBean) data;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        scienceAdapter = new ScienceAdapter(getContext(),data1.getT1348649580692());
        recyclerView.setAdapter(scienceAdapter);
    }
}
