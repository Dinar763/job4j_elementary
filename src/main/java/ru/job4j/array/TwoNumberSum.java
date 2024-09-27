package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] targArray = new int[2];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                targArray[0] = i;
                targArray[1] = j;
                return targArray;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return  new int[0];
    }
}
