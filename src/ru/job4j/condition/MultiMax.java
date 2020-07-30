package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first > second ? second : first;
        result = result > third ? result : third;
        return result;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(1, 2, 3);
        System.out.println(result);
    }
}
