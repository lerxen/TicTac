package ru.ifmo.grushitcyna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GameInterface extends JFrame {

    private Board board;
    private JButton[][] buttons;

    public GameInterface(final Board board) {
        super("ru.ifmo.grushitcyna.TicTacToe");

        this.board = board;

        JPanel panel = new JPanel();

        final int width = board.size();
        final int height = board.size();

        buttons = new JButton[width][height];

        panel.setLayout(new GridLayout(width, height, 2, 2));
        for (int i = 0; i < width; i++) {
            for (int j=0; j< height; j++) {

                NoughtsCrosses symbol = board.getSymbol(i, j);
                final String s = (symbol == null) ? " " : symbol.toString();

                JButton button = new JButton(s);
                ActionListener actionListener = new ButtonListener();
                button.addActionListener(actionListener);
                panel.add(button);

                buttons[i][j] = button;

            }
        }

        setContentPane(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void boardUpdated() {
        final int width = board.size();
        final int height = board.size();

        for (int i = 0; i < width; i++) {
            for (int j=0; j< height; j++) {

                NoughtsCrosses symbol = board.getSymbol(i, j);
                final String s = (symbol == null) ? " " : symbol.toString();

                buttons[i][j].setText(s);
            }
        }
    }

}