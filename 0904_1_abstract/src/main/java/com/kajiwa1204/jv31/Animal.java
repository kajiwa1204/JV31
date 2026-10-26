package com.kajiwa1204.jv31;

// abstract...抽象
// abstractメソッド...
//   抽象的なメソッドで、
//   サブクラスでのオーバーライドを
//   強要する。
//   ここで処理は書かない。
public abstract class Animal {
    public abstract void naku();
    // public abstract void eat();

    // 通常のメンバの実装OK
    // ※これが、後に学ぶインターフェースとの差異。
    protected String name;
    public void name(String name) {
        this.name = name;
    }
    public String name() {
        return this.name;
    }

    // テンプレートパターン(デザインパターン)
    // 多くの処理が一緒で、一部異なる場合に便利。
    public void eat() {
        System.out.println("座る。");
        System.out.println("いただきます。");
        // 一部処理を抽象メソッドに委ねる。
        this.eatImple();
        System.out.println("ごちそうさまでした。");

    }
    protected abstract void eatImple();
}
