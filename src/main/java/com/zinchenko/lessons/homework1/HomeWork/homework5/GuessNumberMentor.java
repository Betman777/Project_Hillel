package com.zinchenko.lessons.homework1.HomeWork.homework5;

import java.util.Scanner;

public class GuessNumberMentor {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int max = 11;
        int random = (int) Math.random() * max;
        boolean isWin = false;
        int restart = -1;

        do {
            System.out.println("input number 0 - 10");
            for (int i = 2; i >= 0; i--) {
                if (random == getNumber(scanner)) {
                    isWin = true;
                    break;
                } else {
                    System.out.println("wrong data. try again. you have attempts: " + i);
                }
            }
            /*if (isWin) {
                System.out.println("win");
            } else {
                System.out.println("lose");
            }*/
            System.out.println(isWin ? "Win" : "Lose");
            System.out.println("do you want play again? 1 - yes, 2 - no");
            /*while (true) {
                if (scanner.hasNextInt()) {
                    int result = scanner.nextInt();
                    if (result == 1 || result == 2) {
                        restart = result;
                        break;
                    } else {
                        System.out.println("please enter number 1 or 2");
                    }
                }
            }*/
            restart = getNumberForRestart(scanner);
        } while (restart == 1);

    }

    public static int getNumberForRestart(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result == 1 || result == 2) {
                    return result;
                } else {
                    System.out.println("please enter number 1 or 2");
                }
            }
        }
    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= 0 && result <= 10) {
                    return result;
                } else {
                    System.out.println("please enter number from 0 to 10");
                }
            } else {
                System.out.println("wrong input. try again");
                scanner.next();
            }
        }
    }

    public static int enterNumber(Scanner sc1) {//С помощью рекурсии как вариант
        int enter;
        if (sc1.hasNextInt()) {
            enter = sc1.nextInt();
        } else {
            System.out.println("Wrong input, please enter a number:");
            sc1.next();
            enter = enterNumber(sc1);
        }
        return enter;
    }

}
