package com.kv.javaCourse.dataStructures.Interface;

import java.util.ArrayList;
import java.util.List;

//public class Player implements ISaveable {
public class Player {
    private String name;
    private String weapon;
    private  int hitPoints;
    private  int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;

        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

//    Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0, this.name);
        list.add(1, this.weapon);
        list.add(2, "" + this.hitPoints);
        list.add(3, "" + this.strength);
        return list;
    }

//    void read(List<String> readMe) {
//
//    }
}
