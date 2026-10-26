package com.kajiwa1204.jv31;

public class Main {
    static void main() {
        // Javaの基本的な(プリミティブ)な型は8つ!
        byte b = 0;         // 整数1byte
        short s = 0;        // 整数2byte
        int i = 0;          // 整数4byte
        long l = 0;         // 整数8byte
        float f = 0.0F;     // 浮動小数4byte
        double d = 0.0D;    // 浮動小数8byte
        char c = 'a';       // 1文字
        boolean bo = true;  // 真偽
        // Point! プリミティブ型は全て小文字!
        // 基本的に、大きな器に小さいデータは入る。
        // 逆は無理。
        s = b;
        d = i;

        // i = d;

        // 明示的に型変換
        // を行えば、逆も可能になる。
        // ただし、消失覚悟で。
        // [書式]
        // (変換後の型) 変換前のデータ
        i = (int) d;
        i = (int) 1.9;

        // 型の違う物同士の計算は、
        // 大きい方に寄る。
        System.out.println(2 * 3.4);

        // やってみよう!1
        System.out.println(2 * (int) 3.4);
        // 期待値･･･6

        // やってみよう!2
        System.out.println((int) (2 * 3.4 * 1.2 * 4 * 5.2 * 6.9));
        // 期待値･･･1171

        // String型から、プリミティブ型には
        // キャストできない
        String age = "21";
        // int a = (int) age;
        // String型からプリミティブ型への変換には、
        // 専用のメソッドを使う。
        int a = Integer.parseInt(age);

        // プリミティブ型には、それに対応した
        // 参照型が用意されている。これは特に、
        // ラッパークラスと呼ばれる。

        Byte by = 0;
        Short sh = 0;
        Integer in = 0;
        Long lo = 0L;
        Float fl = 0.0F;
        Double dou = 0.0;
        Character ch = 'a';
        Boolean boo = false;
        IO.println("aaa");

        String st = "a";

    }
}
