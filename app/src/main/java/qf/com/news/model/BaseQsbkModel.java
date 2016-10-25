package qf.com.news.model;

import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by  javac on 2016/9/24.
 * email:kylin_javac@outlook.com
 * desc:
 */

public interface BaseQsbkModel<T> extends MvpModel {
    //视频
    void getDataVideo(Subscriber<T> action1,int page);

    //专享
    void getDataSuggest(Subscriber<T> action1,int page);

    //纯图
    void getDataImgrank(Subscriber<T> action1,int page);

    //纯文
    void getDataText(Subscriber<T> action1,int page);

    //穿越
    void getDataHistory(Subscriber<T> action1,int page);

    //精华
    void getDataDay(Subscriber<T> action1,int page);
}
