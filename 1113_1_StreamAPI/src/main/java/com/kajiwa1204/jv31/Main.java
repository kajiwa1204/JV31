package com.kajiwa1204.jv31;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Stream API
        // コレクションや配列のデータを
        // 関数型スタイルで
        // 簡潔に処理するための仕組み。
        // 保守性と可読性が上がる。
        // 端的に言うと、データ群に対する処理を、
        // スッキリ書けるよ！です。
        // 一般的にはStream APIを用い、
        // 速度が問題となった場合には、
        // 一般的な繰り返し構造との速度差を検証する。

        // Stream APIの基本
        // ①データ群から、Streamを生成する。
        //   Streamは"流れ"で、データ群に対して
        //   ベルトコンベアを付けるイメージ。
        //   これによって、順番にデータ群を
        //   処理することが可能となる。
        // ②中間処理を施す ※複数の処理可
        //   算術処理や、フィルタリング処理等々が行える。
        // ③終端処理を施す
        //   それらのデータ群を最後にどうするのか？を決める。
        //   例）出力する。合算する。等々。

        // データ群の作成
        int[] prices = {10, 20, 15, 30, 20};
        for (int price : prices) {
            System.out.println(price);
        }

        // ① Stream の生成
        IntStream is = Arrays.stream(prices);

        // ② 中間処理を施す　は無くてもOK

        // ③ 終端処理を施す
        is.forEach(System.out::println);

        // .forEachで、全てのデータに対する"処理"を指定できる。
        // この処理を受け取る引数は「関数型インターフェース」
        // （抽象メソッドが1つだけのインターフェースのため、
        //  ラムダ式や匿名クラスでも記述は可能）。

        // 終端処理を行った後に、さらなる
        // 終端処理は行えない。
        // is.forEach(System.out::println);

        // ①&③を纏めて書ける。(メソッドチェーン)
        Arrays.stream(prices)
                .forEach(System.out::println);
        // ストリームは1回限りの使い捨てなので、
        // この書き方がスタンダード。

        // その他のIntStreamの終端処理。
        System.out.println(Arrays.stream(prices)
                .count());

        System.out.println(Arrays.stream(prices)
                .sum());

        System.out.println(Arrays.stream(prices)
                .max());

        System.out.println(Arrays.stream(prices)
                .min());

        System.out.println(Arrays.stream(prices)
                .average());
        // max, min, averageはOptional!!!
        // 一般的には、orElseを付けた形をとる。
        System.out.println(Arrays.stream(prices)
                .average()
                .orElse(0));

        // プリミティブ型にはその他に、
        // LongSteam と DoubleStream が存在する。※割愛。


        // 参照型の｢配列｣のStream生成
        String[] emails = {"a", "b", "c"};

        // ジェネリクスで型指定する方式を取る。
        Stream<String> ss = Arrays.stream(emails);

        // 後は一緒
        ss.forEach(System.out::println);

        // 参照型の｢リスト｣のStream生成
        List<String> addresses = List.of("d", "e", "f");
        // add しなくても、List.ofで
        // サクッとリストが作成できる。

        // リストはそのものにstream()が実装されているので、それを使う。
        addresses.stream()
                .forEach(System.out::println);

        // 参照型の｢セット｣も同一のため割愛。※Map

        // ② 中間処理を施す
        List<Integer> scores = List.of(10, 20, 15, 30, 20);
        List<String> names = List.of("bb", "a", "ccc", "bac");

        // その1 〜絞り込み filter〜
        scores.stream()
                .filter(score -> score >= 15)
                .forEach(System.out::println);

        System.out.println("---");

        // その2 〜型変換 mapToX〜
        names.stream()
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        System.out.println("---");

        // その3 〜並び替え sorted〜
        // 昇順
        names.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("---");

        // 降順
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("---");

        // その4 〜先頭X件抽出 limit〜
        scores.stream()
                .limit(2)
                .forEach(System.out::println);
        // 10, 20

        System.out.println("---");

        // その5 〜X件飛ばし skip〜
        scores.stream()
                .skip(2)
                .forEach(System.out::println);
        // 15, 30, 20
        // .limit()と組み合わせでページャー等

        System.out.println("---");

        // その6 〜重複排除 distinct〜
        scores.stream()
                .distinct()
                .forEach(System.out::println);
        // 10, 20, 15, 30

        System.out.println("---");

        // その7 〜加工と型変換 map〜
        names.stream()
                .map(name -> name + "さん")
                .forEach(System.out::println);

        // Integer → String のストリームに変換。
        scores.stream()
                .map(score -> score + "点")
                .filter(score -> score.startsWith("2"))
                .forEach(System.out::println);

        System.out.println("---");

        // 中間処理は複数可能
        scores.stream()
                .distinct()
                .filter(score -> score >= 10)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
        // 10, 20, 15, 30

        System.out.println("----------");

        // ③ 終端処理(汎用)

        // その1 〜コレクション生成 toList〜
        List<Integer> newList = scores.stream()
                .toList();

        // その1 〜コレクション生成 toList〜
        Object[] newObjects = scores.stream()
                .toArray();
        // 引数無しは、 Object 配列

        // コンストラクタを渡し、型指定する、
        Integer[] newArray = scores.stream()
                .toArray(Integer[]::new);

        // その3 〜マッチング anyMatch, allMatch, noneMatch〜
        // true/falseが返ってくる。

        // anyMatch...いずれかがマッチ→true
        System.out.println(scores.stream()
                .anyMatch(s -> s == 20));

        System.out.println(scores.stream()
                .anyMatch(s -> s == 40));

        // allMatch...全てがマッチ→true
        System.out.println(scores.stream()
                .allMatch(s -> 10 <= s));

        System.out.println(scores.stream()
                .allMatch(s -> 10 < s));

        // noneMatch...全てがマッチしない→true
        System.out.println(scores.stream()
                .noneMatch(s -> s < 10));

        System.out.println(scores.stream()
                .noneMatch(s -> s <= 10));

        // その4 〜最初の1つを取得 findFirst〜
        System.out.println(names.stream()
                .filter(name -> name.startsWith("b"))
                .findFirst()
                .orElse("Not found"));

        // その5 〜任意式による集約 reduce〜

        // やりたいことはこれ。
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);  // 95

        // 既存の知識では、以下で実現可能。
        System.out.println(scores.stream()
                .mapToInt(s -> s)
                .sum());

        // これを reduce で書くと。
        System.out.println(scores.stream()
                .reduce(0, (sum2, score) -> sum2 + score));
        // 第1引数はsumの初期値。

        // 全部10倍にして合算とか。
        System.out.println(scores.stream()
                .reduce(0, (sum2, score) -> sum2 + score * 10));

        // 他にも、階乗(factorial)で、すべて掛けるとか。
        List<Integer> data = List.of(1, 2, 3, 4, 5);
        System.out.println(data.stream()
                .reduce(1, (fact, v) -> fact * v));

        // MapによるStreamの紹介
        // そのままでは呼べないので、
        // keySet(), values(), entrySet()を経由して
        // ストリームに変換する。
        Map<String, Integer> ages = Map.of("a", 21, "b", 22, "c", 23);

        // キー（Key）だけをストリームに流す場合
        ages.keySet()
                .stream()
                .forEach(System.out::println);

        // 値（Value）だけをストリームに流す場合
        ages.values()
                .stream()
                .forEach(System.out::println);

        // キーと値をセット(エントリー)で処理したい場合。
        ages.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%s さん: %d歳%n", entry.getKey(), entry.getValue()));

        // 最後に
        // Stream APIによる関数型スタイルは、
        // Javaだけでなく、Scala、Kotlin、Rust、F#などでも
        // 採用されています。
        // バグが起きにくく、並行処理（マルチコアCPUでの同時処理）に強く、
        // コードが圧倒的に読みやすくなる といったメリットがあるので、是非ものにしましょう！
    }
}