package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 3 + i * 2;
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
