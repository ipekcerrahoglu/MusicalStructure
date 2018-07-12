package com.example.lenovo.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Songs currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView bandTextView = (TextView) listItemView.findViewById(R.id.band_name);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        bandTextView.setText(currentSong.getBandName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}









