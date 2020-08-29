package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length; index++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int i = FindLoop.indexOf(data, min, 0, data.length - 1);
            int temp = data[min];
            data[i] = data[i];
            data[i] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] index = SortSelected.sort(new int[]{5, 4, 3, 2, 6, 7});
        System.out.println(index);
    }
}