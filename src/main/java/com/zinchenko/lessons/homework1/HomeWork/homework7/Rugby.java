package com.zinchenko.lessons.homework1.HomeWork.homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        averageTeamRugby();
    }

    public static void averageTeamRugby() {
        int numbersPlayers = 25;
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int averageTeam1 = 0;
        int averageTeam2 = 0;
        int sum = 0;
        int sum1 = 0;
        int min = 18;
        int max = 41;
        for (int i = 0; (i < team1.length) && (i < team2.length); i++) {
            team1[i] = (int) (Math.random() * (max - min) + min);
            sum += team1[i];
            averageTeam1 = sum / numbersPlayers;
            team2[i] = (int) (Math.random() * (max - min) + min);
            sum1 += team2[i];
            averageTeam2 = sum1 / numbersPlayers;
        }
        System.out.println("Age of players Team 1 : " + Arrays.toString(team1));
        System.out.println(" Average age Team1 : " + averageTeam1 + " years .");
        System.out.println("Age of players Team 2 : " + Arrays.toString(team2));
        System.out.println(" Average age Team2 : " + averageTeam2 + " years .");
    }
}
