package ru.yulialyapushkina.multiplicationTableSegments.util;

public class MultiplicationTable {
    public static void printMultiplicationTable(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(array[i] + " x " + j + " = " + array[i] * j);
            }
            System.out.println();
        }
    }
}
