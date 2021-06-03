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
                intent.putExtra("videoUrl", "https://halaty.net/upload/videos/2020/06/vtT81c7GRRE2FEhfquNw_21_1284ffb9aa4e594174f0a08ffc22b01b_video_240p_converted.mp4");
                startActivity(intent);
            }
        });

        binding.btnSecondVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "https://halaty.net/upload/videos/2020/07/ElUOmkHS3DqlQPKYF9ia_03_0d87feab17a09ba056b376d2efaf98c7_video_240p_converted.mp4");
                startActivity(intent);
            }
        });

        binding.btnThirdVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "https://halaty.net/upload/videos/2020/08/O37ARBwnjUP4bj9efDaX_23_f9d40a58f9e86a95fd9cd7eb42ee1d5a_video_240p_converted.mp4");
                startActivity(intent);
            }
        });

        binding.btnFourthVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VideoPlayerActivity.class);
                intent.putExtra("videoUrl", "https://halaty.net/upload/videos/2020/08/IsHtZZrDPxMZbMoad5kR_15_a359f8ca7078c9c25f1384b8484291e0_video_240p_converted.mp4");
                startActivity(intent);
            }
        });

    }
}