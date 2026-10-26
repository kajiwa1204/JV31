package com.kajiwa1204.jv31.player;

import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.Mark;
import com.kajiwa1204.jv31.model.Position;
import com.kajiwa1204.jv31.ui.ConsoleInputHandler;

public class HumanPlayer implements Player {

    private final Mark mark;
    private final ConsoleInputHandler inputHandler;

    public HumanPlayer(Mark mark, ConsoleInputHandler inputHandler) {
        this.mark = mark;
        this.inputHandler = inputHandler;
    }

    @Override
    public Mark mark() {
        return mark;
    }


    @Override
    public Position choosePosition(Board board) {
        return inputHandler.readPosition(mark.symbol() + ": ", board);
    }
}
