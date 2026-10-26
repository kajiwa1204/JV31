package com.kajiwa1204.jv31;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        // step4
        int[] sheets = new int[50];

        // step7

        while (true) {


            // step1
            System.out.print("開始座席番号を入力してください: ");

            // step2
            int start = SCANNER.nextInt();

            if (start == -1) break;

            System.out.println(start);

            // step3
            System.out.print("終了座席番号を入力してください: ");
            int end = SCANNER.nextInt();
            System.out.println(end);

            // step5
            for (int i = start; i <= end; i++) {
                sheets[i] = 1;
            }

            // step6
//            for (int i = 0; i < sheets.length; i++) System.out.print(sheets[i] + ((i + 1) % 10 == 0 ? "\n" : ""));
            for (int i = 0; i < sheets.length; i++) {
                System.out.print(sheets[i]);
                if ((i + 1) % 10 == 0) System.out.println();
            }
        }
        SCANNER.close();
    }
}