package com.kajiwa1204.jv31;

public class User {
    private int id;
    private String name;

    // 命名規則
    // get + フィールド名
    // set + フィールド名
    // ※キャメルケース

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

