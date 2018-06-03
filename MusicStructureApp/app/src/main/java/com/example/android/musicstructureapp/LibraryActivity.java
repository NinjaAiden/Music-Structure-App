package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Aiden on 05/03/2018.
 */

public class LibraryActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Change", "Miwa", "Guitarissimo"));
        songs.add(new Song("Guilty Pleasure", "Becca","Turn To Stone"));
        songs.add(new Song("Gimme chocolate!!", "BabyMetal", "Metal Resistance"));
        songs.add(new Song("Doubt andTrust", "Access", "Dgray Man OST"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);
    }
}