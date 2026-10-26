package com.kajiwa1204.jv31;

public class Main {
    public static void main(String[] args) {
        // 比較演算子
        System.out.println(0 == 0);
        System.out.println(0 != 0);
        System.out.println(0 < 0);
        System.out.println(0 <= 0);
        System.out.println(0 > 0);
        System.out.println(0 >= 0);

        // 数値と、文字数字の比較はできない
        //System.out.println(0 == "0");

        System.out.println(true);   // and
        System.out.println(true);   // or
        System.out.println(false);          // not

        // if
        if (true) {
            System.out.println(1);
        }

        if (false) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(3);
        }

        // 三項演算子
        int b = 0;
        String c = b == 0 ? "zero" : "other";

        // if (a == 0) {
        // 	b = "zero";
        // } else {
        // 	b = "other";
        // }

        // スクリプト言語の様に、
        // 真偽型以外は受けつけてくれない。
        // if (1) {}

        // 多分岐 ※一致比較
        int type = 0;

        switch (type) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
        }

    }
}