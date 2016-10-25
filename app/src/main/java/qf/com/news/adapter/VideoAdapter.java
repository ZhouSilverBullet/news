package qf.com.news.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.qsbk.VideoBean;

/**
 * Created by zz on 16-10-6.
 */

public class VideoAdapter extends SuperAdapter<VideoBean.ItemsBean,VideoAdapter.ViewHolder>{

    private static MediaPlayer player;
    private static ViewHolder playHolder;

    public VideoAdapter(Context context, List<VideoBean.ItemsBean> list, int[] layoutId) {
        super(context, list, layoutId);
        player = new MediaPlayer();
    }

    @Override
    public int getToChild(int position) {
        return layoutId[0];
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        if (position + 1 == getItemCount()) {
            return;
        }
        if (holder.equals(playHolder)) {
            playHolder.reset();
        }
        final VideoBean.ItemsBean itemsBean = list.get(position);
        VideoBean.ItemsBean.UserBean user = itemsBean.getUser();
        if (user != null) {
            Uri uri = Uri.parse(imgUrl + user.getUid() / 10000 + "/" + user.getUid() + "/thumb/" + user.getIcon());
            holder.icon.setImageURI(uri);
            holder.content.setText(itemsBean.getContent());
            holder.login.setText(user.getLogin());
            Picasso.with(context).load(itemsBean.getPic_url()).into(holder.pic);
            holder.data = itemsBean;
            //holder.content.setOnClickListener(itemsBean);
            //holder.content.setOnClickListener(itemsBean);
            holder.content.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // context.startActivity();
                    onChildClickListener.onChildClickListener(itemsBean,itemsBean.getPic_url(),position);
                }
            });
        }
    }
    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        player.reset();
        if (playHolder != null) {
            playHolder.reset();
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {
        private final SimpleDraweeView icon;
        private final TextView login;
        private final TextView content;
        private final ImageView pic;
        private final ProgressBar progressBar;
        private final SurfaceView surface;
        private final ImageView play;
        private VideoBean.ItemsBean data;


        public ViewHolder(View itemView) {
            super(itemView);
            icon = ((SimpleDraweeView) itemView.findViewById(R.id.video_item_icon));
            login = ((TextView) itemView.findViewById(R.id.video_item_login));
            content = ((TextView) itemView.findViewById(R.id.video_item_content));
            pic = ((ImageView) itemView.findViewById(R.id.video_item_pic));
            progressBar = ((ProgressBar) itemView.findViewById(R.id.video_item_progress));
            surface = ((SurfaceView) itemView.findViewById(R.id.video_item_surface));
            play = ((ImageView) itemView.findViewById(R.id.video_item_play));
            play.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {
            if (playHolder!=null) {
                reset();
            }
            if(player.isPlaying()){
                reset();
            }
            try {

                player.reset();
                player.setDataSource(data.getLow_url());
                player.setOnPreparedListener(this);
                player.setDisplay(surface.getHolder());
                player.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
            play.setVisibility(View.INVISIBLE);
            progressBar.setVisibility(View.VISIBLE);
            playHolder = this;

        }

        private void reset() {
            play.setVisibility(View.VISIBLE);
            pic.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.INVISIBLE);
        }

        @Override
        public void onPrepared(MediaPlayer mp) {
            mp.start();
            pic.setVisibility(View.INVISIBLE);
            progressBar.setVisibility(View.INVISIBLE);
            player.setOnCompletionListener(this);
        }

        @Override
        public void onCompletion(MediaPlayer mp) {
            play.setVisibility(View.VISIBLE);
            pic.setVisibility(View.VISIBLE);
            playHolder =null;
        }
    }

}
