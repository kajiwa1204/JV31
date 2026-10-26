package com.kajiwa1204.jv31;

public class Main {

    public static void main(String[] args) {
        Android android = new Android();
        android.play();
        // 実装しているインターフェースの型で、
        // インスタンスを保持できる。
        //   → 保守性の向上
        Player player = new Android();
        player.play();

        // キャストで個クラスのメソッドを呼べる。
        ((Android) player).patternAuth();
    }

}   