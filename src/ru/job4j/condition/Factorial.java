package ru.job4j.condition;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result = result * index;
        }
            return result;
        }

    public static void main(String[] args) {
                System.out.println(calc(0));

            }
        }
