package com.zinchenko.lessons.homework1.HomeWork.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first team :  ");
        String teamName1 = scan.nextLine();
        System.out.println(" You enter name team  :" + teamName1);

        System.out.println("Enter the name of the second team :  ");
        String teamName2 = scan.nextLine();
        System.out.println(" You enter name team  :" + teamName2);
        int player1Team1 = 0, player2Team1 = 0, player3Team1 = 0,
                player4Team1 = 0, player5Team1 = 0, player1Team2 = 0,
                player2Team2 = 0, player3Team2 = 0, player4Team2 = 0,
                player5Team2 = 0;
        double averageResultTeam1;
        double averageResultTeam2;
        System.out.println();


        System.out.println(" Please entered number of frags for 5 players TeamName1: ");
        if (scan.hasNextInt()) {
            player1Team1 = scan.nextInt();
            player2Team1 = scan.nextInt();
            player3Team1 = scan.nextInt();
            player4Team1 = scan.nextInt();
            player5Team1 = scan.nextInt();
        } else {
            System.out.println(" ERROR!!! Wrong input");
        }

        System.out.println(" Please entered number of frags for 5 players TeamName2: ");
        if (scan.hasNextInt()) {
            player1Team2 = scan.nextInt();
            player2Team2 = scan.nextInt();
            player3Team2 = scan.nextInt();
            player4Team2 = scan.nextInt();
            player5Team2 = scan.nextInt();

        } else {
            System.out.println(" ERROR!!! Wrong input");
            scan.close();
        }

        averageResultTeam1 = (double) (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        System.out.println("Average points Team 1 = " + averageResultTeam1);
        averageResultTeam2 = (double) (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;
        System.out.println("Average points Team 2 = " + averageResultTeam2);

        if (averageResultTeam1 > averageResultTeam2) {
            System.out.println("Winner Team : " + teamName1 + " scored : " + averageResultTeam1 + " points");
        } else if (averageResultTeam1 < averageResultTeam2) {
            System.out.println("Winner Team : " + teamName2 + "scored : " + averageResultTeam2 + " points");
        } else {
            System.out.println("Draw");
        }


    }
}