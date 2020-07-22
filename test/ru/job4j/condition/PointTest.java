package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {

        int x1 = 1;
        int x2 = 3;
        int y1 = 2;
        int y2 = 4;
        int expected = 0;
        double result = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, result);

    }

}