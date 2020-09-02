package ru.job4j.array;

public class FindLooped {
    public static int indexOff(int[] data, int[] array ){
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            for (int i = 0; i < array.length; i++)
            if (data[index] == array[i]) {
                rst = index;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int index = FindLooped.indexOff(new int[]{5, 4, 3, 2, 6, 7}, new int[]{8, 9, 31, 5, 7});
        System.out.println(index);
    }
}

