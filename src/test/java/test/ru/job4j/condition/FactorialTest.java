package test.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial .calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial .calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
}