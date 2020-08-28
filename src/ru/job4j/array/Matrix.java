package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 1; row < table.length; row++) {
            for (int cell = 1; cell < table.length; cell++) {


            }
        }
        return table;

    }


    public static void main(String[] args) {

        int[][] rsl = multiple(9);
        for (int row = 1; row < rsl.length; row++) {
            for (int cell = 1; cell < rsl.length; cell++) {
                System.out.print(rsl[row][cell]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}