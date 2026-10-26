package com.kajiwa1204.jv31;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("戦士", 100);
        Magician magician = new Magician("魔術師", 80);

        Character attacker = (new Random().nextBoolean()) ? warrior : magician;
        Character defender = attacker == warrior ? magician : warrior;

        while (true) {
            int damage = attacker.attack();
            defender.receiveDamage(damage);
            displayAttack(attacker, damage, defender);

            if (defender.health() == 0) break;

            Character temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.printf("%sの勝利! [残り HP:%d]%n", attacker.name(), attacker.health());
    }

    private static void displayAttack(Character attacker, int damage, Character defender) {
        System.out.printf("%sの攻撃!", attacker.name());
        pause();
        effect();
        System.out.printf("%dのダメージ! [%sの残り HP:%d]%n", damage, defender.name(), defender.health());
        System.out.flush();
        pause();
    }

    private static void effect() {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            System.out.flush();
            if (!pause()) return;
        }
    }

    private static boolean pause() {
        try {
            Thread.sleep((long) 500);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
