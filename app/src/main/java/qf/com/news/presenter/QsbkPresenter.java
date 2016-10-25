package qf.com.news.presenter;

import qf.com.news.bean.qsbk.DayBean;
import qf.com.news.bean.qsbk.HistoryBean;
import qf.com.news.bean.qsbk.ImgrankBean;
import qf.com.news.bean.qsbk.RecommendBean;
import qf.com.news.bean.qsbk.SuggestBean;
import qf.com.news.bean.qsbk.TextBean;
import qf.com.news.bean.qsbk.VideoBean;
import qf.com.news.model.QsbkModel;
import qf.com.news.mvpview.view.NewView;
import qf.com.news.mvpview.view.QsbkView;
import rx.Subscriber;

/**
 * Created by zz on 16-9-30.
 */

public class QsbkPresenter extends MvpPresenter<QsbkView, QsbkModel> {

    @Override
    public QsbkModel CreateModel() {
        return new QsbkModel();
    }

    @Override
    public void getData(Class clazz) {
        //这个方法不实现了
    }

    /**
     * 这个方法我实现了空实现，不影响前面的
     * @param clazz
     * @param page
     * @param downloadType
     */
    @Override
    public void getData(Class clazz,int page,int downloadType) {
        String name = clazz.getName();
        if (name.equals(VideoBean.class.getName())) {
            model.getDataVideo(getAction(downloadType),page);
        } else if (name.equals(SuggestBean.class.getName())) {
            model.getDataSuggest(getAction(downloadType),page);
        } else if (name.equals(ImgrankBean.class.getName())) {
            model.getDataImgrank(getAction(downloadType),page);
        } else if (name.equals(TextBean.class.getName())) {
            model.getDataText(getAction(downloadType),page);
        } else if (name.equals(HistoryBean.class.getName())) {
            model.getDataHistory(getAction(downloadType),page);
        } else if (name.equals(DayBean.class.getName())) {
            model.getDataDay(getAction(downloadType),page);
        } else if (name.equals(RecommendBean.class.getName())) {
            model.getRecommendData(getAction(downloadType),page);
        }
    }

    public Subscriber getAction(final int downloadType) {
        return new Subscriber() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(Object o) {
                getView().showData(o,downloadType);

            }
        };
    }
}
