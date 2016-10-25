package qf.com.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.news.ScienceBean;
import qf.com.news.image_utils.ImageUtils;
import qf.com.news.mvpview.activity.ScienceDetailActivity;

/**
 * Created by XiaoLiu on 2016/10/3.
 */
public class ScienceAdapter extends RecyclerView.Adapter<ScienceAdapter.ViewHolder> implements View.OnClickListener {
    private Context context;
    private List<ScienceBean.T1348649580692Bean> list;
    private RecyclerView recyclerView;
    public ScienceAdapter(Context context, List<ScienceBean.T1348649580692Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.science_item,parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.digest.setText(list.get(position).getDigest());
       // Picasso.with(context).load(list.get(position).getImgsrc()).placeholder(R.mipmap.personal_default).error(R.mipmap.personal_default).into(holder.imageView);
        holder.like.setText(list.get(position).getReplyCount()+" ");
        ImageUtils.loadImage(holder.imageView,list.get(position).getImgsrc(),R.mipmap.personal_default);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public void onClick(View view) {;
        int position = recyclerView.getChildAdapterPosition(view);
        String url = "";
        if(null != list.get(position).getUrl()){
            url = list.get(position).getUrl();
        }else{
            //可以加上一个提示
        }
        if(!TextUtils.isEmpty(url)){
            Log.e("d", "类名==ScienceAdapter" + "方法名==onClick=====:" + url);
            Intent intent = new Intent(view.getContext(), ScienceDetailActivity.class);
            intent.putExtra("url", url);
            view.getContext().startActivity(intent);
        }
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView imageView;
        private TextView like;
        private TextView digest;
        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            like = (TextView) itemView.findViewById(R.id.likeCount);
            digest = (TextView) itemView.findViewById(R.id.digest);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;

    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = null;
    }
}
