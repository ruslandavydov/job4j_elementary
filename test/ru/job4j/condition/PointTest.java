package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when11To11Then0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double expected = 0.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when20To52Then3() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 5;
        int y2 = 2;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}