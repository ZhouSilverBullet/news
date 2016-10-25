package qf.com.news.adapter;

import android.content.Context;
import android.support.v4.util.Pools;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.news.HomeBean;

/**
 * Created by XiaoLiu on 2016/10/3.
 */
public class HomeViewpagerAdapter extends PagerAdapter{
    private Context context;
    private Pools.Pool<ImageView> pool = new Pools.SimplePool<>(7);
    private List<HomeBean.T1348647853363Bean.AdsBean> list;

    public HomeViewpagerAdapter(Context context, List<HomeBean.T1348647853363Bean.AdsBean> list) {
        this.context = context;
        this.list = new ArrayList<>(list);
        HomeBean.T1348647853363Bean.AdsBean first = this.list.get(0);
        HomeBean.T1348647853363Bean.AdsBean last = this.list.get(list.size()-1);
        this.list.add(0,last);
        this.list.add(first);
    }

    @Override
    public int getCount() {
  //      Log.e("e", "类名==HomeViewpagerAdapter" + "方法名==getCount=====:" + list.size());
        return list.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = pool.acquire();
        if(imageView == null){
            imageView = new ImageView(context);
        }
        Picasso.with(context).load(list.get(position).getImgsrc()).placeholder(R.mipmap.personal_default).error(R.mipmap.personal_default).into(imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((View) object);
        pool.release((ImageView) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view.equals(object);
    }
}
