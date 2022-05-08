package com.zinchenko.lessons.homework1.HomeWork.homework12;

public class BurgerMain {
    public static void main(String[] args) {


        Burger classicBurger = new Burger("Bun", "Meat", "Cheese",
                "Greenery", "Mayonnaise");
        classicBurger.printInfoClassicBurger();
        System.out.println();

        Burger dietBurger = new Burger("Bun", "Meat", "Cheese", "Greenery");
        dietBurger.printInfoDietBurger();
        System.out.println();

        Burger doubleMeatBurger = new Burger("Bun", "Double meat",
                "Cheese", "Greenery", "Mayonnaise");
        doubleMeatBurger.printInfoDoubleMeatBurger();
    }
}