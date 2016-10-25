package qf.com.news.image_utils;

/**
 * Created by XiaoLiu on 2016/10/5.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class ImageTask extends AsyncTask<String,Void,Bitmap>{
    private ImageView imageView;
    private int id;
    private String path;

    public ImageTask(ImageView imageView, int id) {
        this.imageView = imageView;
        this.id = id;
        imageView.setTag(this);
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        path = strings[0];
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                return BitmapFactory.decodeStream(connection.getInputStream());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        if(bitmap != null){
            imageView.setImageBitmap(bitmap);
            ImageUtils.cache.put(path,bitmap);
        }else{
            imageView.setImageResource(id);
        }
    }

    @Override
    protected void onCancelled(Bitmap bitmap) {
        if(bitmap != null){
            ImageUtils.cache.put(path,bitmap);
        }
    }
}
