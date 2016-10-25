package qf.com.news.mvpview.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

import qf.com.news.R;
import qf.com.news.mvpview.fragment.RecommendFragment;

public class RecommendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        Intent intent = getIntent();
        Serializable data = intent.getSerializableExtra("data");
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_recommend,RecommendFragment.newInstance(data))
            .commit();
    }
}
