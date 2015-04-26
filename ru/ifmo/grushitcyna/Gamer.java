package ru.ifmo.grushitcyna;

public abstract class Gamer {

    private final String name;
    protected final NoughtsCrosses symbol;

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
