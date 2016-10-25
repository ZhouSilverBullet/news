package qf.com.news.mvpview.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import qf.com.news.R;
import qf.com.news.adapter.WelcomeAdapter;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private ViewPager viewPager;
    private WelcomeAdapter welcomeAdapter;
    private int[] ids = {R.drawable.a, R.drawable.b, R.drawable.c};
    private List<ImageView> imageViewList;
    private LinearLayout linearLayout;
    private int lastPosition;
    private TextView button;
    public SharedPreferences sp;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //私有数据
        sp = getSharedPreferences("config", Context.MODE_PRIVATE);
        editor = sp.edit();
        boolean first = sp.getBoolean("first", false);
        if (!first) {
            openFirst();
        }else{
            startIntentActivity();
        }
    }

    private void openFirst() {
        editor.putBoolean("first", true).commit();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        button = (TextView) findViewById(R.id.button);
        imageViewList = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(ids[i]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageViewList.add(imageView);
            View view = new View(this);
            view.setBackgroundResource(R.drawable.enable);
            if (i != 0) {
                view.setEnabled(false);//默认只有第一个为红色,其他为黑色
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(20, 20);
            layoutParams.rightMargin = 10;
            linearLayout.addView(view, layoutParams);
        }
        welcomeAdapter = new WelcomeAdapter(imageViewList);
        viewPager.setAdapter(welcomeAdapter);
        viewPager.addOnPageChangeListener(this);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        startIntentActivity();
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

    private void startIntentActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        View chartAt = linearLayout.getChildAt(position);
        chartAt.setEnabled(true);
        linearLayout.getChildAt(lastPosition).setEnabled(false);
        lastPosition = position;
        if (position == ids.length - 1) {
            button.setVisibility(View.VISIBLE);
        }
        else {
            button.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
