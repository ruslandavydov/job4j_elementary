package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueTrueTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByFalseFalseFalse() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByTrueFalseTrue() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}
