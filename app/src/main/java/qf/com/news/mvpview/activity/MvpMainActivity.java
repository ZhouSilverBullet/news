package qf.com.news.mvpview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import qf.com.news.mvpview.view.MvpView;
import qf.com.news.presenter.MvpPresenter;


/**
 * Created by  javac on 2016/9/24.
 * email:kylin_javac@outlook.com
 * desc:
 */

public abstract class MvpMainActivity<V extends MvpView,T extends MvpPresenter> extends AppCompatActivity implements MvpView {
    public  T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = CreatePresenter();
        presenter.attch((V) this);


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.deAttch();
    }

    public abstract T CreatePresenter();

}
