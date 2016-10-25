package qf.com.news.image_utils;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;
import android.widget.ImageView;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by XiaoLiu on 2016/10/5.
 */
public class ImageUtils {
    static LruCache<String,Bitmap> cache = new LruCache<String,Bitmap>(20 << 20){
        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getRowBytes()*value.getHeight();
        }
    };
    private static Executor executor = new ScheduledThreadPoolExecutor(3);
    public static void loadImage(ImageView imageView,String path ,int id){
        ImageTask task = (ImageTask) imageView.getTag();
        if(task != null){
            task.cancel(false);
        }
        Bitmap bitmap = cache.get(path);
        if(bitmap != null){
            imageView.setImageBitmap(bitmap);
        }else {
            if(Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB){
                new ImageTask(imageView,id).executeOnExecutor(executor,path);
            }else {
                new ImageTask(imageView,id).execute(path);
            }
        }
    }
}
