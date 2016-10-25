package qf.com.news.model;

import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by  javac on 2016/9/24.
 * email:kylin_javac@outlook.com
 * desc:
 */

public interface BaseModel<T> extends MvpModel {
    //新闻:首页
    void getDataHome(Subscriber<T> action1);

    //热点
    void getDataHot(Subscriber<T> action1);

    //科技
    void getDataScience(Subscriber<T> action1);

    //军事
    void getDataAffairs(Subscriber<T> action1);

    //彩票
    void getTicket(Subscriber<T> action1);

    //论坛
    void getDataBbs(Subscriber<T> action1);
}
