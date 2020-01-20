package com.epam.autumn.politech.ht10.structural.adapter;

public class AdapterMP3ToHiRes extends HiResPlayer implements MP3Player {
    @Override
    public void play() {
        playHiRes();
    }

    @Override
    public void getTrackInfo() {
        getTrackMedia();
    }

    @Override
    public void createPlaylist() {
        managePlayist();
    }
}
