package qf.com.news.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */

public class WelcomeAdapter extends PagerAdapter {
    private List<ImageView> imageViewList;
    public WelcomeAdapter(List<ImageView> imageViewList){
        this.imageViewList=imageViewList;
    }
    @Override
    public int getCount() {
        return imageViewList==null?0:imageViewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //int newPosition=position%imageViewList.size();
        ImageView imageView = imageViewList.get(position);
        if (imageView.getParent()==null){
           container.addView(imageView);
        }
        return imageView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
