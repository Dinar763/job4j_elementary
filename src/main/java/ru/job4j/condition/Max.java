package ru.job4j.condition;

public class Max {
    public static int max(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    public static int max(int number1, int number2, int number3) {
        int maxTwoNumbers = max(number1, number2);
        return maxTwoNumbers > number3 ? maxTwoNumbers : number3;
    }

    public static int max(int number1, int number2, int number3, int number4) {
        int maxThreeNumbers = max(number1, number2, number3);
        return maxThreeNumbers > number4 ? maxThreeNumbers : number4;
    }
}
