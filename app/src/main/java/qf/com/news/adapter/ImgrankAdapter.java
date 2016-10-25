package qf.com.news.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.qsbk.ImgrankBean;

/**
 * Created by zz on 16-10-6.
 */

public class ImgrankAdapter extends SuperAdapter<ImgrankBean.ItemsBean,ImgrankAdapter.ViewHolder>{


    public ImgrankAdapter(Context context, List<ImgrankBean.ItemsBean> list, int[] layoutId) {
        super(context, list, layoutId);
    }

    @Override
    public ImgrankAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(viewType, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ImgrankAdapter.ViewHolder holder, final int position) {
        final ViewHolder viewHolder = (ViewHolder) holder;
        if (position + 1 == getItemCount()) {
            return;
        }
        final ImgrankBean.ItemsBean itemsBean = list.get(position);
        ImgrankBean.ItemsBean.UserBean user = itemsBean.getUser();
        if (user != null) {
            final String url = imgUrl1 + itemsBean.getId() / 10000 + "/" + itemsBean.getId() + "/medium/" + itemsBean.getImage();
            Picasso.with(context).load(url).into(viewHolder.image);
            Uri uri = Uri.parse(imgUrl + user.getUid() / 10000 + "/" + user.getUid() + "/thumb/" + user.getIcon());
            viewHolder.icon.setImageURI(uri);
            viewHolder.content.setText(itemsBean.getContent());
            viewHolder.login.setText(user.getLogin());
            viewHolder.layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onChildClickListener.onChildClickListener(itemsBean,url,position);
                }
            });
        }
    }

    @Override
    public int getToChild(int position) {
        return layoutId[0];
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private  SimpleDraweeView icon;
        private  TextView login;
        private  TextView content;
        private  ImageView image;
        private  LinearLayout layout;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = ((SimpleDraweeView) itemView.findViewById(R.id.imgrank_item_icon));
            login = ((TextView) itemView.findViewById(R.id.imgrank_item_login));
            content = ((TextView) itemView.findViewById(R.id.imgrank_item_content));
            image = ((ImageView) itemView.findViewById(R.id.imgrank_item_image));
            layout = ((LinearLayout) itemView.findViewById(R.id.item_linear));
        }
    }
}
