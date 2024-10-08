package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[] {3, 4, 1, 1, 10, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 2, 3, 4, 5, 10};
        assertThat(result).containsExactly(expected);
    }
}