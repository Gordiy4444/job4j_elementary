package ru.job4j.loop;


public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 1; index <= number; index++)
            if ((number % 5) == 0) {
                prime = true;
            }
        return prime;

        {
            public static void main (String[]args){
            System.out.print(check(5));
            System.out.print(check(4));
        }
        }
    }