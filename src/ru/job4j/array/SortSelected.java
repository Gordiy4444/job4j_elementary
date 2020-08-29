package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length; index++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int i = FindLoop.indexOf(data, min, min, data.length - 1);
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
        return data;
    }
}
