package com.iug.videostreaming;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.iug.videostreaming.databinding.ActivityVideoPlayerBinding;

public class VideoPlayerActivity extends AppCompatActivity {

    private ActivityVideoPlayerBinding binding;

    private SimpleExoPlayer player;
    private String videoUrl;

    private boolean playWhenReady = true;
    private int currentWindow = 0;
    private long playBackPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVideoPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        videoUrl = getIntent().getStringExtra("videoUrl");

    }

    private void initVideo() {
        player = ExoPlayerFactory.newSimpleInstance(this);

        binding.playerView.setPlayer(player);

        Uri uri = Uri.parse(videoUrl);
        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this, "exoplayer-codelab");
        MediaSource mediaSource = new ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(uri);

        player.setPlayWhenReady(playWhenReady);
        player.seekTo(currentWindow, playBackPosition);
        player.prepare(mediaSource, false, false);

    }

    private void releaseVideo() {
        if (player != null) {
            playWhenReady = player.getPlayWhenReady();
            playBackPosition = player.getCurrentPosition();
            currentWindow = player.getCurrentWindowIndex();
            player.release();
            player.stop();
            player = null;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        initVideo();
    }

    @Override
    protected void onPause() {
        super.onPause();
        releaseVideo();
    }

}