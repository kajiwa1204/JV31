package com.kajiwa1204.jv31;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("t", 10.0);
        car.drive();

        Taxi taxi = new Taxi("t", 10.0);
        taxi.drive();
        taxi.startMeter();

        // 子クラスのインスタンスは
        // 親クラスの枠で保持できる
        Car car2 = new Taxi(null, 10.0);
        car2.drive();

        // 基本的に、側がCarなので
        // taxiのメソッドは呼べない
        // car2.startMeter();

        // キャストを使えば呼べる
        ((Taxi) car2).startMeter();

        // 子←親は無理
        // Taxi taxi2 = new Car(null, 10.0);

        // 最も大きな器(全てのクラスの源流)
        // → Object
        Object o1 = 0;
        Object o2 = 1.5;
        Object o3 = "a";
        Object o4 = new Car(null, 0.0);
        Object o5 = new Taxi(null, 0.0);
    }
}