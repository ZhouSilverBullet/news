package qf.com.news.mvpview.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import qf.com.news.R;
import qf.com.news.adapter.ImgrankAdapter;
import qf.com.news.adapter.SuperAdapter;
import qf.com.news.bean.qsbk.ImgrankBean;
import qf.com.news.mvpview.activity.RecommendActivity;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.mvpview.view.QsbkView;
import qf.com.news.presenter.QsbkPresenter;

/**
 * Created by zz on 16-9-30.
 */

public class ImgrankFragment extends NewsBaseFragment<NewView,QsbkPresenter> implements QsbkView, SuperAdapter.OnChildClickListener {

    private ImgrankAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        presenter.getData(ImgrankBean.class,1,pushDown);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ImgrankAdapter(getActivity(),new ArrayList<ImgrankBean.ItemsBean>(),new int[]{R.layout.imgrangk_item});
        adapter.setOnChildClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public QsbkPresenter CreatePresenter() {
        return new QsbkPresenter();
    }


//
//    @Override
//    public void ShowData(Object data) {
//        ImgrankBean data1 = (ImgrankBean) data;
//        Log.e("----------->", "ShowData: "+data1);
//
//    }

    @Override
    public void showData(Object object, int downloadType) {
        base_progressbar.setVisibility(View.INVISIBLE);
        ImgrankBean object1 = (ImgrankBean) object;
        adapter.addAll(object1.getItems());
    }

    @Override
    public void onChildClickListener(Object obj, String url, int position) {
        Toast.makeText(getContext(), ""+position, Toast.LENGTH_SHORT).show();
        ImgrankBean.ItemsBean itemsBean = (ImgrankBean.ItemsBean) obj;

        Intent intent = new Intent(getActivity(), RecommendActivity.class);
        intent.putExtra("data",itemsBean);
        getActivity().startActivity(intent);
    }
}
