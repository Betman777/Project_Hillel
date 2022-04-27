package com.zinchenko.lessons.homework1.HomeWork.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    static int ARRAY_LENGTH = 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] companyNumber = new int[7];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            companyNumber[i] = (int) (Math.random() * 11);
        }
        Arrays.sort(companyNumber);
        System.out.println();
        System.out.println("Entered the number with up 0 to 10");
        int[] playerNumber = new int[7];
        for (int j = 0; j < ARRAY_LENGTH; j++) {
            playerNumber[j] = getScanner(scan);
        }
        Arrays.sort(playerNumber);
        System.out.println();
        System.out.println("Company number : " + Arrays.toString(companyNumber));
        System.out.println("Number entered by the player : " + Arrays.toString(playerNumber));
        numbers(companyNumber, playerNumber);
        scan.close();
    }

    public static void numbers(int[] companyNumber, int[] playerNumber) {
        int count = 0;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (companyNumber[i] == playerNumber[i]) {
                count++;
            }
        }
        System.out.println("Number of coincidences : " + count);
    }

    public static int getScanner(Scanner scan) {

        while (true) {
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                if (n >= 0 && n <= 10) {
                    return n;
                } else {
                    System.out.println("Entered the number with up 0 to 10");
                }
            } else {
                System.out.println("Wrong input");
                scan.next();

            }
        }
    }

}