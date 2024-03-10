package ru.yulialyapushkina.multiplicationTableSegments._main;

import ru.yulialyapushkina.multiplicationTableSegments.util.MultiplicationTable;
import ru.yulialyapushkina.multiplicationTableSegments.util.SegmentsLength;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        MultiplicationTable.printMultiplicationTable(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        System.out.println("x = ");
        int x1 = scanner.nextInt();
        System.out.println("y = ");
        int y1 = scanner.nextInt();
        System.out.println("Введите координаты точки B: ");
        System.out.println("x = ");
        int x2 = scanner.nextInt();
        System.out.println("y = ");
        int y2 = scanner.nextInt();
        SegmentsLength.calcLengthOfSegment(x1, y1, x2, y2);
    }
}
