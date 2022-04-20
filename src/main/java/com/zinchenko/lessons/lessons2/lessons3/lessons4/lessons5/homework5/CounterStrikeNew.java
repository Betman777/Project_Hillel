package com.zinchenko.lessons.lessons2.lessons3.lessons4.lessons5.homework5;

import java.util.Scanner;

public class CounterStrikeNew {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first team :  ");
        String teamName1 = getTeamName(scan);
        System.out.println(" You enter name team  :" + teamName1);

        System.out.println("Enter the name of the second team :  ");
        String teamName2 = getTeamName(scan);
        System.out.println(" You enter name team  :" + teamName2);

        int player1Team1, player2Team1, player3Team1,
                player4Team1, player5Team1, player1Team2,
                player2Team2, player3Team2, player4Team2,
                player5Team2;
        double averageResultTeam1;
        double averageResultTeam2;

        System.out.println();
        System.out.println(" Please entered number of frags for 5 players TeamName1: ");
        player1Team1 = getCountFrag(scan);
        player2Team1 = getCountFrag(scan);
        player3Team1 = getCountFrag(scan);
        player4Team1 = getCountFrag(scan);
        player5Team1 = getCountFrag(scan);

        System.out.println(" Please entered number of frags for 5 players TeamName2: ");
        player1Team2 = getCountFrag(scan);
        player2Team2 = getCountFrag(scan);
        player3Team2 = getCountFrag(scan);
        player4Team2 = getCountFrag(scan);
        player5Team2 = getCountFrag(scan);

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
        scan.close();
    }

    public static String getTeamName(Scanner scan) {
        String name = scan.nextLine();
        return name;
    }

    public static int getCountFrag(Scanner scan) {
        int result = 0;
        if (scan.hasNextInt()) {
            result = scan.nextInt();
        } else {
            System.out.println("ERROR!!! Wrong input");
            System.out.println("Run program again");
            System.exit(0);
        }
        return result;
    }

}