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
        }


        if (board.winner()) {
            int reply = JOptionPane.showConfirmDialog(null, "Хотите сыграть еще?", "ВЫ ВЫИГРАЛИ!!!", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                {
                    Board board1 = new Board(19);

                    GameInterface app = new GameInterface(board1);
                    app.setVisible(true);


                }


            }
            return;
        }

        comp.move(board);

        if (board.winner()) {
            int reply = JOptionPane.showConfirmDialog(null, "Хотите сыграть еще?", "Победил: " + comp.getName(), JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                {
                    Board board1 = new Board(19);

                    GameInterface app = new GameInterface(board1);
                    app.setVisible(true);


                }
            }
        }
    }

}
