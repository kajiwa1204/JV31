package com.kajiwa1204.jv31.model;

public enum GameStatus {
    IN_PROGRESS,
    X_WINS,
    O_WINS,
    DRAW;

    public boolean isOver() {
        return this != IN_PROGRESS;
    }
}
