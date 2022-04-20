package com.zinchenko.lessons.lessons2.lessons3.lessons4.lessons5.lessons6.homework6;

public class JapanNumber {
    public static void main(String[] args) {
        int countShuttle = 1;
        int numberShuttle = 1;
        while (countShuttle <= 100) {
            if (checks(numberShuttle)) {
                System.out.println("Shuttle number  = " + numberShuttle + "\n" + " count Shuttle = " + countShuttle);
                countShuttle++;
            }
            numberShuttle++;
        }
    }

    public static boolean checks(int num) {
        int result = num % 10;
        do {
            if (result == 4 || result == 9)
                return false;
            num /= 10;
            result = num % 10;
        } while (num > 0);
        return true;
    }
}
//        if (num == 4 || num == 9 || num % 10 == 4 || num % 10 == 9                или это решение как вариант)))
//                || (num % 100) / 10 == 4 || (num % 100) / 10 == 9) {
//            return false;
//        } else {
//            return true;
//        }

