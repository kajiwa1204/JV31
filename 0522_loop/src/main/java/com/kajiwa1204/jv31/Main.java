package com.kajiwa1204.jv31;

public class Main {
    public static void main(String[] args) {
        // while
        int i;
        i = 0; // ①
        while (i < 3) { // ②
            System.out.println(i);
            i++; // ③
        }

        // for
        // for (①; ②; ③) {}
        for (i = 0; i < 3; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(j * 10);
        }
        // System.out.println(j * 10)
        // ↑ ここでjは参照できない。

        // 後判定 do-while
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3); // 要セミコロン

        // 多重ループをラベル+breakで抜ける！
        outer: // ラベル
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print((i * j) + "\t");
                if (i == 5) {
                    break outer;
                }
            }
            System.out.println(); // 改行のみ
        }
    }
}