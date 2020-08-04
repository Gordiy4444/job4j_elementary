package ru.job4j.loop;

public class Mortgage { public static int year(int amount, int salary, double percent) {
    int year = 0;
    while (amount > 0) {
        amount = (int) (amount * (1 + percent / 100) - salary);

        year++;
     }
    return year;
   }

    public static void main(String[] args) {
        System.out.println(year(100, 70, 50));

    }
}
