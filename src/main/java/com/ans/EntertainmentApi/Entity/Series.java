package com.ans.EntertainmentApi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "series")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "series_name")
    private String seriesName;

    @Column(name = "type")
    private String type;

    @Column(name = "language")
    private String language;

    @Column(name = "rating")
    private double rating;

    public Series(){

    }

    public Series(String seriesName, String type, String language, double rating) {
        this.seriesName = seriesName;
        this.type = type;
        this.language = language;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Series{" +
                "id=" + id +
                ", seriesName='" + seriesName + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", rating=" + rating +
                '}';
    }
}
