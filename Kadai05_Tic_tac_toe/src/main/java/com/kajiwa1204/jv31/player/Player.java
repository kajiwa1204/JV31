package com.kajiwa1204.jv31.player;

import com.kajiwa1204.jv31.model.Board;
import com.kajiwa1204.jv31.model.Mark;
import com.kajiwa1204.jv31.model.Position;

public interface Player {

    Mark mark();

    Position choosePosition(Board board);
}
