package qf.com.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.news.HomeBean;
import qf.com.news.image_utils.ImageUtils;
import qf.com.news.mvpview.activity.NewsDetailActivity;

/**
 * Created by XiaoLiu on 2016/10/3.
 */
public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    private Context context;
    private static List<HomeBean.T1348647853363Bean> list;
    private LayoutInflater mLayoutInflater;
    private RecyclerView recyclerView;
    private int mHeaderCount=1;//头部View个数

    public static final int ITEM_TYPE_HEADER = 0;
    public static final int ITEM_TYPE_CONTENT = 1;
    public HomeAdapter(Context context, List<HomeBean.T1348647853363Bean> list) {
        this.context = context;
        this.list = list;
        mLayoutInflater = LayoutInflater.from(context);
    }
    //内容长度
    public int getContentItemCount(){
        return list.size();
    }

    //判断当前item类型
    @Override
    public int getItemViewType(int position) {
        if (mHeaderCount != 0 && position < mHeaderCount) {
//头部View
            return ITEM_TYPE_HEADER;
        } else {
//内容View
            return ITEM_TYPE_CONTENT;
        }
    }

    //内容 ViewHolder
    public static class ContentViewHolder extends RecyclerView.ViewHolder {
        private TextView digest;
        private TextView title;
        private ImageView imgsrc;
        public ContentViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            digest = (TextView) itemView.findViewById(R.id.digest);
            imgsrc = (ImageView) itemView.findViewById(R.id.imgsrc);
        }
    }
    //头部 ViewHolder
    public static class HeaderViewHolder extends RecyclerView.ViewHolder implements ViewPager.OnPageChangeListener {
        private ViewPager viewPager;
        private LinearLayout white_Container;
        private ImageView red_Point;
        private Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 100:
                        int arg1 = msg.arg1;
                        if (arg1 > 5){
                            arg1 = 1;
                        }
                        viewPager.setCurrentItem(arg1, arg1 != 1);
                        Message message = handler.obtainMessage(100, ++arg1,0);  //这里加上就动了  为什么？
                        handler.sendMessageDelayed(message, 2000);
                        break;
                }
            }
        };
        public HeaderViewHolder(View itemView) {
            super(itemView);
            viewPager = (ViewPager) itemView.findViewById(R.id.home_viewpager);
            white_Container = (LinearLayout) itemView.findViewById(R.id.white_container);
            red_Point = (ImageView) itemView.findViewById(R.id.red_point);
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            float value = ((position-1)+positionOffset)*red_Point.getWidth() + white_Container.getLeft();
            value = Math.max(white_Container.getLeft(),value);
            value = Math.min(white_Container.getRight()-red_Point.getWidth(),value);
            ViewCompat.setTranslationX(red_Point,value);
        }

        @Override
        public void onPageSelected(int position) {
            if(position == 0){
                viewPager.setCurrentItem(list.get(0).getAds().size(),false);
            }else if (position == list.get(0).getAds().size()+1){
                viewPager.setCurrentItem(1,false);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType ==ITEM_TYPE_HEADER) {
            return new HeaderViewHolder(mLayoutInflater.inflate(R.layout.home_viewpager, parent, false));
        } else if (viewType == ITEM_TYPE_CONTENT) {
            View view = mLayoutInflater.inflate(R.layout.home_item, parent, false);
            view.setOnClickListener(this);
            return new ContentViewHolder(view);
        }
        return null;
    }
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeaderViewHolder) {
            HomeViewpagerAdapter adapter = new HomeViewpagerAdapter(context,list.get(0).getAds());
            HeaderViewHolder hearHolder = (HeaderViewHolder) holder;
            hearHolder.viewPager.setAdapter(adapter);
            ((HeaderViewHolder) holder).white_Container.removeAllViews();
            ((HeaderViewHolder) holder).handler.removeMessages(100);
            for (int i = 0; i < list.get(0).getAds().size(); i++) {
                ImageView image = new ImageView(context);
                image.setImageResource(R.drawable.white_point);
                int v  = (int) context.getResources().getDimension(R.dimen.point_padding);
                image.setPadding(v,v,v,v);
                ((HeaderViewHolder) holder).white_Container.addView(image);

            }
            hearHolder.viewPager.setCurrentItem(1);
            hearHolder.viewPager.addOnPageChangeListener(hearHolder);
            ((HeaderViewHolder) holder).red_Point.post(new Runnable() {
                @Override
                public void run() {
                    ViewCompat.setTranslationX(((HeaderViewHolder) holder).red_Point,((HeaderViewHolder) holder).white_Container.getLeft());
                }
            });
            hearHolder.handler.obtainMessage(100, 1).sendToTarget();
        }else if (holder instanceof ContentViewHolder) {
            ContentViewHolder holder1 = (ContentViewHolder) holder;
            holder1.title.setText(list.get(position-1).getTitle());
            holder1.digest.setText(list.get(position-1).getDigest());
          //  Picasso.with(context).load(list.get(position-1).getImgsrc()).placeholder(R.mipmap.personal_default).error(R.mipmap.personal_default).into(holder1.imgsrc);
            ImageUtils.loadImage(((ContentViewHolder) holder).imgsrc,list.get(position-1).getImgsrc(),R.mipmap.personal_default);
        }
    }
    @Override
    public int getItemCount() {
        return mHeaderCount + getContentItemCount();
    }
    @Override
    public void onClick(View view) {
        int position = recyclerView.getChildAdapterPosition(view);
        HomeBean.T1348647853363Bean bean = list.get(position-1);
        String url = "";
        if(null != bean.getUrl_3w()){
            url = bean.getUrl_3w();
        }else {
            //添加一个对话框

        }

        if ( !"".equals(url)) {
            Log.e("e", "类名==HomeAdapter" + "方法名==onClick=====:" + url);
            Intent intent = new Intent(view.getContext(),NewsDetailActivity.class);
            intent.putExtra("url", url);
            view.getContext().startActivity(intent);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }
}

