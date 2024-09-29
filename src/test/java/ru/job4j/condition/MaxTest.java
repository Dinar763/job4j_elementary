package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;;

class MaxTest {

    @Test
    void maxWhen15Then5() {
        int number1 = 1;
        int number2 = 5;
        int expected = 5;
        int output = Max.max(number1, number2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void maxWhen51Then5() {
        int number1 = 5;
        int number2 = 1;
        int expected = 5;
        int output = Max.max(number1, number2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void maxWhen123Then3() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int expected = 3;
        int output = Max.max(number1, number2, number3);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void maxWhen321Then3() {
        int number1 = 3;
        int number2 = 2;
        int number3 = 1;
        int expected = 3;
        int output = Max.max(number1, number2, number3);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void maxWhen1234Then4() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int expected = 4;
        int output = Max.max(number1, number2, number3, number4);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void maxWhen4321Then4() {
        int number1 = 4;
        int number2 = 3;
        int number3 = 2;
        int number4 = 1;
        int expected = 4;
        int output = Max.max(number1, number2, number3, number4);
        assertThat(output).isEqualTo(expected);
    }
}