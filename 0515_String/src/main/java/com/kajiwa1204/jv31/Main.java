package com.kajiwa1204.jv31;

import java.util.Objects;

public class Main {

    static void main() {
        
        // 文字列連結
        System.out.println("a" + "b");
        // 文字列に対して`+`があると、
        // その他が文字列に変換される。
        System.out.println("a" + 1);
        System.out.println("1" + 1);
        System.out.println(2 + "1");
        System.out.println(2.5 + "1");
        System.out.println(true + "1");

        // 重要注意事項！
        // Javaにて、文字列比較｢==｣はNG！！
        // 文字列比較は、Stringクラスの.equalsメソッドを使う。
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
        // → 一見良さそう。。。

        System.out.println(s1 == "abc");
        // → 一見良さそう。。。

        String s3 = "ab";
        s3 += "c";
        System.out.println(s1 == s3);
        // →  ==はだめ

        System.out.println(s1.equals(s3));
        // → OK
        System.out.println(s1.equals(s2));

        // 現時点でのモダンな書き方
        System.out.println(Objects.equals(s1, s3));

        // nullについてのトーク

        s1.equals(null);
        String b = null;
//		 b.equals("");
        System.out.println("aaa");
        System.out.println(Objects.equals(null, null));
        "".equals(null);

        // 参照型の変数は、
        // その変数自体に実態を持っていない。
        // 実態は別で存在し、
        // 変数にはその実態の先頭アドレスが
        // 格納されている
        int i = 0;
        String a = "abc";

        // 文字列連結はメモリが逼迫するので注意。
//		for (i = 0; i < 1000000; i++) {
//			a += "b";
//		}

        // 大量の文字列連結には、それ用のクラスがある。
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < 1000000000; i++) {
            sb.append("b");
        }
    }
}
