package com.iug.videostreaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.iug.videostreaming.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFirstVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4");
                startActivity(intent);
            }
        });

        binding.btnSecondVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4");
                startActivity(intent);
            }
        });

        binding.btnThirdVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4");
                startActivity(intent);
            }
        });

        binding.btnFourthVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4");
                startActivity(intent);
            }
        });

    }
}