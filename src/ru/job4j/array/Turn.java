package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[0];
        for (int index = 0; index < array.length - 1; index++) {
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;

        }
            return array;
        }

        public static void main (String[]args){
            int[] nums = new int[]{1, 2, 3, 4, 5, 6};
            int[] rsl = back(nums);
            for (int index = 0; index < rsl.length; index++)
                System.out.println(rsl[index]);
        }
    }
