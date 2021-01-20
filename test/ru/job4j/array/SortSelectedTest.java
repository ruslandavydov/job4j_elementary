package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenShort5() {
        int[] input = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenShort3() {
        int[] input = {3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3};
        assertThat(result, is(expect));
    }
}
