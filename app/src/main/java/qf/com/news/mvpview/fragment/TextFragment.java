package qf.com.news.mvpview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import qf.com.news.adapter.TextAdapter;
import qf.com.news.bean.qsbk.TextBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.mvpview.view.QsbkView;
import qf.com.news.presenter.QsbkPresenter;

/**
 * Created by zz on 16-9-30.
 */

public class TextFragment extends NewsBaseFragment<NewView,QsbkPresenter> implements QsbkView{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(TextBean.class,1,QsbkView.pushDown);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public QsbkPresenter CreatePresenter() {
        return new QsbkPresenter();
    }

//    @Override
//    public void ShowData(Object data) {
//        TextBean textBean = (TextBean) data;
//        Log.e("----------->", "ShowData: "+textBean);
//        List<TextBean.ItemsBean> itemsBeanList = textBean.getItems();
//        TextAdapter textAdapter = new TextAdapter(getActivity(),itemsBeanList);
//        recyclerView.setAdapter(textAdapter);
//     }

    @Override
    public void showData(Object object, int downloadType) {
        TextBean textBean = (TextBean) object;
        Log.e("----------->", "ShowData: "+textBean);
        base_progressbar.setVisibility(View.INVISIBLE);
        List<TextBean.ItemsBean> itemsBeanList = textBean.getItems();
        TextAdapter textAdapter = new TextAdapter(getActivity(),itemsBeanList);
        recyclerView.setAdapter(textAdapter);
    }
}
