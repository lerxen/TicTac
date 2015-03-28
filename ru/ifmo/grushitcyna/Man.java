package ru.ifmo.grushitcyna;

import ru.ifmo.grushitcyna.Board;
import ru.ifmo.grushitcyna.Gamer;

import java.util.Scanner;

public class Man extends Gamer {

    public Man(String name, NoughtsCrosses symbol) {

        super(name, symbol);
    }

    public void move(Board board) {

        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int size = board.size();

        System.out.println("Введите координату по горизонтали");
        i = sc.nextInt();
        System.out.println("Введите координату по вертикали");
        j = sc.nextInt();
        while (i < 0 || i > size || j < 0 || j > size) {
            System.out.println("Неверная координата, попробуйте еще раз!");
            System.out.println("Введите координату по горизонтали");
            i = sc.nextInt();
            System.out.println("Введите координату по вертикали");
            j = sc.nextInt();
        }

        while (board.getSymbol(i,j) != null) {
            System.out.println("Ячейка занята, попробуйте еще раз!");
            System.out.println("Введите координату по горизонтали");
            i = sc.nextInt();
            System.out.println("Введите координату по вертикали");
            j = sc.nextInt();
        }
        if (board.getSymbol(i, j) == null) {
            board.setSymbol(symbol, i, j);
        }


    }
}
