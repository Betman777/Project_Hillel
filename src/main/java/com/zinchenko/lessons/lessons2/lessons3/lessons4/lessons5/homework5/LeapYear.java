package com.zinchenko.lessons.lessons2.lessons3.lessons4.lessons5.homework5;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(" Entered year is a Leap Year ? : " + isLeapYear(1987));
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;

        }

    }
}

