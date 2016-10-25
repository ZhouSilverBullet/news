package qf.com.news.mvpview.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import qf.com.news.R;
import qf.com.news.adapter.HistoryAdapter;
import qf.com.news.adapter.SuperAdapter;
import qf.com.news.bean.qsbk.HistoryBean;
import qf.com.news.bean.qsbk.ImgrankBean;
import qf.com.news.bean.qsbk.TextBean;
import qf.com.news.bean.qsbk.VideoBean;
import qf.com.news.mvpview.activity.RecommendActivity;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.mvpview.view.QsbkView;
import qf.com.news.presenter.QsbkPresenter;

/**
 * Created by zz on 16-9-30.
 */

public class HistoryFragment extends NewsBaseFragment<NewView,QsbkPresenter> implements QsbkView, SuperAdapter.OnChildClickListener {

    private HistoryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        if (presenter != null) {

                presenter.getData(HistoryBean.class,1,pushDown);
//        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new HistoryAdapter(getContext(),new ArrayList<HistoryBean.ItemsBean>(),
                new int[]{R.layout.imgrangk_item,R.layout.text_item,R.layout.video_item});
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
        HistoryBean data1 = (HistoryBean) object;
        Log.e("showData:------------->",""+data1 );
        adapter.addAll(data1.getItems());
    }

    @Override
    public void onChildClickListener(Object obj, String url, int position) {
        HistoryBean.ItemsBean obj1 = (HistoryBean.ItemsBean) obj;
        String format = obj1.getFormat();
        Intent intent = new Intent(getActivity(), RecommendActivity.class);
        if ("image".equals(format)) {
            ImgrankBean.ItemsBean itemsBean = new ImgrankBean.ItemsBean();
            itemsBean.setId(obj1.getId());
            itemsBean.setImage(obj1.getImage().toString());
            ImgrankBean.ItemsBean.UserBean userBean = new ImgrankBean.ItemsBean.UserBean();
            userBean.setUid(obj1.getUser().getUid());
            userBean.setIcon(obj1.getUser().getIcon());
            itemsBean.setContent(obj1.getContent());
            userBean.setLogin(obj1.getUser().getLogin());
            itemsBean.setUser(userBean);
            intent.putExtra("data",itemsBean);
        } else if ("word".equals(format)) {
            //文字的布局  text
            TextBean.ItemsBean itemsBean = new TextBean.ItemsBean();
            TextBean.ItemsBean.UserBean userBean = new TextBean.ItemsBean.UserBean();
            itemsBean.setId(obj1.getId());
            itemsBean.setContent(obj1.getContent());
            userBean.setLogin(obj1.getUser().getLogin());
            userBean.setIcon(obj1.getUser().getIcon());
            itemsBean.setUser(userBean);
            intent.putExtra("data",itemsBean);
        } else if ("video".equals(format)) {
            //视频布局  video
            VideoBean.ItemsBean itemsBean = new VideoBean.ItemsBean();
            VideoBean.ItemsBean.UserBean userBean = new VideoBean.ItemsBean.UserBean();
            itemsBean.setId(obj1.getId());
            userBean.setUid(obj1.getUser().getUid());
            userBean.setLogin(obj1.getUser().getLogin());
            itemsBean.setPic_url(obj1.getPic_url());
            itemsBean.setContent(obj1.getContent());
            itemsBean.setLow_url(obj1.getLow_url());
            itemsBean.setUser(userBean);
            intent.putExtra("data",itemsBean);
        }
        getActivity().startActivity(intent);
    }

//    @Override
//    public void ShowData(Object data) {
//        HistoryBean data1 = (HistoryBean) data;
//        Log.e("----------->", "ShowData: "+data1);
//
//    }


}
