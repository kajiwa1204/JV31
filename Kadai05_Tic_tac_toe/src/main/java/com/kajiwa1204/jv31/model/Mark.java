package com.kajiwa1204.jv31.model;

public enum Mark {
    X("×"),
    O("◯"),
    EMPTY(null);

    private final String symbol;

    Mark(String symbol) {
        this.symbol = symbol;
    }

    public String symbol() {
        if (symbol == null) throw new UnsupportedOperationException("EMPTY has no symbol");
        return symbol;
    }

    public boolean isEmpty() {
        return this == EMPTY;
    }
}
