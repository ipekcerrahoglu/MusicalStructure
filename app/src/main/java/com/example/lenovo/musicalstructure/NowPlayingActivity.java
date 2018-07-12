package com.example.lenovo.musicalstructure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class NowPlayingActivity extends AppCompatActivity {
    String songName;
    String bandName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        songName = getIntent().getStringExtra("song_name");
        bandName = getIntent().getStringExtra("band_name");

        TextView songTextView = (TextView) findViewById(R.id.song_name);
        TextView bandTextView = (TextView) findViewById(R.id.band_name);

        songTextView.setText(songName);
        bandTextView.setText(bandName);


    }
}
