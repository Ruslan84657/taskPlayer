package com.player;

import com.player.song.Genre;
import com.player.song.Song;
import com.player.songPlayer.Player;

import java.util.ArrayList;
import java.util.List;

public class MainPlayer {
    public static void main(String[] args) {
        Player player = new Player();

        List<Song> songs = createSongs();
        songs.forEach(song -> player.addSong(song));

        System.out.println(player);

        player.deleteSong(songs.get(2));

        System.out.println(player);

        player.mixPlayList();

        System.out.println(player);

        player.playNext();
        player.playNext();
        player.playNext();

    }
    private static List<Song> createSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "NK", "Elefante", Genre.POP));
        songs.add(new Song(2, "BI-2", "Serebro", Genre.ROCK));
        songs.add(new Song(3, "KINO", "Kukushka", Genre.ROCK));
        songs.add(new Song(4, "Bethoven", "Moon Sonate", Genre.CLASSIC));
        songs.add(new Song(5, "Armstrong", "What A Wonderful World", Genre.JAZZ));
        songs.add(new Song(6, "Gary Moore", "Still Got The Blues", Genre.BLUEZ));
        songs.add(new Song(7, "Inna", "Hot", Genre.POP));
        return songs;
    }
}
