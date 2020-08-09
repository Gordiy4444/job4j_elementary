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

    public static void main(String[] args) {
        int index = FindLoop.indexOf(new int[]{10, 20, 30, 40, 50, 8, 15, 17}, 8);
        System.out.println(index);
    }
    }
