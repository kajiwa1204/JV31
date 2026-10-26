package com.kajiwa1204.jv31;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static int[][] BOARD = new int[3][3];
    private static int turnCount = 0;


    public static void main(String[] args) {
        System.out.println("""
                【◯×ゲーム】
                ーーーーーーー
                ｜１｜２｜３｜
                ーーーーーーー
                ｜４｜５｜６｜
                ーーーーーーー
                ｜７｜８｜９｜
                ーーーーーーー
                """);

        while (turnCount < 9) {
            int currentPlayer = turnCount % 2 + 1;

            System.out.printf("Player%d: ", currentPlayer);
            int player1 = SCANNER.nextInt() - 1;
            BOARD[player1 / 3][player1 % 3] = currentPlayer;

            System.out.printf("""
                    ーーーーーーー
                    ｜%d｜%d｜%d｜
                    ーーーーーーー
                    ｜%d｜%d｜%d｜
                    ーーーーーーー
                    ｜%d｜%d｜%d｜
                    ーーーーーーー
                    """, Arrays.stream(BOARD).flatMapToInt(Arrays::stream).boxed().toArray());

            turnCount++;

            if (hasWon(currentPlayer)) {
                System.out.printf("Player%dの勝ち！%n", currentPlayer);
                return;
            }
        }

        System.out.println("引き分け！");
    }

    private static boolean hasWon(int player) {
        boolean rowOrColumn = IntStream.range(0, 3).anyMatch(i ->
                IntStream.range(0, 3).allMatch(j -> BOARD[i][j] == player)
                        || IntStream.range(0, 3).allMatch(j -> BOARD[j][i] == player));

        return rowOrColumn
                || IntStream.range(0, 3).allMatch(i -> BOARD[i][i] == player)
                || IntStream.range(0, 3).allMatch(i -> BOARD[i][2 - i] == player);
    }
}
