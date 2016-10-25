package qf.com.news.mvpview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import qf.com.news.R;

public class NewsDetailActivity extends AppCompatActivity {

    public WebView newDetail_webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        newDetail_webview = (WebView) findViewById(R.id.newsDetail_webview);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        newDetail_webview.loadUrl(url);
        finish();
    }
}
