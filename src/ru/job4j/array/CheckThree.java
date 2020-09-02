package ru.job4j.array;

public class CheckThree {
    public static boolean moon(int[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if(data[index] < data[index - 1]){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        boolean index = moon(new int[] {1, 2, 9, 5, 6, 7});
        System.out.println(index);
    }
}
