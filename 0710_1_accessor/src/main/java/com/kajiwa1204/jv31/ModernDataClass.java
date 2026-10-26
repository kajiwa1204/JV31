package com.kajiwa1204.jv31;

public class ModernDataClass {
    private int id;

    // モダンな書き方として、
    // オーバーロードを活用した
    // アクセッサがある。

    public void id(int id) {
        this.id = id;
    }

    public int id() {
        return this.id;
    }
}
