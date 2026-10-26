package com.kajiwa1204.jv31;

public class MyClass {
    // オーバーロード
    // 同一のメソッド名で、
    // 複数のメソッドが作成可能。
    // ただし、引数にて差異を持たせること。
    void a() {
        System.out.println(1);
    }

    // 同一メソッド名は、基本NG
    // void a() {
    // 	System.out.println(1);
    // }

    void a(int i) {
        System.out.println(2);
    }

    void a(String s) {
        System.out.println(3);
    }

    void a(int i, int j) {
        System.out.println(4);
    }
}
