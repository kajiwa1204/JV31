package com.kajiwa1204.jv31;

public class Sample {
    // static
    // 付与できるのは、フィールドとメソッドの２つ。
    // クラス依存の持ち物で、唯一無二となる。
    // static(静的)←→dynamic(動的)

    public int insta_f;
    public static int sta_f;

    public void insta_m() {
        this.insta_f = 30;
        this.insta_m2();

        this.sta_f = 40;
        this.sta_m();
    }

    public void insta_m2() { }

    public static void sta_m() { }

    public static void sta_m2() { }
}

