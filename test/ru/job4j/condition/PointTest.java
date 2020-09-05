package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 0;
        double result = Point.distance(a, b);
        Assert.assertEquals(expected, result, 0.01);
    }

}