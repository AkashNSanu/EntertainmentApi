package com.ans.EntertainmentApi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "hero_name")
    private String heroName;

    @Column(name = "type")
    private String type;

    @Column(name = "industry")
    private String industry;

    @Column(name = "rating")
    private double rating;

    public Movies(){

    }

    public Movies(String movieName, String heroName, String type, String industry, double rating) {
        this.movieName = movieName;
        this.heroName = heroName;
        this.type = type;
        this.industry = industry;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", heroName='" + heroName + '\'' +
                ", type='" + type + '\'' +
                ", industry='" + industry + '\'' +
                ", rating=" + rating +
                '}';
    }
}
