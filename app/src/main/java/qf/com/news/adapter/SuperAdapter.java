package qf.com.news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.Collection;
import java.util.List;

import qf.com.news.R;

/**
 * Created by zz on 16-10-5.
 */

public abstract class SuperAdapter<D,VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH>{

    public final static String imgUrl = "http://pic.qiushibaike.com/system/avtnew/";
    public final static String imgUrl1 = "http://pic.qiushibaike.com/system/pictures/";


    public Context context;
    public List<D> list;
    public int[] layoutId;
    public OnChildClickListener onChildClickListener;

    public SuperAdapter(Context context, List<D> list, int[] layoutId) {
        this.context = context;
        this.list = list;
        this.layoutId = layoutId;
    }

    public void addAll(Collection collection){
        list.addAll(collection);
        notifyDataSetChanged();
    }

    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size()+1;
    }

    /**
     * 子类的布局文件
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        if (position + 1 == getItemCount()) {
            return R.layout.download;
        } else {
            return getToChild(position);
        }
    }
    public void setOnChildClickListener(OnChildClickListener onChildClickListener){
        this.onChildClickListener = onChildClickListener;
    }
    public abstract int getToChild(int position);

    public interface  OnChildClickListener {
        /**
         *
         * @param obj  item的值
         * @param url  图片地址
         * @param position 对应位置
         */
     void onChildClickListener(Object obj,String url,int position);
    }

    /**
     *  通过这个方法得到position item的值
     * @param position
     * @return
     */
    public D getData(int position){
        return list.get(position);
    }
}
