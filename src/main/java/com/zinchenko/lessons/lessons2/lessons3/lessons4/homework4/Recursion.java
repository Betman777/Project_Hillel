package com.zinchenko.lessons.lessons2.lessons3.lessons4.homework4;

public class Recursion {
    public static void main(String[] args) {
recursion(0);
    }
    public static void recursion(int iterator){
        iterator++;
        System.out.println("Steak start(iterator) = " + iterator);
if(iterator<5){
    recursion(iterator);//рекурсия
}
        System.out.println("Steak  end (iterator) = " + iterator);
    }
}
