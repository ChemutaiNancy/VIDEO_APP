package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView myvideoview = findViewById(R.id.videoView);
        //set link of the video
        myvideoview.setVideoPath("https://www.youtube.com/watch?v=R-JbDMYmAQM");

        //make video start
        myvideoview.start();
    }
}
