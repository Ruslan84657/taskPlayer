package com.player.track;

import com.player.song.Genre;
import com.player.song.Song;

import java.util.*;

public class Player {
    private ArrayList<Song> songsSet;
    private Queue<Song> qSongs;
    private int totalSongCount;
    private Random random;

    public Player() {
        this.songsSet = new ArrayList<>();
        this.qSongs = new LinkedList<>();
        this.totalSongCount = 0;
        this.random = new Random();
    }

    @Override
    public String toString() {
        return "Player{" +
                "songsSet=" + songsSet +
                ", qSongs=" + qSongs +
                ", totalSongCount=" + totalSongCount +
                ", random=" + random +
                '}';
    }

    public void addSong(int id, String artist, String title, Genre genre){
        songsSet.add(totalSongCount, new Song(id, artist, title, genre));
        totalSongCount++;
    }
    public void deleteSong(int id){
        songsSet.remove(id - 1);
        totalSongCount--;
    }
}
