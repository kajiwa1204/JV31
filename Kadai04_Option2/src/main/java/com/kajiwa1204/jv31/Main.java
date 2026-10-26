package com.kajiwa1204.jv31;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] surveyResult = new int[5];
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("アンケート結果（1~5）: ");
            int res = SCANNER.nextInt();
            if (res == -1) break;
            surveyResult[res - 1]++;
            total++;
        }

        System.out.println("【集計結果】");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d･･･%d件%n", i + 1 , surveyResult[i]);
        }

        System.out.printf("Total･･･%d件%n", total);

        SCANNER.close();
    }
}