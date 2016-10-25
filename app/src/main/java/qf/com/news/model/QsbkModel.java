package qf.com.news.model;

import qf.com.news.bean.qsbk.DayBean;
import qf.com.news.bean.qsbk.HistoryBean;
import qf.com.news.bean.qsbk.ImgrankBean;
import qf.com.news.bean.qsbk.SuggestBean;
import qf.com.news.bean.qsbk.TextBean;
import qf.com.news.bean.qsbk.VideoBean;
import qf.com.news.server.news.HomeServer;
import qf.com.news.server.news.QsbkServer;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zz on 16-9-30.
 */

public class QsbkModel implements BaseQsbkModel{
    @Override
    public void getDataVideo(Subscriber action1,int page) {
        Observable<VideoBean> observable = HomeServer.getQsbkApi(QsbkServer.class).getVideoObservable(page);
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }

    @Override
    public void getDataSuggest(Subscriber action1,int page) {
        Observable<SuggestBean> observable = HomeServer.getQsbkApi(QsbkServer.class).getSuggestObservable(page);
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }

    @Override
    public void getDataImgrank(Subscriber action1,int page) {
        Observable<ImgrankBean> observable = HomeServer.getQsbkApi(QsbkServer.class).getImgrankObservable(page);
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }

    @Override
    public void getDataText(Subscriber action1,int page) {
        Observable<TextBean> observable = HomeServer.getQsbkApi(QsbkServer.class).getTextObservable(page);
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }

    @Override
    public void getDataHistory(Subscriber action1,int page) {
        Observable<HistoryBean> observable = HomeServer.getQsbkApi(QsbkServer.class).getHistoryObservable(page);
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }
    @Override
    public void getDataDay(Subscriber action1,int page) {
        Observable<DayBean> observable = HomeServer.getQsbkApi(QsbkServer.class).getDayObservable(1);
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }

    public void getRecommendData(Subscriber subscriber,int id) {
        HomeServer.getQsbkApi(QsbkServer.class).getRecommendObservable(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread()).subscribe(subscriber);
    }
}
