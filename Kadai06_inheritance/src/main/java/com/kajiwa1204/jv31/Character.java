package com.kajiwa1204.jv31;

import java.util.Random;

public abstract class Character {
    final static Random random = new Random();

    private final String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract int attack();

    public void receiveDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public String name() {
        return name;
    }

    public int health() {
        return health;
    }
}
