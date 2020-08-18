package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }



        return min;
    }

    public static void main(String[] args) {
        int i = MinDiapason.findMin(new int[]{5, 4, 3, 2, 6, 7}, 1, 4);
        System.out.println(i);

    }
}