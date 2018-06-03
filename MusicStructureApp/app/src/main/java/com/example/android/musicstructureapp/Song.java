package com.example.android.musicstructureapp;

/**
 * Created by Aiden on 07/03/2018.
 */

public class Song {

    private String mSongName;

    private String mArtistName;

    private String mAlbumName;

    public Song(String songName, String artistName, String albumName){

        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public String getSongName()     {return mSongName;}

    public String getArtistName()   {return mArtistName;}

    public String getAlbumName()    {return mAlbumName;}
}
