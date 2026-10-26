package com.kajiwa1204.jv31.ui;

import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.GameStatus;
import com.kajiwa1204.jv31.model.Mark;
import com.kajiwa1204.jv31.model.Position;

public class BoardRenderer {

    private static final String SEPARATOR = "ーーーーーーー";

    public void renderTitle() {
        System.out.println("【◯×ゲーム】");
    }

    public void renderBoard(Board board) {
        System.out.println(SEPARATOR);
        for (int row = 0; row < 3; row++) {
            StringBuilder sb = new StringBuilder("｜");
            for (int col = 0; col < 3; col++) {
                Position pos = Position.of(row * 3 + col + 1);
                Mark mark = board.cellAt(pos);
                sb.append(mark.isEmpty() ? pos.label() : mark.symbol());
                sb.append("｜");
            }
            System.out.println(sb);
            System.out.println(SEPARATOR);
        }
        System.out.println();
    }

    public void renderResult(GameStatus status) {
        String message = switch (status) {
            case X_WINS -> "Xの勝ち！";
            case O_WINS -> "Oの勝ち！";
            case DRAW   -> "引き分け！";
            default     -> throw new IllegalStateException("Game is still in progress.");
        };
        System.out.println(message);
    }
}
