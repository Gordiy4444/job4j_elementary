package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number  = count; number < finish; number = number + count) {
            if (int index = 2; index < number;)
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(calc(5));

    }

}