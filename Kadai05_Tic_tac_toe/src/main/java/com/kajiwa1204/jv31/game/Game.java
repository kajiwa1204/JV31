package com.kajiwa1204.jv31.game;

import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.GameStatus;
import com.kajiwa1204.jv31.model.Mark;
import com.kajiwa1204.jv31.model.Position;
import com.kajiwa1204.jv31.player.Player;
import com.kajiwa1204.jv31.ui.BoardRenderer;

import java.util.List;

public class Game {

    private final Board board;
    private final List<Player> players;
    private final WinConditionChecker winChecker;
    private final BoardRenderer renderer;

    private int turnIndex = 0;

    public Game(Board board, List<Player> players, WinConditionChecker winChecker, BoardRenderer renderer) {
        if (players.size() < 2) {
            throw new IllegalArgumentException("At least 2 players are required.");
        }
        this.board = board;
        this.players = players;
        this.winChecker = winChecker;
        this.renderer = renderer;
    }

    public void start() {
        renderer.renderTitle();
        renderer.renderBoard(board);

        GameStatus status;
        do {
            status = playTurn();
        } while (!status.isOver());

        renderer.renderResult(status);
    }

    private GameStatus playTurn() {
        Player current = currentPlayer();
        Position pos = current.choosePosition(board);
        board.place(pos, current.mark());
        renderer.renderBoard(board);

        GameStatus status = evaluate(current.mark());
        turnIndex++;
        return status;
    }

    private GameStatus evaluate(Mark lastMark) {
        if (winChecker.hasWon(board, lastMark)) {
            return lastMark == Mark.X ? GameStatus.X_WINS : GameStatus.O_WINS;
        }
        return board.isFull() ? GameStatus.DRAW : GameStatus.IN_PROGRESS;
    }

    private Player currentPlayer() {
        return players.get(turnIndex % players.size());
    }
}
