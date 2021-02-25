package test.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double result1 = SqArea.square(p, k);
        Assert.assertEquals(expected, result1, 0.01);

    }
}