package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int index = findMin(new int[]{5, 4, 3, 2, 6, 7});
        System.out.println(index);
    }
}
