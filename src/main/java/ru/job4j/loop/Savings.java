package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;

        do {
            years++;
            total += annualDeposit + (total / 100 * percent);
        } while (total < goal);

        return years;
    }

}
