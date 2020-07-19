package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k,) {
        double h = p/(2*(k+1));
        return h;
    }
    public static double square(int k, int h,) {
        double L = h * k;
        return L;
    }
    public static double square(int L, int h,) {
        double s = L * h;
        return s;
    }

    public static void main(String[] arg) {
        double result1 = SqArea.square(6, 2,);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}