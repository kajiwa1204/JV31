package com.kajiwa1204.jv31;

public class Main {
    // ②メソッドの呼び出し元に、
    // 例外処理をゆだねる。それには、      ↓↓↓↓↓↓これが必要。
    public static void main(String[] args) throws Exception {
        // Javaの例外処理では、
        // 以下の２つの何れかとなる。
        // ①自分で例外処理を行う。
        // ②メソッドの呼び出し元に、
        // 例外処理をゆだねる。

        // ①自分で例外処理を行う。
        // try-catch構文を用いる。
        try {
            System.out.println(1);

            // 例外発生
            // ※基本的にこういったコードは書かない

            throw new Exception("メッセージ");

            // System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);

            // eにはエラー情報が保持されている。
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println(4);

        // ②メソッドの呼び出し元に、
        // 例外処理をゆだねる。

        // 例外発生
        // 基本的にこういったコードは書かない

        throw new Exception("メッセージ");
    }

}