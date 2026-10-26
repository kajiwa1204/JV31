package com.kajiwa1204.jv31;

import com.kajiwa1204.jv31.game.Game;
import com.kajiwa1204.jv31.game.WinConditionChecker;
import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.Mark;
import com.kajiwa1204.jv31.player.HumanPlayer;
import com.kajiwa1204.jv31.player.Player;
import com.kajiwa1204.jv31.ui.BoardRenderer;
import com.kajiwa1204.jv31.ui.ConsoleInputHandler;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleInputHandler inputHandler = new ConsoleInputHandler(scanner);
        BoardRenderer renderer = new BoardRenderer();

        List<Player> players = List.of(
            new HumanPlayer(Mark.X, inputHandler),
            new HumanPlayer(Mark.O, inputHandler)
        );

        new Game(new Board(), players, new WinConditionChecker(), renderer).start();
    }
}
