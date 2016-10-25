package qf.com.news.presenter;

import qf.com.news.bean.news.AffairsBean;
import qf.com.news.bean.news.BbsBean;
import qf.com.news.bean.news.HomeBean;
import qf.com.news.bean.news.HotBean;
import qf.com.news.bean.news.ScienceBean;
import qf.com.news.bean.news.TicketBean;
import qf.com.news.model.NewsModel;
import qf.com.news.mvpview.view.NewView;
import rx.Subscriber;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class NewsPresent extends MvpPresenter<NewView, NewsModel> {

    @Override
    public NewsModel CreateModel() {
        return new NewsModel();
    }

    @Override
    public void getData(Class clazz) {
        String name1 = clazz.getName();
        if (name1.equals(HomeBean.class.getName())) {
            model.getDataHome(getAction(clazz));
        }
        else if (name1.equals(HotBean.class.getName())) {
            model.getDataHot(getAction(clazz));
        }
        else if (name1.equals(ScienceBean.class.getName())) {
            model.getDataScience(getAction(clazz));
        }
        else if (name1.equals(TicketBean.class.getName())) {
            model.getTicket(getAction(clazz));
        }
        else if (name1.equals(BbsBean.class.getName())) {
            model.getDataBbs(getAction(clazz));
        }
        else if (name1.equals(AffairsBean.class.getName())) {
            model.getDataAffairs(getAction(clazz));
        }
    }

    public Subscriber getAction(final Class clazz) {
        return new Subscriber() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(final Object o) {
                final Object o1 = o;
                NewView view = getView();
                if (view != null) {
                    view.ShowData(o1);
                }
            }
        };
    }
}
