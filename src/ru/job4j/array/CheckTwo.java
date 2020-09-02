package ru.job4j.array;

public class CheckTwo {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            { if(data[data.length - 1] = data[index]);
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main (String[]args){
        boolean[] nums = new boolean[]{true, false, true};
        boolean rsl = mono(nums);
        System.out.println(rsl);
    }
}

