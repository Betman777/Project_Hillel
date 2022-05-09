package com.zinchenko.lessons.homework1.HomeWork.homework12;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greenery;
    private String mayonnaise;


    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Classic Burger :\n Composition : "
                + bun + " ," + meat + ", " + cheese + ", " + greenery + " ," + mayonnaise);
    }


    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Diet Burger  : \n Composition : "
               + bun + " ," + meat + ", " + cheese + ", " + greenery);
    }


    public Burger() {
        System.out.println("Double meat Burger : \n Composition : "
              + bun + " ," + meat + ", " + cheese + ", " + greenery + " ," + mayonnaise);
    };
}
