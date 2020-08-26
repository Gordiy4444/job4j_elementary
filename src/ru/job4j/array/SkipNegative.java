package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
    for (int row = 0; row < array.length; row++) {
        for (int cell = 0; cell < array.length; cell++) {
            int rsl = array[cell][row];
            if (rsl < 0) {
                array[cell][row] = 0;
            }
        }
    }
    return array;

}


    public static void main(String[] args) {
        int[][] array = {
                {-1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        System.out.println(skip(array));

    }
}



