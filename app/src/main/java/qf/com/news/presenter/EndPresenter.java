package qf.com.news.presenter;

import qf.com.news.model.QsbkModel;
import qf.com.news.mvpview.view.QsbkView;

/**
 * Created by zz on 16-10-5.
 */

public class EndPresenter extends MvpPresenter<QsbkView,QsbkModel>{
    @Override
    public QsbkModel CreateModel() {
        return null;
    }

    @Override
    public void getData(Class clazz) {

    }
}
