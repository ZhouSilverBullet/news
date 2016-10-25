package qf.com.news.adapter;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import qf.com.news.R;
import qf.com.news.bean.qsbk.TextBean;

/**
 * Created by Administrator on 2016/10/4.
 */

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHolder> implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    private Context context;
    private RecyclerView recyclerView;
    private List<TextBean.ItemsBean> itemBeanList;
    private AlertDialog alertDialog;
    public TextAdapter(Context context,List<TextBean.ItemsBean> itemBeanList){
        this.context=context;
        this.itemBeanList=itemBeanList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.text,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextBean.ItemsBean itemBean = itemBeanList.get(position);
        if(itemBean.getUser()!=null){
            holder.login.setText(itemBean.getUser().getLogin());
            Picasso.with(context).load("http://pic.qiushibaike.com/system/avtnew/"
                    +itemBean.getUser().getUid()/10000+"/"
                    +itemBean.getUser().getUid()+"/thumb/"
                    +itemBean.getUser().getIcon()).into(holder.text_icon);
        }
        holder.content.setText(itemBean.getContent());
       // holder.content.setOnClickListener(this);
        holder.vote_up.setText(itemBean.getVotes().getUp()+"");
        holder.comments_count.setText(itemBean.getComments_count()+"");
        holder.share.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return itemBeanList==null?0:itemBeanList.size();
    }

    @Override
    public void onClick(View view) {
        createDialog();
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.shared_copy:
                Toast.makeText(context,"糗事已复制",Toast.LENGTH_LONG).show();
                alertDialog.dismiss();
                break;
            case R.id.shared_collection:
                View view =LayoutInflater.from(context).inflate(R.layout.shared_collection_dialog,null);
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setView(view);
                builder.create();
                builder.show();
                alertDialog.dismiss();
                break;
            case R.id.shared_report:
                View view1 =LayoutInflater.from(context).inflate(R.layout.shared_report_dialog,null);
                AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
                builder1.setView(view1);
                builder1.create();
                builder1.show();
                alertDialog.dismiss();
                break;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView text_icon;
        private TextView login;
        private TextView content;
        private TextView vote_up;
        private TextView comments_count;
        private ImageView share;
        public ViewHolder(View itemView) {
            super(itemView);
            text_icon = (ImageView)itemView.findViewById(R.id.text_user_icon);
            login = (TextView)itemView.findViewById(R.id.text_login);
            content = (TextView)itemView.findViewById(R.id.text_content);
            vote_up = (TextView)itemView.findViewById(R.id.text_votes_up);
            comments_count = (TextView)itemView.findViewById(R.id.text_comments_count);
            share= (ImageView) itemView.findViewById(R.id.text_shared);
        }


    }
    public void createDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.text_shared_dialog,null);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.shared_radiogroup);
        radioGroup.setOnCheckedChangeListener(this);
        builder.setView(view);
        alertDialog=builder.create();
        alertDialog.show();
    }
}
