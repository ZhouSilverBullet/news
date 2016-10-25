package qf.com.news.mvpview.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import qf.com.news.R;
import qf.com.news.adapter.SuperAdapter;
import qf.com.news.adapter.VideoAdapter;
import qf.com.news.bean.qsbk.VideoBean;
import qf.com.news.mvpview.activity.RecommendActivity;
import qf.com.news.mvpview.view.QsbkView;
import qf.com.news.presenter.QsbkPresenter;

/**
 * Created by zz on 16-9-30.
 */

public class VideoFragment extends NewsBaseFragment<QsbkView,QsbkPresenter> implements QsbkView, SuperAdapter.OnChildClickListener {

    private VideoAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(VideoBean.class,1,QsbkView.pushDown);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new VideoAdapter(getContext(),new ArrayList<VideoBean.ItemsBean>(), new int[]{R.layout.video_item});
        adapter.setOnChildClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public QsbkPresenter CreatePresenter() {
        return new QsbkPresenter();
    }

    @Override
    public void showData(Object object, int downloadType) {
        base_progressbar.setVisibility(View.INVISIBLE);
        VideoBean object1 = (VideoBean) object;
        adapter.addAll(object1.getItems());
    }

    @Override
    public void onChildClickListener(Object obj, String url, int position) {
        VideoBean.ItemsBean obj1 = (VideoBean.ItemsBean) obj;
        Intent intent = new Intent(getActivity(), RecommendActivity.class);
        intent.putExtra("data",obj1);
        getActivity().startActivity(intent);
    }

//    @Override
//    public void ShowData(Object data) {
//        VideoBean data1 = (VideoBean) data;
//        Log.e("----------->", "ShowData: "+data1 );
//    }
}
