package com.example.user.localservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class music extends Service {
    MediaPlayer media;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
        media.start();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        media=MediaPlayer.create(getApplicationContext(), R.raw.song);
        super.onCreate();

    }
    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        media.stop();
    }
}
