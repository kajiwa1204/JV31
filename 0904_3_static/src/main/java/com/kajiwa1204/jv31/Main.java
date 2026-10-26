package com.kajiwa1204.jv31;

public class Main {

    public static void main(String[] args) {
        // スタティックメンバを利用するには、
        // インスタンスが不要！
        // [書式]
        // クラス名.メンバ
        Sample.sta_f = 10;
        Sample.sta_m();

        // インスタンスメンバの呼び出しは、
        // インスタンス有りき。
        Sample sample = new Sample();
        sample.insta_f = 20;
        sample.insta_m();

        // 以下、行けるけど警告。
        sample.sta_f = 30;
        sample.sta_m();
    }

}
