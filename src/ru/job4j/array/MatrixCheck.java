package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
                if (board[row][index] != 'X'){

                    result = false;

                break;
            }
        }


        return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {

                if (board[i][column] != 'X'){
                    result = false;
                    break;

            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int n = 0; n < board.length; n++) {
            rsl[n] = board[n][n];
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'X', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        boolean rsl = monoHorizontal(board, 0);
        System.out.println(rsl);
        boolean result = monoVertical(board, 2);
        System.out.println(result);
        char[] res = extractDiagonal(board);
        System.out.println(res);
    }
}
