package com.epam.autumn.politech.ht10.structural.adapter;



public class AdapterRunner {
    public static void main(String[] args) {
         MP3Player player = new AdapterMP3ToHiRes();
         player.play();
         player.getTrackInfo();
         player.createPlaylist();

    }






}
