package com.kajiwa1204.jv31;


public class Magician extends Character {

    public Magician(String name, int health) {
        super(name, health);
    }

    @Override
    public int attack() {
        int variance = random.nextInt(11);
        if (random.nextInt(10) < 3) {
            variance = -variance;
        }
        return 20 + variance;
    }
}
