package com.kajiwa1204.jv31;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // option1
        int[] points = new int[5];

        System.out.println("スコア集計アプリ");

        for (int i = 0; i < points.length; i++) {
            System.out.printf("%d人目: ", i + 1);
            points[i] = SCANNER.nextInt();
        }

        System.out.print("入力値一覧･･･");
        for (int i = 0; i < points.length; i++) {
            if (i != 0) System.out.print(", ");
            System.out.printf("%d", points[i]);
        }
        System.out.println();

        System.out.printf("最高得点･･･%d%n", max(points));
        System.out.printf("最低得点･･･%d%n", min(points));
        System.out.printf("平均得点･･･%d%n", ave(points));

        SCANNER.close();
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    private static int ave(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }
}