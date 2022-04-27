package com.zinchenko.lessons.homework1.HomeWork.homework5;

import java.util.Scanner;

public class GameGuessTheNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int count = 0;
        int max = 11;
        int restartTheGame;
        boolean isWinner = false;
        do {

            int random = (int) ((Math.random() * max));
            System.out.println("Let's play Guess the number.");
            System.out.println("You have 5 attempts.");
            System.out.println("Enter a number from 0 to 10 : ");

            for (int i = 4; i >= 0; i--) {
                count++;
                inputNumber = getCountNumber(scanner);
                if (inputNumber != random) {
                    System.out.println("You guessed wrong, you only have : " + i + " an attempts.");

                } else if (inputNumber == random) {
                    System.out.println("Cheers Victory !!!!You guessed right with : " + count + " an attempts.");
                    System.out.println("Want to play again?");
                    isWinner = true;
                    break;
                }
            }
            if (!isWinner) {
                System.out.println("Unfortunately you lost!!!" + "\n" + " Try again .");
            }
            System.out.println("Click on any symbol on the keyboard, except '1'," +
                    " if you want to continue the game.Press  '1' - Exit.");
            restartTheGame = getCountNumber(scanner);
        } while (restartTheGame != 1);

        scanner.close();
    }

    public static int getCountNumber(Scanner scanner) {
        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("ERROR!!! You entered something wrong !");
                System.out.println("Repeat  input !!! ");
                scanner.next();
            }
        } while (true);

    }
}

