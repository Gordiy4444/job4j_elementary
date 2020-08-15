package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int index = 0; index < left.length; index++) {
            for (int i = 0; i < right.length; index++)
                if (left[left.length - 1] != right[right.length - 1]) {
                    return false;

                }
        }

        public static void main (String[]args){
            int[] left = {1, 2, 3};
            int[] right = {7, 6, 3};
            boolean rsl = EqLast.check(left, right);
            System.out.println(rsl);
        }
    }
}
