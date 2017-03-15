package com.codeclan.cakeapp;

/**
 * Created by user on 15/03/2017.
 */

import java.util.ArrayList;
import java.util.ArrayList;

public class TopCakes {

    private ArrayList<Cake> list;

    public TopCakes() {
        list = new ArrayList<Cake>();
        list.add(new Cake(1, "Apple Turnover"));
        list.add(new Cake(2, "Chocolate Gateau"));
        list.add(new Cake(3, "Chocolate Brownie"));
        list.add(new Cake(4, "Cheesecake"));
        list.add(new Cake(5, "Cupcake"));
        list.add(new Cake(6, "Fruitcake"));
        list.add(new Cake(7, "Muffin"));
        list.add(new Cake(8, "Polenta"));
        list.add(new Cake(9, "Traybake"));
        list.add(new Cake(10, "Wedding Cake"));
        list.add(new Cake(11, "Jaffa Cake"));
        list.add(new Cake(12, "Victoria Sponge"));
        list.add(new Cake(13, "Fondants"));
        list.add(new Cake(14, "Hot Cross Bun"));
        list.add(new Cake(15, "Stem Ginger Cake"));
        list.add(new Cake(16, "Egg Custard Tart"));
    }

    public ArrayList<Cake> getList() {
        return new ArrayList<Cake>(list);
    }

}

