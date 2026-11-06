package com.kajiwa1204.jv31;

//関数型インタフェース
// 抽象メソッドを１つだけもつ
// インタフェースのこと。
// クラスアノテーションとして、
// @FunctionalInterface
// がある。
@FunctionalInterface
public interface MyInterface {
    void myMethod();
}
