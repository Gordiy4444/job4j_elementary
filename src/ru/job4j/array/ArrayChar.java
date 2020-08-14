package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;

        for (int index = 0; index < word.length; index++) {
            for (int i = 0; i < pref.length; index++) {
                if (word[index] != pref[i]) {
                    result = false;
                    break;
                }
            }
            return result;
        }


        public static void main (String[]args){
            boolean[] nums = new boolean[]{};
            boolean rsl = startsWith();
            System.out.println(rsl);
        }
    }
}