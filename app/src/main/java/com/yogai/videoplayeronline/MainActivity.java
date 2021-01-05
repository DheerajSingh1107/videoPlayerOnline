package com.yogai.videoplayeronline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private static final String VIDEO_SAMPLE =
            "https://developers.google.com/training/images/tacoma_narrows.mp4";
    private VideoView mVideoView;
    private TextView mBufferingTextView;
    private int mCurrentPosition = 0;
   // private int mCurrentPosition = 0;
    private static final String PLAYBACK_TIME = "play_time";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView= findViewById(R.id.videoview);
        mVideoView.setVideoPath(VIDEO_SAMPLE);
        mVideoView.start();
        
        if (savedInstanceState !=null){
            mCurrentPosition = savedInstanceState.getInt(PLAYBACK_TIME);
        }

        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(mVideoView);
        mVideoView.setMediaController(controller);
    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        initializePlayer();
//    }
//
//    @Override
//    protected void onPause() {
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
//            super.onPause();
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//    }
//
//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt(PLAYBACK_TIME, mVideoView.getCurrentPosition());
//    }
//
//    private void releaseMediaPlayer() {
//    }
//
//    private void initializePlayer() {
//        mBufferingTextView.setVisibility(VideoView.VISIBLE);
//        Uri videoUri = getMedia
//    }
}