package com.kajiwa1204.jv31;

public class Main {
    public static void main(String[] args) {
        int[][] dArray;
        dArray = new int[2][3];

        System.out.print(dArray[0][0]);
        System.out.print(dArray[0][1]);
        System.out.print(dArray[0][2]);
        System.out.print(dArray[1][0]);
        System.out.print(dArray[1][1]);
        System.out.print(dArray[1][2]);
        System.out.println();

        // 1行Ver
        int[][] dArray2 = new int[2][3];

        // 初期値あり Ver
        int[][] dArray3 = {{1, 2, 3}, {4, 5, 6}};

        // forで出力
        for (int i = 0; i < dArray2.length; i++) {
            for (int j = 0; j < dArray2[i].length; j++) {
                System.out.print(dArray2[i][j]);
            }
            System.out.println();
        }

        // 拡張forで出力
        for (int[] array : dArray3) {
            for (int v : array) {
                System.out.print(v);
            }
            System.out.println();
        }
    }
}