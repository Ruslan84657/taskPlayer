package com.player.songPlayer;

import com.player.song.Song;

import java.util.*;

public class Player {
    private List<Song> playlist;
    private Song currentSong;

    public Player() {
        this.playlist = new ArrayList<>();
    }

    /**
     * Method to add a song to the playlist.
     *
     * @param song the song to be added.
     */
    public void addSong(Song song) {
        playlist.add(song);
        System.out.println("Song was added to playlist!");
    }

    /**
     * Method to remove a song from the playlist.
     *
     * @param song the song to be deleted.
     */
    public void deleteSong(Song song) {
        if (playlist.remove(song)) {
            System.out.println("Song was removed : " + song);
        } else {
            System.out.println("Song can not remove : " + song);
        }
    }

    /**
     * Method to play current song.
     *
     * @param song the song to be played.
     */
    public void playSong(Song song) {
        currentSong = song;
        System.out.println("Now is playing : " + currentSong);
    }

    /**
     * Method to shuffle the playlist.
     */
    public void mixPlayList() {
        Collections.shuffle(this.playlist, new Random(this.playlist.size()));
    }

    /**
     * Method to sort the playlist.
     */
    public void playInOrder() {
        this.playlist.sort(Comparator.comparingInt(Song::getId));
        currentSong = playlist.get(0);
        System.out.println("Now is playing : " + currentSong);
    }

    /**
     * Method to play next song.
     */
    public void playNext() {
        System.out.println("Play next");
        if (currentSong != null) {
            for (int i = 0; i < playlist.size(); i++) {
                Song song = playlist.get(i);
                if (playlist.size() - 1 != i) {
                    if (song.getId() == currentSong.getId()) {
                        playSong(playlist.get(i + 1));
                        break;
                    }
                } else {
                    playSong(playlist.get(0));
                }
            }
        } else {
            playSong(playlist.get(0));
        }
    }

    /**
     * Method to play previously song.
     */
    public void playPreviously() {
        System.out.println("Play previously");
        if (currentSong != null) {
            for (int i = playlist.size() - 1; i >= 0; i--) {
                Song song = playlist.get(i);
                if (i > 0) {
                    if (song.getId() == currentSong.getId()) {
                        playSong(playlist.get(i - 1));
                        break;
                    }
                } else {
                    playSong(playlist.get(playlist.size() - 1));
                }
            }
        } else {
            playSong(playlist.get(playlist.size() - 1));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "playlist=" + playlist +
                ", currentSong=" + currentSong +
                '}';
    }
}
