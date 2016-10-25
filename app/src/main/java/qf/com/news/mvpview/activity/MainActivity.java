package qf.com.news.mvpview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

import qf.com.news.R;
import qf.com.news.image_utils.MessageEvent;
import qf.com.news.mvpview.fragment.BaseFragment;
import qf.com.news.mvpview.fragment.Mainfragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private BaseFragment baseFrament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseFrament = new BaseFragment();
        findViewById(R.id.main_home).setOnClickListener(this);
        findViewById(R.id.main_me).setOnClickListener(this);
        findViewById(R.id.main_hot).setOnClickListener(this);
        findViewById(R.id.main_funny).setOnClickListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_contain, baseFrament).commit();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_me:
                MeFragment meFragment = new MeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_contain, meFragment).commit();
                break;
            case R.id.main_home:
                EventBus.getDefault().post(new MessageEvent("home"));
                getSupportFragmentManager().beginTransaction().replace(R.id.main_contain, baseFrament).commit();
                break;
            case R.id.main_hot:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_contain, baseFrament).commit();
                EventBus.getDefault().post(new MessageEvent("hot"));
                break;
            case R.id.main_funny:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_contain, baseFrament).commit();
                EventBus.getDefault().post(new MessageEvent("funny"));
                break;
        }
    }
}
