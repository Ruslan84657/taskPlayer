package com.player.songPlayer;

import com.player.song.Genre;
import com.player.song.Song;

import java.util.*;

public class Player {
    private List<Song> playlist;
    private Queue<Song> qSongs;
    private int totalSongCount;
    private Song currentSong;

    public Player() {
        this.playlist = new ArrayList<>();
        this.qSongs = new LinkedList<>();
        this.totalSongCount = 0;
    }

    public void addSong(Song song){
        playlist.add(song);
        System.out.println("Song was added to playlist!");
    }

    public void deleteSong(Song song){
        if (playlist.remove(song)){
            System.out.println("Song was removed : " + song);
        }else{
            System.out.println("Song can not remove : " + song);
        }
    }
    public void playSong(Song song){
        currentSong = song;
        System.out.println("Now is playing : " + currentSong);
    }
    public void mixPlayList(){
        Collections.shuffle(this.playlist, new Random(this.playlist.size()));
    }
    public void playNext(){
        System.out.println("Play next");
        if (currentSong != null){
            for (int i = 0; i < playlist.size(); i++) {
                Song song = playlist.get(i);
                if (playlist.size() - 1 != i){
                    if (song.getId() == currentSong.getId()) {
                        playSong(playlist.get(i + 1));
                        break;
                    }
                } else {
                    playSong(playlist.get(0));
                }
            }
        }else{
            playSong(playlist.get(0));
        }
    }
    @Override
    public String toString() {
        return "Player{" +
                "songsSet=" + playlist +
                ", qSongs=" + qSongs +
                ", totalSongCount=" + totalSongCount +
                '}';
    }
}
