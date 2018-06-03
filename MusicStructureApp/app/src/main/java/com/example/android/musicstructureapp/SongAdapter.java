package com.example.android.musicstructureapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aiden on 07/03/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    private Context mContext;

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);

        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        //Find current song and display to song text view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        if (currentSong != null) {
            songTextView.setText(currentSong.getSongName());
        }

        //Find current artist and display to artist text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        if (currentSong != null) {
            artistTextView.setText(currentSong.getArtistName());
        }

        //Find current album and display to album text view
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        if (currentSong != null) {
            albumTextView.setText(currentSong.getAlbumName());
        }

        songTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext, MainActivity.class));
            }
        });

        artistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext, MainActivity.class));
            }
        });

        albumTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext, MainActivity.class));
            }
        });

        return listItemView;
    }
}
