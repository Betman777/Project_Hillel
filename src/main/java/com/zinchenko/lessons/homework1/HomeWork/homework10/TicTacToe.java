package com.zinchenko.lessons.homework1.HomeWork.homework10;

import java.util.Scanner;

public class TicTacToe {
    static final char FIELD = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] ticTac = new char[FIELD][FIELD];
        for (int i = 0; i < FIELD; i++) {
            for (int j = 0; j < FIELD; j++) {
                ticTac[i][j] = '-';
            }
        }
        for (int i = 0; i < FIELD; i++) {
            for (int j = 0; j < FIELD; j++) {
                System.out.print(ticTac[i][j]);

            }
            System.out.println();
        }
        System.out.println();


    }

//    public static char winningMove(char[][] ticTac) {
//        for (int i = 0; i < FIELD; i++) {
//            if (ticTac[i][0] == ticTac[i][1] && ticTac[i][1] == ticTac[i][2] && ticTac[i][0] != '-') {
//                return ticTac[i][0];
//            }
//        }
//    }
}
         //  //    if (ticTac[0][j] == ticTac[1][j] && ticTac[1][j] == ticTac[])
          //  }

 //       }
 //   }}
//    public static String getScanner(Scanner scan) {
//        while (true) {
//            if (scan.hasNextLine()) {
//                String n = scan.nextLine();
//                if (n =="x" || n =="0") {
//                    return n;
//                } else {
//                    System.out.println("Введите  0 или х");
//                }
//            } else {
//                System.out.println("Ошибка ввода. ");
//                scan.next();



//    }
//}
//    }