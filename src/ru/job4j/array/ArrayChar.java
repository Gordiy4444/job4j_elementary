package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;

        for (int index = 0; index < word.length; index++) {
                if (word[index] != pref[index]) {
                    result = false;
                    break;
                }
            }
            return result;
        }


        public static void main (String[]args){
            char[] nums = new char[]{'H', 'e', 'l', 'l', 'o'};
            char[] bums = new char[]{'H', 'e'};
            boolean rsl = startsWith(nums, bums);
            System.out.println(rsl);
        }
    }
}