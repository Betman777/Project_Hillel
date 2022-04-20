package com.zinchenko.lessons.lessons2.lessons3.homework3;

public class DynastyChina {
    public static void main(String[] args) {
        twoDynasty();
        float resultDivision = division(22, 7);
        System.out.println("Результат a / b = " + resultDivision);
        System.out.println();
        int result = randomNumbers(4);
        System.out.println(" Псевдослучайное число из отрезка [-n,n] : " + result);
    }

    public static void twoDynasty() {
        int dynastyLiRateAttackWarrior = 13;
        int dynastyLiRateAttackArcher = 24;
        int dynastyLiRateAttackHorseman = 46;
        int totalNumbersWarriorsDynastyLi = 860;

        int dynastyMinhRateAttackWarrior = 9;
        int dynastyMinhRateAttackArcher = 35;
        int dynastyMinhRateAttackHorseman = 12;
        int totalNumbersWarriorsDynastyMinh = (int) (totalNumbersWarriorsDynastyLi * 1.5);


        int totalAttackDynastyLi = (dynastyLiRateAttackWarrior + dynastyLiRateAttackArcher + dynastyLiRateAttackHorseman)
                * totalNumbersWarriorsDynastyLi;
        int totalAttackDynastyMinh = (dynastyMinhRateAttackWarrior + dynastyMinhRateAttackArcher + dynastyMinhRateAttackHorseman)
                * totalNumbersWarriorsDynastyMinh;
        System.out.println("Значение общей атаки армии Ли : " + totalAttackDynastyLi);
        System.out.println("Значение общей атаки армии Минь : " + totalAttackDynastyMinh);

        System.out.println();
    }

    public static int division(int a, int b) {
        int division = a / b;// int a; такая запись самая простая число в методе не задается
                               //float b; а в мейне просто вызов метода float для точности
        return division;//sout(a/b)
    }

    public static int randomNumbers(int n){
    int result = ((int) (Math.random() * (n + n) + 1) - n);
    return result;
//    или так !!!! public static void randomNumbers(int n){
//    int result = ((int) (Math.random() * (n + n) + 1) - n);
//        System.out.println("Псевдослучайное число из отрезка [-n,n] : " + result);
    }
}