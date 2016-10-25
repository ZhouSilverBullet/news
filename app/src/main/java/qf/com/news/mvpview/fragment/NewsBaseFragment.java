package qf.com.news.mvpview.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import qf.com.news.R;
import qf.com.news.mvpview.view.MvpView;
import qf.com.news.presenter.MvpPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public  abstract class NewsBaseFragment <V extends MvpView,T extends MvpPresenter> extends Fragment {
    public  T presenter;
    public RecyclerView recyclerView;
    public ProgressBar base_progressbar;
    public NewsBaseFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
            presenter = CreatePresenter();
            presenter.attch((V)this);
            super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news_base, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = ((RecyclerView) view.findViewById(R.id.base_recycler_view));
        base_progressbar = (ProgressBar) view.findViewById(R.id.base_progressbar);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter!=null){
            presenter.deAttch();
        }
    }
    public abstract T CreatePresenter();
}
