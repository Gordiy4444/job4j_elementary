package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; row++) {
            if (index != board)

        result = false;

        break;
    }

}
    return result;
}

 public static void main(String[] args) {

        int[][] rsl = monoHorizontal("X",  4);
        for (int row = 0; row < rsl.length; row++) {
        for (int cell = 0; cell < rsl.length; cell++) {
        System.out.print(rsl[row][cell]);
        System.out.print(" ");
        }
        System.out.println();
        }

        }
}

