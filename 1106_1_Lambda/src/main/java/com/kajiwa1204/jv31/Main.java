package com.kajiwa1204.jv31;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MyInterface m = new Sample();
        m.myMethod();

        // 匿名(無名)クラス(Anonymous class)
        // わざわざクラスファイルを
        // 作らずに、インタフェースの
        // 実装ができる。
        MyInterface mi = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("mm");
            }
        };

        mi.myMethod();

        // ラムダ式
        // 匿名クラスの簡素化した記述方法。
        // ただし、関数型インタフェースで
        // あることが必須。
        // [書式]
        // (引数定義) -> {実処理};
        MyInterface mil = () -> {
            System.out.println("lambda");
        };
        mil.myMethod();
        // java.util.functionに基本的な関数型インタフェースが定義されている。
        // ※以下で出現するT, Rは、任意の参照型。
        // Consumer<T> … void accept(T t) → 引数Tを受け取り、戻り値は返さない。
        // Supplier<T> … T get() → 引数は無しで、戻り値Tを返す。
        // Predicate<T> … boolean test(T t) → 引数Tを受け取り、booleanを返す。
        // Function<T, R> … R apply(T t) → 引数Tを受け取り、戻り値Rを返す。
        // Operator<T> … T apply(T t) → 引数Tを受け取り、戻り値Tを返す。
        // その他命名規則として、
        //  Unary～ … ユーナリー。引数を１つ受け取る。
        //  Bi～, Binary～ … バイナリー。引数を２つ受け取る。 ※おまけ。3つはターナリー。
        //  Boolean～,Double～等 … その型が引数や、戻り値の型となる。
        // ①To②～ … ①が引数の型、②が戻り値の型。
        // java.util.function. で試してみよう！

        // 引数あり & 戻り値なし
        java.util.function.Consumer<Integer> c = (Integer v) -> {
            System.out.println(v);
        };

        c.accept(10);

        // 引数なし & 戻り値あり
        Supplier<String> s = () -> {
            return "hello";
        };
        System.out.println(s.get());

        // 引数、戻り値、共にあり。
        Function<Integer, String> f = (Integer v) -> {
            return "¥" + v;
        };
        System.out.println(f.apply(100));

        // 引数、戻り値、共にあり。
        Function<Integer, String> f2 = (v) -> {
            return "¥" + v;
        };
        System.out.println(f2.apply(100));

        // もっと省略
        //  ・１行なら{}不要
        //  ・１行ならreturn不要
        //  ・引数１つだけなら()不要
        Function<Integer, String> f3 = v -> "¥" + v;
        System.out.println(f3.apply(100));
    }
}