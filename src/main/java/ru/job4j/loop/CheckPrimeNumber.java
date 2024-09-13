package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean flag = number > 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
