package com.lambdaschool.watermyplants.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "plants")
public class Plant extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long plantid;

    private String nickname;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private int waterfrequency;

    private String imgurl;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    @JsonIgnoreProperties(value = "plants",allowSetters = true)
    private User user;

    public Plant() {
    }

    public Plant(String nickname, String species, int waterfrequency, String imgurl, User user) {
        this.nickname = nickname;
        this.species = species;
        this.waterfrequency = waterfrequency;
        this.imgurl = imgurl;
        this.user = user;
    }

    public long getPlantid() {
        return plantid;
    }

    public void setPlantid(long plantid) {
        this.plantid = plantid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWaterfrequency() {
        return waterfrequency;
    }

    public void setWaterfrequency(int waterfrequency) {
        this.waterfrequency = waterfrequency;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
