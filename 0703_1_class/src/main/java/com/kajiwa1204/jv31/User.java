package com.kajiwa1204.jv31;

public class User {
    // クラス名=ファイル名
    // 1ファイル1クラスが基本

    // クラス直下に書けるのは、次の2つ
    // ･ フィールド(アトリビュート)
    // ･ メソッド

    int id;
    String name;

    // メソッドの宣言
    // [書式]
    // 戻り値の型 メソッド名([引数リスト]) {}
    void method() {
        // void ... 無し。の意。
        System.out.println(1);
    }


    // 引数
    // 各々型が必須！
    void a(int a) {}
    void b(int a, boolean b) {}

    // 可変長引数は... で、配列に置き換わる
    void c(int... c) {
        for (int v: c) {
            System.out.println(v);
        }
    }

    void d() {
        return;
    }

    int e() {
        return 0;
    }

    boolean f() {
        return true;
    }

    String g() {
        return "abc";
    }

    String h() {
        return null;
    }

    void i() {
        // メソッド内で宣言された変数は
        // ローカル変数。
        // このメソッド内でのみ有効。
        int j = 0;
    }

    void j() {
        // pythonのselfは、this
        this.id = 123;
        this.a(id);
        this.b(id, false);
    }
}
