package com.zinchenko.lessons.homework1.HomeWork.homework12;

public class MainTracker {
    public static void main(String[] args) {
        FitnessTracker account1 = new FitnessTracker("Fill", "Collins", 23, 7,
                1984, "Zuw@gmail.com", "0935467865", 78.5, "120/90", 12000);
        System.out.println();
        account1.printAccountInfo();
        System.out.println();
        FitnessTracker account2 = new FitnessTracker("Jim", "Bim", 12, 3, 2000,
                "Jim@mail.com", "0967564532", 84.3, "110/80", 8967);
        account2.printAccountInfo();
        FitnessTracker account3 = new FitnessTracker("Bill", "Milligan", 2, 11, 1993,
                "Bill@gmail.com", "0956785432", 98.4, "130/90", 12346);
        System.out.println();
        account3.printAccountInfo();
        System.out.println();
        FitnessTracker account4 = new FitnessTracker("Jon", "Bon Jovi", 4, 7,
                1962, "Jon1982@ukr.net", "0937563452", 86.7, "120/90", 18456);
        account4.printAccountInfo();
        System.out.println();

        account1.setWeight(65);
        account1.setSteps(15678);
        System.out.println("After change");
        account1.printAccountInfo();
        account4.setLastName("Mercury");
        account4.setPressure("190/70");
        System.out.println("After change");
        account4.printAccountInfo();
    }
}
