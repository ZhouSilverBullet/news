package qf.com.news.mvpview.view;

/**
 * Created by zz on 16-10-5.
 */

public interface QsbkView extends MvpView{

    /**
     * SwipeRefresh 刷新
     */
    int pushTop =0;
    /**
     * RecyclerView 刷新
     */
    int pushDown =1;
    /**
     *
     * @param object
     */
    public void showData(Object object,int downloadType);
}
