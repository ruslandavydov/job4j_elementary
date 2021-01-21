package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenMonoHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }
}
