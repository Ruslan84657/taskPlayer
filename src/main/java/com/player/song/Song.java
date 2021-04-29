package com.player.song;

public class Song {
    private int songId;
    private String artist;
    private String title;
    private Genre genre;

    public Song(int id, String artist, String title, Genre genre) {
        this.songId = id;
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return songId;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
