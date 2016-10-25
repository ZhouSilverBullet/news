package qf.com.news.mvpview.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qf.com.news.bean.news.TicketBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.presenter.NewsPresent;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class TicketFragment extends NewsBaseFragment <NewView, NewsPresent> implements NewView{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(TicketBean.class);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public NewsPresent CreatePresenter() {
        return new NewsPresent();
    }

    @Override
    public void ShowData(Object data) {
        TicketBean data1 = (TicketBean) data;
        Log.e("----------->", "ShowData: "+data1);

    }
}
