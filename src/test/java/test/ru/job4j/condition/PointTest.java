package test.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void distance() {

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

}