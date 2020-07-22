package ru.job4j.converter;

public class Converter { public static int rubleToEuro(int value) {
    int rsl = value / 70;
    return rsl;
}

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro" + " or " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        int put = rubleToDollar(in);
        boolean passed = expected == out;
        boolean cassed = expected == put;
        System.out.println("140 rubles are 2. Test result euro:" + passed + " dollar:" + cassed);

    }
}
