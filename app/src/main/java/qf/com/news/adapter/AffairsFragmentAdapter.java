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
import qf.com.news.bean.news.AffairsBean;
import qf.com.news.image_utils.ImageUtils;
import qf.com.news.mvpview.activity.NewsDetailActivity;

/**
 * Created by XiaoLiu on 2016/10/4.
 */
public class AffairsFragmentAdapter extends RecyclerView.Adapter<AffairsFragmentAdapter.ViewHolder> implements View.OnClickListener {
    private List<AffairsBean.T1348648141035Bean> list;
    private Context context;
    private RecyclerView recyclerView;
    public AffairsFragmentAdapter(List<AffairsBean.T1348648141035Bean> list, Context context) {
        this.list = list;
        this.context = context;
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

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.affairs_item,parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.digest.setText(list.get(position).getDigest());
        holder.likeCount.setText(list.get(position).getReplyCount()+"");
        holder.time.setText(list.get(position).getPtime());
      //  Picasso.with(context).load(list.get(position).getImgsrc()).placeholder(R.mipmap.personal_default).error(R.mipmap.personal_default).into(holder.image);
        ImageUtils.loadImage(holder.image,list.get(position).getImgsrc(),R.mipmap.personal_default);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public void onClick(View view) {
        int position = recyclerView.getChildAdapterPosition(view);
        String url = "";
        if(null != list.get(position).getUrl_3w()){
            url = list.get(position).getUrl_3w();
        }else{
            //可以加上一个提示
        }
        if(!TextUtils.isEmpty(url)){
            Log.e("d", "类名==ScienceAdapter" + "方法名==onClick=====:" + url);
            Intent intent = new Intent(view.getContext(), NewsDetailActivity.class);
            intent.putExtra("url", url);
            view.getContext().startActivity(intent);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView time;
        private TextView likeCount;
        private TextView digest;
        private ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            time = (TextView) itemView.findViewById(R.id.time);
            likeCount = (TextView) itemView.findViewById(R.id.likeCount);
            digest = (TextView) itemView.findViewById(R.id.digest);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
