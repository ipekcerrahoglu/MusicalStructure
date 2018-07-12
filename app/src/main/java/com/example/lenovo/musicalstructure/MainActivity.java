package com.example.lenovo.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Songs> songs = new ArrayList<Songs>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.playlist);

        // Find the View that shows the numbers category

        songs.add(new Songs(getString(R.string.song1), getString(R.string.band1)));
        songs.add(new Songs(getString(R.string.song2), getString(R.string.band2)));
        songs.add(new Songs(getString(R.string.song3), getString(R.string.band3)));
        songs.add(new Songs(getString(R.string.song4), getString(R.string.band4)));
        songs.add(new Songs(getString(R.string.song5), getString(R.string.band5)));
        songs.add(new Songs(getString(R.string.song6), getString(R.string.band6)));
        songs.add(new Songs(getString(R.string.song7),getString(R.string.band7)));
        songs.add(new Songs(getString(R.string.song8), getString(R.string.band8)));
        songs.add(new Songs(getString(R.string.song9), getString(R.string.band9)));
        songs.add(new Songs(getString(R.string.song10), getString(R.string.band10)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        final ListView listView = (ListView) findViewById(R.id.listView);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                intent.putExtra("song_name",songs.get(i).getSongName());
                intent.putExtra("band_name",songs.get(i).getBandName());
                startActivity(intent);
            }
        });

        }
    }




