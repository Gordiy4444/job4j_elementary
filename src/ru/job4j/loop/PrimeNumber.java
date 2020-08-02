package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number  = count) {int index = 2; index < finish)
            if (CheckPrimeNumber.check(number)) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(calc(5));
        System.out.print(calc(4));
    }

}