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
                break;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return (targArray[1] != 0) ? targArray : new int[0];
    }

    public static void main(String[] args) {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        getIndexes(array, target);
    }
}
