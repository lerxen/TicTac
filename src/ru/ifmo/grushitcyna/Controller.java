package ru.ifmo.grushitcyna;

import javax.swing.*;

public class Controller {

    private final Gamer comp = new Computer("Компьютер", NoughtsCrosses.O);

    private final Board board;


    public Controller(Board board) {
        this.board = board;
    }

    public void addX(int x, int y) {
        if (board.getSymbol(x, y) == null) {
            board.setSymbol(NoughtsCrosses.X, x, y);
        } else {
            JOptionPane.showMessageDialog(null, "Эта ячейка занята!");
            return;
        }


        if (board.winner()) {
            newGame();
            return;
        }

        comp.move(board);

        if (board.winner()) {
            newGame();
        }
    }

    public void newGame() {
        int reply = JOptionPane.showConfirmDialog(null, "Хотите сыграть еще?", "ВЫ ВЫИГРАЛИ!!!", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            board.nullBoard();

        }
        if (reply == JOptionPane.NO_OPTION) {

            System.exit(0);
        }

    }
    
}
