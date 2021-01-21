package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int line) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[line][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            for (int cell = column; cell < board[row].length; cell++) {
                if (board[row][column] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
