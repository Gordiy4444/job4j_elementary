package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; row++) {
            if(board[row][index] != 'X')

        result = false;

        break;
    }


    return result;
}

 public static void main(String[] args) {
char[][] board = {
        {' ', ' ', ' '},
        {'X', 'X', 'X'},
        {' ', ' ', ' '},
};
        char[][] rsl = monoHorizontal(board, );
        for (int row = 0; row < rsl.length; row++) {
        for (int cell = 0; cell < rsl.length; cell++) {
        System.out.print(rsl[row][cell]);
        System.out.print(" ");
        }
        System.out.println();
        }

        }
}

