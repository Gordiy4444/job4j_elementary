package ru.job4j.condition;

public class ArithmeticActions {
    public static String checkNumber(int number) {
        boolean rsl = number % 5 == 0;
        boolean res = number % 3 == 0;
        String result = "Operation not support";
        if (res && rsl) {
            result = "Hello, World!!!";
        }
        else if(res) {
            result = "Hello";
        }
        else if (rsl) {
            result = "world";
        }
            return result;

        }


            public static void main (String[]args){
                System.out.println(checkNumber(27));
            }
        }

