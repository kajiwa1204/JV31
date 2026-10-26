 package com.kajiwa1204.jv31;

public class Main {
    public static void main(String[] args) {
        // インスタンス化
        User user = new User();
        user.method();

        User user2;
        // この状態でのuser2はnull

        // 以下フィールドアクセス(やらないけど)
        user.id = 10;
        user.name = "b";

        user.c(10, 20, 30);
        user.c(100);
    }
}