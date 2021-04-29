package com.player;

import com.player.song.Genre;
import com.player.track.Player;

public class MainPlayer {
    public static void main(String[] args) {
        Player player = new Player();
        player.addSong(1, "NK", "Elefante", Genre.POP);
        player.addSong(2, "BI-2", "Serebro", Genre.ROCK);
        player.addSong(3, "KINO", "Kukushka", Genre.ROCK);
        player.addSong(4, "Bethoven", "Moon Sonate", Genre.CLASSIC);
        player.addSong(5, "Armstrong", "What A Wonderful World", Genre.JAZZ);
        player.addSong(6, "Gary Moore", "Still Got The Blues", Genre.BLUEZ);
        player.addSong(7, "Inna", "Hot", Genre.POP);

        System.out.println(player);

        player.deleteSong(3);

        System.out.println(player);
    }
}
