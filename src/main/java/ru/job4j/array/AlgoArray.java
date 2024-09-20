package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp1 = array[i];
                    array[i] = array[j];
                    array[j] = temp1;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
