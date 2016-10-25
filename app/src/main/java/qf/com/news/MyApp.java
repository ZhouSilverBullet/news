package qf.com.news;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * created by javac on 16-10-4.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class MyApp extends Application {
    public static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(getApplicationContext());
        mContext = getApplicationContext();
    }


}
