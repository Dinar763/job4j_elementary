package ru.job4j.condition;

public class Max {
    public static int max(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int max(int number1, int number2, int number3) {
        return max(max(number1, number2), number3);
    }

    public static int max(int number1, int number2, int number3, int number4) {
        return max(max(number1, number2, number3), number4);
    }
}
