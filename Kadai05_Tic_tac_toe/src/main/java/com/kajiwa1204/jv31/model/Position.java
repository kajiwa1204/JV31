package com.kajiwa1204.jv31.model;


/**
 * 盤面上の位置を表す値オブジェクト (1〜9, 左上から右下)。
 * イミュータブルであり、等価性は値で判断する。
 */
public final class Position {

    private static final String[] FULL_WIDTH_LABELS =
        {"１", "２", "３", "４", "５", "６", "７", "８", "９"};

    private static final int MIN = 1;
    private static final int MAX = 9;

    private final int value;

    private Position(int value) {
        this.value = value;
    }

    public static Position of(int value) {
        if (value < MIN || value > MAX) {
            throw new IllegalArgumentException(
                MIN + "〜" + MAX + "の数値を入力してください。(入力値: " + value + ")");
        }
        return new Position(value);
    }

    /** 2D 配列の行インデックス (0-based)。 */
    public int row() {
        return (value - 1) / 3;
    }

    /** 2D 配列の列インデックス (0-based)。 */
    public int col() {
        return (value - 1) % 3;
    }

    /** 盤面表示用の全角数字ラベルを返す。 */
    public String label() {
        return FULL_WIDTH_LABELS[value - 1];
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return "Position(" + value + ")";
    }
}
