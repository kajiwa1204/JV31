package com.kajiwa1204.jv31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // import無しで、フル指定での利用も可能
        // java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("金額: ");

        // 入力
        String price = scanner.nextLine();
        System.out.println(price);
    }
}