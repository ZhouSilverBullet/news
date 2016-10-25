package qf.com.news.model;

import qf.com.news.bean.news.AffairsBean;
import qf.com.news.bean.news.BbsBean;
import qf.com.news.bean.news.HomeBean;
import qf.com.news.bean.news.HotBean;
import qf.com.news.bean.news.ScienceBean;
import qf.com.news.bean.news.TicketBean;
import qf.com.news.server.news.HomeServer;
import qf.com.news.server.news.NewsServer;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class NewsModel implements BaseModel {
    public static final String Home = "T1348647853363";
    public static final String Hot = "T1429173762551";
    public static final String Science = "T1348649580692";
    public static final String Affairs = "T1348648141035";
    public static final String Ticket = "T1356600029035";
    public static final String Bbs = "T1419386592923";



    //首页
    @Override
    public void getDataHome(Subscriber action1) {
        NewsServer api = HomeServer.getApi(NewsServer.class);
        Observable<HomeBean> homeObserble = api.getHomeObserble(Home);
        homeObserble
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(action1)
                ;
    }

    //热点
    @Override
    public void getDataHot(Subscriber action1) {
        NewsServer api = HomeServer.getApi(NewsServer.class);
        Observable<HotBean> hotObserble = api.getHotObserble(Hot);
        hotObserble
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(action1);
    }

    //科技
    @Override
    public void getDataScience(Subscriber action1) {
        NewsServer api = HomeServer.getApi(NewsServer.class);
        Observable<ScienceBean> scienceObserble = api.getScienceObserble(Science);
        scienceObserble
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(action1);

    }

    //军事
    @Override
    public void getDataAffairs(Subscriber action1) {
        NewsServer api = HomeServer.getApi(NewsServer.class);
        Observable<AffairsBean> affairsObserble = api.getAffairsObserble(Affairs);
        affairsObserble
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(action1);
    }

    //彩票
    @Override
    public void getTicket(Subscriber action1) {
        NewsServer api = HomeServer.getApi(NewsServer.class);
        Observable<TicketBean> ticketObserble = api.getTicketObserble(Ticket);
        ticketObserble
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(action1);

    }
    //论坛

    @Override
    public void getDataBbs(Subscriber action1) {
        NewsServer api = HomeServer.getApi(NewsServer.class);

        Observable<BbsBean> bbsObserble = api.getBbsObserble(Bbs);

        bbsObserble
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(action1);
    }

}