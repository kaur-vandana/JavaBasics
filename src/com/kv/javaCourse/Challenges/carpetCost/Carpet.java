package com.kv.javaCourse.Challenges.carpetCost;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        if(this.cost<0)
            return 0;
        else
            return cost;
    }

}
