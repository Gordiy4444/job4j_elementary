package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];

                }


        public static void main (String[]args){
            int[] left = {1, 2, 4};
            int[] right = {7, 6, 3};
            boolean rsl = EqLast.check(left, right);
            System.out.println(rsl);
        }
    }

