package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
    boolean result = true;
            for (int index = 0; index < data.length; index++) {
                 {if data[index] == 0
                 result = false;
                }


         }
    return result;
}
    public static void main (String[]args){
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = mono(nums);
        for (int index = 0; index < rsl.length; index++)
            System.out.println(rsl[index]);
    }
}

