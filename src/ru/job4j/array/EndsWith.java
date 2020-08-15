package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        for (int index = (word.length - post.length); index < post.length; index++) {
            if (word[index] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main (String[]args){
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'k'};
        boolean rsl = EndsWith. endsWith(word, post);
        System.out.println(rsl);
    }
}


