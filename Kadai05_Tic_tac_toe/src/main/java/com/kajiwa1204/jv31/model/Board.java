package com.kajiwa1204.jv31.model;

import com.kajiwa1204.jv31.exception.InvalidMoveException;

public class Board {

    private static final int ROWS = 3;
    private static final int COLS = 3;

    private final Mark[][] cells;

    public Board() {
        cells = new Mark[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                cells[r][c] = Mark.EMPTY;
            }
        }
    }

    public void place(Position position, Mark mark) {
        if (!cells[position.row()][position.col()].isEmpty()) {
            throw new InvalidMoveException(position);
        }
        cells[position.row()][position.col()] = mark;
    }

    public Mark cellAt(Position position) {
        return cells[position.row()][position.col()];
    }

    public boolean isEmpty(Position position) {
        return cells[position.row()][position.col()].isEmpty();
    }

    public boolean isFull() {
        for (Mark[] row : cells) {
            for (Mark cell : row) {
                if (cell.isEmpty()) return false;
            }
        }
        return true;
    }

    /** 内部状態の防御的コピーを返す。 */
    public Mark[][] snapshot() {
        Mark[][] copy = new Mark[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            copy[r] = cells[r].clone();
        }
        return copy;
    }
}
