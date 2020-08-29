package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; row++) {
            if (board[row][index] != 'X')

                result = false;

            break;
        }


        return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; column++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        boolean rsl = monoHorizontal(board, 0);
        System.out.println(rsl);
        boolean result = monoVertical(board, 2);
        System.out.println(result);
    }
}
