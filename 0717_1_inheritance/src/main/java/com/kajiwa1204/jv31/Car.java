package com.kajiwa1204.jv31;

public class Car {
    // 継承(Inheritance)
    // → クラスのメンバを引き継ぐ。

    private String maker;
    protected double gas;
    // protectedは･･･子 または 同一パッケージに公開。

    public void drive() {
        System.out.println("drive...");
    }

    public Car(String maker, double gas) {
        this.maker = maker;
        this.gas = gas;
    }
}
