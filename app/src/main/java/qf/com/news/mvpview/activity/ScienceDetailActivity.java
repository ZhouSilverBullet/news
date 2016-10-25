package qf.com.news.mvpview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import qf.com.news.R;

public class ScienceDetailActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_detail);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webView = ((WebView) findViewById(R.id.webView));
        webView.loadUrl(url);
    }
}
