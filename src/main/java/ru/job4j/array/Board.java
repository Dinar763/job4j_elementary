package ru.job4j.array;

public class Board {
    public static void main(String[] args) {
        paint(4, 4);
    }

    public static void paint(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (j == i || ((j + i) % 2 == 0)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
