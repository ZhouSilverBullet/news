package qf.com.news.server.news;

import qf.com.news.bean.qsbk.DayBean;
import qf.com.news.bean.qsbk.HistoryBean;
import qf.com.news.bean.qsbk.ImgrankBean;
import qf.com.news.bean.qsbk.RecommendBean;
import qf.com.news.bean.qsbk.SuggestBean;
import qf.com.news.bean.qsbk.TextBean;
import qf.com.news.bean.qsbk.VideoBean;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by zz on 16-9-30.
 */

public interface QsbkServer {
    //视频
    @GET("article/list/video")
    Observable<VideoBean> getVideoObservable(@Query("page") int page);
    //专享
    @GET("article/list/suggest")
    Observable<SuggestBean> getSuggestObservable(@Query("page") int page);
    //纯图
    @GET("article/list/imgrank")
    Observable<ImgrankBean> getImgrankObservable(@Query("page") int page);
    //纯文
    @GET("article/list/text")
    Observable<TextBean> getTextObservable(@Query("page") int page);
    //穿越
    @GET("article/history")
    Observable<HistoryBean> getHistoryObservable(@Query("page") int page);
    //精华
    @GET("article/list/day")
    Observable<DayBean> getDayObservable(@Query("page") int page);
    //评论
    //评论
    @GET("article/{id}/latest/comments")
    Observable<RecommendBean> getRecommendObservable(@Path("id") int id);

}
