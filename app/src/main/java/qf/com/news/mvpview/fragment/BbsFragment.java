package qf.com.news.mvpview.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import qf.com.news.adapter.BbsFragmentAdapter;
import qf.com.news.bean.news.BbsBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.presenter.NewsPresent;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class BbsFragment extends NewsBaseFragment <NewView, NewsPresent> implements NewView{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(BbsBean.class);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public NewsPresent CreatePresenter() {
        return new NewsPresent();
    }

    @Override
    public void ShowData(Object data) {
        BbsBean data1 = (BbsBean) data;
        Log.e("----------->", "ShowData: "+data1);
        List<BbsBean.T1419386592923Bean> bbslist = data1.getT1419386592923();
        BbsFragmentAdapter bbsFragmentAdapter = new BbsFragmentAdapter(getActivity(), bbslist);
        base_progressbar.setVisibility(View.GONE);
        recyclerView.setAdapter(bbsFragmentAdapter);
    }
}
