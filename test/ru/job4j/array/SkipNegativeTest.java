package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void whenOneMinus() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenTwoMinus() {
        int[][] in = {
                {-1, 2},
                {1, -2}
        };
        int[][] expect = {
                {0, 2},
                {1, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenThreeMinus() {
        int[][] in = {
                {1, -2, -3},
                {1, 2, -3}
        };
        int[][] expect = {
                {1, 0, 0},
                {1, 2, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}