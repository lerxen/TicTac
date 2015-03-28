package ru.ifmo.grushitcyna;

import ru.ifmo.grushitcyna.Board;

public abstract class Gamer {

    String name;
    NoughtsCrosses symbol;

    public Gamer(String name, NoughtsCrosses symbol) {

        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {

        return name;
    }

    public NoughtsCrosses getSymbol() {

        return symbol;
    }

    public abstract void move(Board board);
}
