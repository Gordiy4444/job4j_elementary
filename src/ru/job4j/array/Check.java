package ru.job4j.array;

public class Check {
    public static boolean mon(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
             if(data[index] != data[0]){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        boolean[] nums = new boolean[]{true, true, false};
        boolean rsl = mon(nums);
        System.out.println(rsl);
    }
}