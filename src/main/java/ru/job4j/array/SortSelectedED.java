package ru.job4j.array;

public class SortSelectedED {
    public static int[] sort(int[] data, int start) {
        for ( int index = 0; index <= data.length; index++) {
            int min = data[start];
            for (int i = start; i <= data.length - 1; i++) {
                if (data[i] < min) {
                    min = data[i];
                }
            }
            int temp = data[start];
            data[start] = data[min];
            data[min] = temp;
        }
        return data;
    }
}