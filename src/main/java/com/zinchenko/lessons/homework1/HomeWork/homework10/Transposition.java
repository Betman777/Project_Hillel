package com.zinchenko.lessons.homework1.HomeWork.homework10;

import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {
        transposition();
    }

    public static void transposition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество строк");
        int M = getScanner(scan);
        System.out.println("Введите количество столбцов");
        int N = getScanner(scan);
        int[][] array = new int[M][N];
        System.out.println();
        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getScanner(scan);

            } System.out.println();
        }
        int[][] array2 = new int[N][M];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j] + "\t ");
            }
            System.out.println();
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print( array2[i][j] + "\t ");
            }
            System.out.println();
        }scan.close();
    }

    public static int getScanner(Scanner scan) {
        while (true) {
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                if (n >= 0 && n <= 100) {
                    return n;
                } else {
                    System.out.println("Введите числа от 0 to 100");
                }
            } else {
                System.out.println("Ошибка ввода. Введите число!");
                scan.next();

            }
        }
    }
}