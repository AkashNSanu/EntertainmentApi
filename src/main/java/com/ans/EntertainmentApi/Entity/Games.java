package com.ans.EntertainmentApi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "device")
    private String device;

    @Column(name = "type")
    private String type;

    @Column(name = "rating")
    private double rating;

    public Games(){

    }

    public Games(String gameName, String device, String type, double rating) {
        this.gameName = gameName;
        this.device = device;
        this.type = type;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", device='" + device + '\'' +
                ", type='" + type + '\'' +
                ", rating=" + rating +
                '}';
    }
}
