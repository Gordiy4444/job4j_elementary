package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(2, 3, 1);
        System.out.println(result);
    }
}
