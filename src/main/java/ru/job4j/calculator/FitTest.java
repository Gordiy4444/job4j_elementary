package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

      @Test
      public void manWeight() {
        double height = 178;
        double expected = 89.69999999999999;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);

    }


}

