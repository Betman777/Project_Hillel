package com.zinchenko.lessons.homework1.HomeWork.homework12;

public class Burger {
    private String bun;
    private int meat;
    private String cheese;
    private String greenery;
    private String mayonnaise;


    public Burger(String bun, int meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        printInfoClassicBurger();
    }

    public Burger(String bun, int meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        printInfoDietBurger();
    }


    public Burger(String bun, String cheese, String greenery) {
        this.bun = bun;
        this.meat = 2;
        this.cheese = cheese;
        this.greenery = greenery;
        printInfoDoubleMeatBurger();

    }

    public void printInfoClassicBurger() {
        System.out.println("Classic Burger :\n Composition : "
                + bun + " , meat : " + meat + ", " + cheese + ", " + greenery + " ," + mayonnaise);
    }

    public void printInfoDietBurger() {
        System.out.println("Diet Burger  : \n Composition : "
                + bun + " , meat : " + meat + ", " + cheese + ", " + greenery);
    }

    public void printInfoDoubleMeatBurger() {
        System.out.println(
                "Double meat Burger  : \n Composition : "
                        + bun + " , meat : " + meat + ", " + cheese + ", " + greenery);
    }




}
