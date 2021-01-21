package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table.length; cell++) {
                table[row][cell] = table[row][0] * table[0][cell];
            }
        }
        return table;
    }
}
