package com.kv.javabasics.challenges.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double duration) {
        if(findSong(songTitle) == null) {
            songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for(int i=0; i< songs.size();i++) {
            if(songs.get(i).getTitle().equals(songTitle))
                return songs.get(i);
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        } else {
            // System.out.println("This album doesn't have a track");
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        int trackNumber = this.songs.indexOf(song);
        return addToPlayList(trackNumber, playlist);
    }

}
