package qf.com.news.server.news;

import qf.com.news.bean.news.AffairsBean;
import qf.com.news.bean.news.BbsBean;
import qf.com.news.bean.news.HomeBean;
import qf.com.news.bean.news.HotBean;
import qf.com.news.bean.news.ScienceBean;
import qf.com.news.bean.news.TicketBean;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public interface NewsServer {
    //首页
    @GET("article/headline/{category}/0-20.html")
    Observable<HomeBean> getHomeObserble(@Path("category") String category);

    //热点
    @GET("article/list/{category}/0-20.html")
    Observable<HotBean> getHotObserble(@Path("category") String category);

    //科技
    @GET("article/list/{category}/0-20.html")
    Observable<ScienceBean> getScienceObserble(@Path("category") String category);

    //军事
    @GET("article/list/{category}/0-20.html")
    Observable<AffairsBean> getAffairsObserble(@Path("category") String category);

    //彩票
    @GET("article/list/{category}/0-20.html")
    Observable<TicketBean> getTicketObserble(@Path("category") String category);

    //论坛
    @GET("article/list/{category}/0-20.html")
    Observable<BbsBean> getBbsObserble(@Path("category") String category);


}
