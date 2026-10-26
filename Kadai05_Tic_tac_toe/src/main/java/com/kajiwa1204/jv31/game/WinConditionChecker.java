package com.kajiwa1204.jv31.game;

import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.Mark;

public class WinConditionChecker {
    public boolean hasWon(Board board, Mark mark) {
        Mark[][] cells = board.snapshot();
        int n = cells.length;

        for (int i = 0; i < n; i++) {
            // i 行目（横） / i 列目（縦）
            if (isLine(cells, mark, n, i, 0, 0, 1) || isLine(cells, mark, n, 0, i, 1, 0)) {
                return true;
            }
        }

        // 左上→右下 / 右上→左下
        return isLine(cells, mark, n, 0, 0, 1, 1) || isLine(cells, mark, n, 0, n - 1, 1, -1);
    }

    private boolean isLine(Mark[][] cells, Mark mark, int n, int row, int col, int dRow, int dCol) {
        for (int step = 0; step < n; step++) {
            if (cells[row + dRow * step][col + dCol * step] != mark) {
                return false;
            }
        }
        return true;
    }
}
