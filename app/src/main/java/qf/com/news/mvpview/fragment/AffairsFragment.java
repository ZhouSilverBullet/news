package qf.com.news.mvpview.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qf.com.news.adapter.AffairsFragmentAdapter;
import qf.com.news.bean.news.AffairsBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.presenter.NewsPresent;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class AffairsFragment extends NewsBaseFragment <NewView, NewsPresent>  implements NewView{
    private static final String TAG = AffairsFragment.class.getSimpleName();
    private AffairsFragmentAdapter affairsFragmentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(AffairsBean.class);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public NewsPresent CreatePresenter() {
        return new NewsPresent();
    }

    @Override
    public void ShowData(Object data) {
        AffairsBean data1 = (AffairsBean) data;
        Log.e("----------->", "ShowData: "+data1);
        base_progressbar.setVisibility(View.INVISIBLE);
        //TODO 界面优化
        affairsFragmentAdapter = new AffairsFragmentAdapter(data1.getT1348648141035(),getContext());
        recyclerView.setAdapter(affairsFragmentAdapter);
    }
}
