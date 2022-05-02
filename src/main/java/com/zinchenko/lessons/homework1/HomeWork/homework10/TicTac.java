package com.zinchenko.lessons.homework1.HomeWork.homework10;

import java.util.Scanner;

public class TicTac {
    static final char FIELD = 3;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] ticTac = new char[FIELD][FIELD];
        for (int i = 0; i < FIELD; i++) {
            for (int j = 0; j < FIELD; j++) {
                ticTac[i][j] = '*';
            }
        }
        printField(ticTac);
        System.out.println();

        boolean isPlayerX = true;

        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print("Enter a row number: ");
            int row = getScanner(scan);
            System.out.print("Enter a column number: ");
            int col = getScanner(scan);
                     if (isPlayerX) {
                ticTac[row][col] = 'X';
            } else {
                ticTac[row][col] = 'O';
            }
//            if (ticTac[row][col] != '*') {
//                System.out.println("Эта позиция занята попробуй еще");
//            } else {
//                break;
//            }

            printField(ticTac);

            if (isWinX(ticTac) || isWinO(ticTac)) {
                break;
            }

            isPlayerX = !isPlayerX;



        }
    }

    public static void printField(char[][] ticTac) {
        for (int i = 0; i < FIELD; i++) {
            for (int j = 0; j < FIELD; j++) {
                System.out.print(ticTac[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static boolean isWinX(char[][] ticTac) {
        if(((ticTac[0][0] == 'X') && (ticTac[0][1] == 'X') && (ticTac[0][2] == 'X')) ||
                ((ticTac[1][0] == 'X') && (ticTac[1][1] == 'X') && (ticTac[1][2] == 'X')) ||
                ((ticTac[2][0] == 'X') && (ticTac[2][1] == 'X') && (ticTac[2][2] == 'X')) ||
                ((ticTac[0][0] == 'X') && (ticTac[1][0] == 'X') && (ticTac[2][0] == 'X')) ||
                ((ticTac[0][1] == 'X') && (ticTac[1][1] == 'X') && (ticTac[2][1] == 'X')) ||
                ((ticTac[0][2] == 'X') && (ticTac[1][2] == 'X') && (ticTac[2][2] == 'X')) ||
                ((ticTac[0][0] == 'X') && (ticTac[1][1] == 'X') && (ticTac[2][2] == 'X')) ||
                ((ticTac[0][2] == 'X') && (ticTac[1][1] == 'X') && (ticTac[2][0] == 'X'))){
            return true;
        }
        return false;
    }

    public static boolean isWinO(char[][] ticTac) {
        if (((ticTac[0][0] == 'O') && (ticTac[0][1] == 'O') && (ticTac[0][2] == 'O')) ||
                ((ticTac[1][0] == 'O') && (ticTac[1][1] == 'O') && (ticTac[1][2] == 'O')) ||
                ((ticTac[2][0] == 'O') && (ticTac[2][1] == 'O') && (ticTac[2][2] == 'O')) ||
                ((ticTac[0][0] == 'O') && (ticTac[1][0] == 'O') && (ticTac[2][0] == 'O')) ||
                ((ticTac[0][1] == 'O') && (ticTac[1][1] == 'O') && (ticTac[2][1] == 'O')) ||
                ((ticTac[0][2] == 'O') && (ticTac[1][2] == 'O') && (ticTac[2][2] == 'O')) ||
                ((ticTac[0][0] == 'O') && (ticTac[1][1] == 'O') && (ticTac[2][2] == 'O')) ||
                ((ticTac[0][2] == 'O') && (ticTac[1][1] == 'O') && (ticTac[2][0] == 'O'))){
            return true;
        }
        return false;
    }
    public static boolean boardIsFull(char[][] ticTac) {
        for (int i = 0; i < FIELD; i++) {
            for (int j = 0; j < FIELD; j++) {
                if (ticTac[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }
    public static int getScanner(Scanner scan) {
        while (true) {
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                if (n >= 0 && n <= 3) {
                    return n;
                } else {
                    System.out.println("Введите числа от 0 to 3");
                }
            } else {
                System.out.println("Ошибка ввода. Введите число!");
                scan.next();

            }
        }
    }}
