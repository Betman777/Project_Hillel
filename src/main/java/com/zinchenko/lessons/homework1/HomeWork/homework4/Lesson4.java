package com.zinchenko.lessons.homework1.HomeWork.homework4;

public class Lesson4 {
    static int age = 15;

    public static void main(String[] args) {
        //      System.out.println(factorial(5));
//        int a = getA();
//        int b = getB();
//        calculate(a,b);
        int age = 10;
        System.out.println(age);
        System.out.println(getAge());
        division();
        String name = "Den";
        System.out.println(name);
        getName(name);
        System.out.println(name);
        // getAge(age);
        // System.out.println(age);//будет выводиться опять 10 из за области видимости
    }

    //Факториал числа через рекурсию!!!!!
    private static int factorial(int n) {
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);

    }

    public static int getAge() {
        age = 20;
        return age;
    }

    public static int getA() {
        return getB();
    }

    public static int getB() {
        return 10;
    }

    public static int calculate(int a, int b) {
        int result = a + b;
        return result;
    }

    public static double division() {
        int a = 10;
        float b = 3;
        System.out.println(age);

        return a / b;
    }

    public static String getName(String name) {
        name = " Alex ";
        return name;
    }
}
