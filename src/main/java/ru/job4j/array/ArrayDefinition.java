package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Jon Ivanov";
        names[2] = "Kolia Ivanov";
        names[3] = "Bob Ivanov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
