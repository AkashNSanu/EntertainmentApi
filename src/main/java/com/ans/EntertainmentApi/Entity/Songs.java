package com.ans.EntertainmentApi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class Songs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "song_name")
    private String songName;

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "language")
    private String language;

    @Column(name = "rating")
    private double rating;

    public Songs(){

    }

    public Songs(String songName, String artistName, String language, double rating) {
        this.songName = songName;
        this.artistName = artistName;
        this.language = language;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", language='" + language + '\'' +
                ", rating=" + rating +
                '}';
    }
}
