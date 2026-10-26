package com.kajiwa1204.jv31;

public class Taxi extends Car {
    // [継承書式]
    // extends 親クラス
    // で、親クラスの性質を引き継げる。
    // ※extends…拡張

    // 継承先では、差分のみ開発する。
    private double meter;

    public void startMeter() {
        System.out.println("start meter...");
        this.meter = 0.0;

        // 子であれprotectedは見える。
        System.out.println(this.gas);

        // 親クラス･･･親クラス
        // 子クラス･･･サブクラス
        // this.じゃなくてsuper.でもアクセス可
        System.out.print(super.gas);
    }

    // オーバーライド
    // 親クラスの処理を書き換える。
    // → 同一メソッドを定義すればok
    // @(アノテーション)による
    // オーバーライドを用いること。
    // アノテーション(注釈)
    // → プリコンパイラ(コンパイル前の処理)にて、
    // 色々な機能を実現する。
    @Override
    public void drive() {
        System.out.println("drive!!!");

        // 厳密には上書きではなく
        // 処理の奪いの動作
        super.drive();
    }

    public Taxi(String maker, double gas) {
        // 親のコンストラクタを呼び出し
        super(maker, gas);
    }
}
