package ru.ifmo.grushitcyna;

import ru.ifmo.grushitcyna.*;

public class Main {
    public static void main(String[] args) {


        Board board1 = new Board(19);

        GameInterface app = new GameInterface(board1);
        app.setVisible(true);

        Gamer comp = new Computer("1", NoughtsCrosses.X);
        Gamer man = new Man("2", NoughtsCrosses.O);

        while (!board1.winner()) {
            comp.move(board1);
            System.out.println("после хода компьютера: ");
            board1.showTable();
            app.boardUpdated();
            System.out.println();
            man.move(board1);
            System.out.println("после вашего хода: ");
            board1.showTable();
            System.out.println();
            app.boardUpdated();


        }
    }
}