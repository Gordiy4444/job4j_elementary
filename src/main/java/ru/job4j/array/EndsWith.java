package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - 1 - index] != post[post.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main (String[]args){
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean rsl = EndsWith. endsWith(word, post);
        System.out.println(rsl);
    }
}


