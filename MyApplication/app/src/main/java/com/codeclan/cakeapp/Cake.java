package com.codeclan.cakeapp;

/**
 * Created by user on 15/03/2017.
 */

public class Cake {

    private int ranking;
    private String name;

    public Cake(Integer ranking, String name) {
        this.ranking = ranking;
        this.name = name;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

}