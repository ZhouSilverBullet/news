package qf.com.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.news.BbsBean;
import qf.com.news.image_utils.ImageUtils;
import qf.com.news.mvpview.activity.NewsDetailActivity;

/**
 * Created by javac on 16-10-2.
 */

public class BbsFragmentAdapter extends RecyclerView.Adapter<BbsFragmentAdapter.ViewHolder> implements View.OnClickListener {
    private Context context;
    private List<BbsBean.T1419386592923Bean> list;
    public RecyclerView recyclerView;

    public BbsFragmentAdapter(Context context, List<BbsBean.T1419386592923Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bbs_item, null);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BbsBean.T1419386592923Bean bbsBean = list.get(position);
        holder.bbs_text.setText(null);
        holder.bbs_titme.setText(null);
        if (position < 4) {
            //TODO 预加载图片
            //Picasso.with(context).load(bbsBean.getImgsrc()).placeholder(R.mipmap.personal_default).error(R.mipmap.personal_default).into(holder.bbs_img);
            ImageUtils.loadImage(holder.bbs_img,list.get(position).getImgsrc(),R.mipmap.personal_default);
        }
        else {
           // Picasso.with(context).load(bbsBean.getImgsrc()).placeholder(R.mipmap.personal_default).error(R.mipmap.personal_default).into(holder.bbs_img);
            ImageUtils.loadImage(holder.bbs_img,list.get(position).getImgsrc(),R.mipmap.personal_default);
            String trim = bbsBean.getDigest().trim();
            if (trim.length() != 20) {
                holder.bbs_text.setText(bbsBean.getDigest());
            }
            else {
                holder.bbs_text.setText(bbsBean.getTitle());
            }
            holder.bbs_titme.setText(bbsBean.getPtime());
        }

    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public void onClick(View v) {
        int position = recyclerView.getChildAdapterPosition(v);
        BbsBean.T1419386592923Bean bean = list.get(position);
        String url = bean.getUrl_3w();
        if (!TextUtils.isEmpty(url)) {
            NewsDetailActivity newsDetailActivity = new NewsDetailActivity();
            Intent intent = new Intent(context, newsDetailActivity.getClass());
            intent.putExtra("url", url);
            context.startActivity(intent);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView bbs_img;
        private final TextView bbs_text;
        private final TextView bbs_titme;

        public ViewHolder(View itemView) {
            super(itemView);
            bbs_img = (ImageView) itemView.findViewById(R.id.bbs_img);
            bbs_text = (TextView) itemView.findViewById(R.id.bbs_text);
            bbs_titme = ((TextView) itemView.findViewById(R.id.bbs_time));
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }
}
