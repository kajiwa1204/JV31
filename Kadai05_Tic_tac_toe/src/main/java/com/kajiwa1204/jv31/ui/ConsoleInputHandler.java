package com.kajiwa1204.jv31.ui;

import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.Position;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleInputHandler {

    private static final Pattern DIGITS = Pattern.compile("\\d+");

    private final Scanner scanner;

    public ConsoleInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Position readPosition(String prompt, Board board) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!DIGITS.matcher(input).matches()) {
                System.out.println("数字を入力してください。");
                continue;
            }

            int n = Integer.parseInt(input);
            if (n < 1 || n > 9) {
                System.out.println("1〜9の数値を入力してください。");
                continue;
            }

            Position pos = Position.of(n);
            if (!board.isEmpty(pos)) {
                System.out.println("そのマスはすでに使われています。もう一度入力してください。");
                continue;
            }

            return pos;
        }
    }
}
