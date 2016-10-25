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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.qsbk.SuggestBean;

/**
 * Created by zz on 16-10-6.
 */

public class SuggestAdapter extends SuperAdapter<SuggestBean.ItemsBean, SuggestAdapter.ViewHolder> {

    private static MediaPlayer player;
    private static SuggestAdapter.ViewHolder playHolder;

    public SuggestAdapter(Context context, List list, int[] layoutId) {
        super(context, list, layoutId);
        player = new MediaPlayer();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(viewType, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        if (position + 1 == getItemCount()) {
            return;
        }

        final SuggestBean.ItemsBean itemsBean = list.get(position);
        final String url = imgUrl1 + itemsBean.getId() / 10000 + "/" + itemsBean.getId() + "/medium/" + itemsBean.getImage();
        SuggestBean.ItemsBean.UserBean user = itemsBean.getUser();
        if (user == null) {
            return;
        }
        String userUrl = imgUrl + user.getUid() / 10000 + "/" + user.getUid() + "/thumb/" + user.getIcon();
        //图片
        if (getToChild(position) == layoutId[0]) {
            if (user != null) {
                Picasso.with(context).load(url).into(holder.imgrank_image);
                Uri uri = Uri.parse(userUrl);
                holder.imgrank_icon.setImageURI(uri);
                holder.imgrank_content.setText(itemsBean.getContent());
                holder.imgrank_login.setText(user.getLogin());
                holder.imgrank_layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onChildClickListener.onChildClickListener(itemsBean, url, position);
                    }
                });
            }
        } else if (getToChild(position) == layoutId[1]) {
            if(itemsBean.getContent()!=null){
                holder.text_content.setText(itemsBean.getContent());
                holder.text_icon.setImageURI(userUrl);
                holder.textLogin.setText(user.getLogin());
                holder.text_content.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onChildClickListener.onChildClickListener(itemsBean,"",position);
                    }
                });
            }
        }else if(getToChild(position) == layoutId[2]){

            Uri uri = Uri.parse(imgUrl + user.getUid() / 10000 + "/" + user.getUid() + "/thumb/" + user.getIcon());
            holder.icon.setImageURI(uri);
            holder.content.setText(itemsBean.getContent());
            holder.login.setText(user.getLogin());
            Picasso.with(context).load(itemsBean.getPic_url()).into(holder.pic);
            holder.data = itemsBean;
            //holder.content.setOnClickListener(itemsBean);
            //holder.content.setOnClickListener(itemsBean);
            holder.play.setOnClickListener(holder);
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
    public int getToChild(int position) {
        SuggestBean.ItemsBean itemsBean = list.get(position);
        String format = itemsBean.getFormat();
        if ("image".equals(format)) {
            //图片 布局  imgrank
            return layoutId[0];
        } else if ("word".equals(format)) {
            //文字的布局  text
            return layoutId[1];
        } else if ("video".equals(format)) {
            //视频布局  video
            return layoutId[2];
        }
        return 0;
    }

    @Override
    public void onViewDetachedFromWindow(SuggestAdapter.ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        player.reset();
        if (playHolder != null) {
            playHolder.reset();
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {
        private final SimpleDraweeView text_icon;
        private final TextView textLogin;
        private final TextView text_content;

        private SimpleDraweeView imgrank_icon;
        private TextView imgrank_login;
        private TextView imgrank_content;
        private ImageView imgrank_image;
        private LinearLayout imgrank_layout;

        private final SimpleDraweeView icon;
        private final TextView login;
        private final TextView content;
        private final ImageView pic;
        private final ProgressBar progressBar;
        private final SurfaceView surface;
        private final ImageView play;
        private SuggestBean.ItemsBean data;

        public ViewHolder(View itemView) {
            super(itemView);
            text_icon = ((SimpleDraweeView) itemView.findViewById(R.id.text_item_icon));
            textLogin = ((TextView) itemView.findViewById(R.id.text_item_login));
            text_content = ((TextView) itemView.findViewById(R.id.text_item_content));

            imgrank_icon = ((SimpleDraweeView) itemView.findViewById(R.id.imgrank_item_icon));
            imgrank_login = ((TextView) itemView.findViewById(R.id.imgrank_item_login));
            imgrank_content = ((TextView) itemView.findViewById(R.id.imgrank_item_content));
            imgrank_image = ((ImageView) itemView.findViewById(R.id.imgrank_item_image));
            imgrank_layout = ((LinearLayout) itemView.findViewById(R.id.item_linear));


            icon = ((SimpleDraweeView) itemView.findViewById(R.id.video_item_icon));
            login = ((TextView) itemView.findViewById(R.id.video_item_login));
            content = ((TextView) itemView.findViewById(R.id.video_item_content));
            pic = ((ImageView) itemView.findViewById(R.id.video_item_pic));
            progressBar = ((ProgressBar) itemView.findViewById(R.id.video_item_progress));
            surface = ((SurfaceView) itemView.findViewById(R.id.video_item_surface));
            play = ((ImageView) itemView.findViewById(R.id.video_item_play));
//            play.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (playHolder != null) {
                reset();
            }
            if (player.isPlaying()) {
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
            playHolder = null;
        }
    }
}
