package ru.job4j.array;

public class FindLoop {
        public static int indexOf(int[] data, int el) {
            int rst = -1;
            for (int index = 0; index < data.length; index++) {
                if (data[index] == el) {
                    rst = index;
                    break;
                }
            }
            return rst;
        }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }


    public static void main(String[] args) {
        int index = FindLoop.indexOf(new int[]{5, 4, 3, 2, 6, 7}, 10);
        System.out.println(index);
        int i = FindLoop.indexOf(new int[]{5, 4, 3, 2, 6, 7}, 2, 0, 3);
        System.out.println(i);

    }
    }
