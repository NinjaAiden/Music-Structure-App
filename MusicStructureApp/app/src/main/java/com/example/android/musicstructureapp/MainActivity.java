package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String mPrevious, mNext, mPlay;
    ImageButton iBtnPlay, iBtnPrev, iBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iBtnPlay = findViewById(R.id.playBtn);
        iBtnNext = findViewById(R.id.nextBtn);
        iBtnPrev = findViewById(R.id.prevBtn);
        mPrevious = getResources().getString(R.string.previous_skip);
        mPlay = getResources().getString(R.string.play);
        mNext = getResources().getString(R.string.next_skip);

        iBtnPrev.setOnClickListener(this);
        iBtnPlay.setOnClickListener(this);
        iBtnNext.setOnClickListener(this);

        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(songIntent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.playBtn:
                Toast.makeText(MainActivity.this, mPlay,
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.nextBtn:
                Toast.makeText(MainActivity.this, mNext,
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.prevBtn:
                Toast.makeText(MainActivity.this, mPrevious,
                        Toast.LENGTH_SHORT).show();
        }
    }
}