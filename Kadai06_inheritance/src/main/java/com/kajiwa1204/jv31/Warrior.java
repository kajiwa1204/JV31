package com.kajiwa1204.jv31;

public class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public int attack() {
        return random.nextInt(10) == 0 ? 50 : 10;
    }
}
