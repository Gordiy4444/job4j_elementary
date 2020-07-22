package ru.job4j.calculator;

import  static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void calc() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }
}