package com.kajiwa1204.jv31;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

        System.out.println("ex1");
        System.out.println("hello");

        System.out.println("ex2");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("ex3");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("ex4");
        System.out.print("名前を入力: ");
        String name = scanner.nextLine();
        System.out.printf("hello %s%n", name);

        System.out.println("ex5");
        int point = num(scanner, 0, 100, "数字を入力: ");
        if (point >= 90) {
            System.out.println("評価: A");
        } else if (point >= 70) {
            System.out.println("評価: B");
        } else if (point >= 50) {
            System.out.println("評価: C");
        } else if (point >= 30) {
            System.out.println("評価: D");
        } else {
            System.out.println("評価: E");
        }

        System.out.println("ex6");
        int num = num(scanner, 0, 4, "0~4の数値を入力: ");
        String fruit = switch (num) {
            case 0 -> "オレンジ";
            case 1 -> "アップル";
            case 2 -> "グレープ";
            case 3 -> "ストロベリー";
            case 4 -> "レモン";
            default -> "無し";
        };
        System.out.println(fruit);

        System.out.println("ex7");
        int radius = num(scanner, "半径を入力: ");
        System.out.printf("面積は %d です。%n", (int) (radius * radius * Math.PI));

        System.out.println("op1");
        int answer = random.nextInt(10);
        int count = 0;
        int input;
        do {
            count++;
            input = num(scanner, "0~9の数値を入力: ");
        } while (answer != input);

        System.out.println("正解！");
        System.out.printf("試行回数: %d回！%n", count);

        System.out.println("op2");

        int total = 0;
        while (true) {
            System.out.println("単価と数量を入力。終了するには-1を入力。");
            int price = num(scanner, -1, Integer.MAX_VALUE, "単価: ");
            if (price == -1) break;
            int amount = num(scanner, -1, Integer.MAX_VALUE, "数量: ");

            total += price * amount;
        }
        System.out.printf("合計金額: %d%n", total);
        System.out.printf("税込金額: %d%n", (int) (total * 1.1));

        scanner.close();
    }

    private static int num(Scanner scanner, int min, int max, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String input = scanner.nextLine();
                int num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.out.printf("%d~%dの数値を入力してください。\nもう一度入力してください。", min, max);
                    continue;
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.print("数字以外です。もう一度入力: ");
            }
        }
    }

    private static int num(Scanner scanner, String prompt) {
        return num(scanner, Integer.MIN_VALUE, Integer.MAX_VALUE, prompt);
    }
}