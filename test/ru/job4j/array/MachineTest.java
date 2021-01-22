package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int[] expect = {};
        int[] rsl = Machine.change(100, 100);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By35() {
        int[] expect = {10, 5};
        int[] rsl = Machine.change(50, 35);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when100By35() {
        int[] expect = {10, 10, 10, 10, 10, 10, 5};
        int[] rsl = Machine.change(100, 35);
        assertThat(rsl, is(expect));
    }
}
