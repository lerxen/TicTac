package ru.ifmo.grushitcyna;

public class Main {
    public static void main(String[] args) {


        Board board1 = new Board(19);

        GameInterface app = new GameInterface(board1);
        app.setVisible(true);


    }
}