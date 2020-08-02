package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count =  finish > 1;
        for (int number = count) {
            if (CheckPrimeNumber.check(number)) {


            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(calc(5));
        System.out.print(calc(4));
    }

}