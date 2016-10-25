package qf.com.news.mvpview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.ArrayList;

import qf.com.news.R;
import qf.com.news.adapter.RecommendAdapter;
import qf.com.news.bean.qsbk.ImgrankBean;
import qf.com.news.bean.qsbk.RecommendBean;
import qf.com.news.bean.qsbk.TextBean;
import qf.com.news.bean.qsbk.VideoBean;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.mvpview.view.QsbkView;
import qf.com.news.presenter.QsbkPresenter;

/**
 * Created by zz on 16-10-6.
 */

public class RecommendFragment extends NewsBaseFragment<NewView,QsbkPresenter> implements QsbkView{

    private Serializable data;
    private RecommendAdapter adapter;
    private ArrayList list;

    public static RecommendFragment newInstance(Serializable s) {

        Bundle args = new Bundle();
        args.putSerializable("data",s);
        RecommendFragment fragment = new RecommendFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        data = getArguments().getSerializable("data");
        int id =0;
            Log.e("onCreateView------->",""+ id);
        if (data instanceof ImgrankBean.ItemsBean) {
             id = ((ImgrankBean.ItemsBean) data).getId();
            Log.e("onCreateView------->",""+ id);
        }else if(data instanceof VideoBean.ItemsBean){
            id =((VideoBean.ItemsBean) data).getId();
        } else if (data instanceof TextBean.ItemsBean) {
            id =((TextBean.ItemsBean) data).getId();
        }
        presenter.getData(RecommendBean.class,id,pushDown);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = new ArrayList();
        adapter = new RecommendAdapter(getContext(), list,
                new int[]{R.layout.imgrangk_item,R.layout.text_item,R.layout.video_item,R.layout.recommend_item});
        recyclerView.setAdapter(adapter);
    }

    @Override
    public QsbkPresenter CreatePresenter() {
        return new QsbkPresenter();
    }

    @Override
    public void showData(Object object, int downloadType) {
        base_progressbar.setVisibility(View.INVISIBLE);
        RecommendBean object1 = (RecommendBean) object;
        Log.e("showData: ----->",""+object1 );
        list.addAll(object1.getItems());
        list.add(0,data);
        adapter.addAll(list);

    }
}
