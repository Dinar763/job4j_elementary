package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] targArray = new int[2];
        boolean flag = false;
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            while (j < array.length && (!flag)) {
                if (array[i] + array[j] == target) {
                    targArray[0] = i;
                    targArray[1] = j;
                    flag = true;
                    break;
                } else {
                    j++;
                }
            }
            j = i + 1;
        }
        return (targArray[1] != 0) ? targArray : new int[0];
    }
}
