package com.kajiwa1204.jv31;

public class Main {
    public static void main(String[] args) {
        Animal animal;

        animal = new Cat();

        animal.eat();

        animal = new Dog();

        animal.eat();

        // 抽象クラスはインスタンス化できない。
        // Animal animal = new Animal();
        // animal.naku(); <-できちゃったらこれが困る。
        animal.name("aaa");
        System.out.println(animal.name());
    }
}
