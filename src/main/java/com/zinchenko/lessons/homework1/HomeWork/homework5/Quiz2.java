package com.zinchenko.lessons.homework1.HomeWork.homework5;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer;
        int restart;

        do {
            int mystery = (int) (Math.random() * 11);
            System.out.println("\nNew game!");
            System.out.println("Please, enter a digit from 0 to 10. You have 5 attempts.");
            for (int i = 5; i > 0; i--) {
                answer = getNumber(scanner);
                if (answer == mystery) {
                    System.out.println("You are the champion!");
                    break;
                } else if (i != 1) {
                    System.out.println("You didn't guess! Please, try again. You have " + (i - 1) + " attempts.");
                }
            }
            System.out.println("Game over! The mystery digit is " + mystery + ".");
            System.out.println("\nEnter any digit/letter to restart game or press \"1\" for exit?");
            restart = getNumber(scanner);
        } while (restart != 1);
    }

    public static int getNumber(Scanner scanner) {
        int result = 0;
        if (scanner.hasNextInt()) {
            result = scanner.nextInt();
        } else {
            scanner.next();
        }
        return result;
    }
}

