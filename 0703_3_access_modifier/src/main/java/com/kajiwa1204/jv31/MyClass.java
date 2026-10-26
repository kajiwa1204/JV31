package com.kajiwa1204.jv31;

public class MyClass {
    // アクセス修飾子
    // クラス、フィールド、メソッドの３種に
    // 設定が可能。
    // private…非公開
    // public…公開
    // protected…同一パッケージ内で公開
    //        かつ、子クラスに公開
    // なし(省略)…同一パッケージ内で公開

    public int b; // 基本フィールドはprivate
    protected int c;
    int d;
    private int a;

    public void e() {
        this.a = 1;
    }
    // 後は一緒なので割愛。

    // 原則フィールドはprivate
    // メソッドも極力private

}
