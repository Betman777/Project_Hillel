package com.zinchenko.lessons.lessons2.lessons3.lessons4.homework4;
public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", " New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
        System.out.println();
        System.out.println( "Факториал числа n! : " + getFactorial(5));
    }

    public static String personInfo(String name, String surname, String town, String phoneNumber) {
        String reference = " Позвонить гражданину " + " " + name + " " + surname
                + " из города " + town + " можно по номеру " + phoneNumber + ".";
        return reference;


    }

    public static int getFactorial(int n) {// или в условии n == 1 и скобки с else не писать
        if (n <= 1)
            return 1;

            return getFactorial(n - 1) * n;
        }
    }


