package com.kajiwa1204.jv31.exception;

import com.kajiwa1204.jv31.model.Position;

public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException(Position position) {
        super("Position " + position.value() + " is already occupied.");
    }
}
