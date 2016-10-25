package qf.com.news.server.news;

import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import qf.com.news.MyApp;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class HomeServer {

    public static final String URL = "http://c.m.163.com/nc/";//接口地址//实例化Retrofit
    public static final String qsbkUrl = "http://m2.qiushibaike.com/";//增加糗事百科的host

    static File httpCacheDirectory = new File(MyApp.mContext.getExternalCacheDir(), "responses");
    static int cacheSize = 10 * 1024 * 1024*2;// 20 MiB
    static Cache cache = new Cache(httpCacheDirectory, cacheSize);


    static Interceptor interceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            long totalSpace = httpCacheDirectory.getTotalSpace();
            if (totalSpace<=0) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }
            Response response = chain.proceed(request);
            return response;
        }
    };
    static OkHttpClient client = new OkHttpClient.Builder().cache(cache)
            .addInterceptor(interceptor)
            .build();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .client(client)
            .build();

    public static <T> T getApi(Class<T> clazz) {
        return retrofit.create(clazz);//创建Retrofit实例并返回Server的实例
    }

    //糗事百科的请求

    private static Retrofit retrofit1 = new Retrofit.Builder()
            .baseUrl(qsbkUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .client(client)
            .build();


    public static <T> T getQsbkApi(Class<T> clazz) {
        return retrofit1.create(clazz);//创建Retrofit实例并返回Server的实例
    }
}
