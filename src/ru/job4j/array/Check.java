package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
    boolean result = true;
            for (int index = 0; index < data.length; index++) {
                 { data[index]  = true;
                 result = false;
                }


         }
    return result;
}
    public static void main (String[]args){
        boolean[] nums = new boolean[]{true, true, true};
        boolean rsl = mono(nums);
            System.out.println(rsl);
    }
}

