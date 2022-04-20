package com.zinchenko.lessons.lessons2.homework2;

public class Cuboid {
    public static void main(String[] args) {
        byte a = 13;
        byte b = 10;
        float c = 5.73F;
        float volume = (a * b) * c;

        System.out.println("Объем параллелепипеда = " + volume);

        float length = (a + b + c) * 4;
        System.out.println("Суммарная длина всех сторон = " + length);

        double latitude = 46.69439029999999;
        double longitude = 32.5416792;
        System.out.println("Широта : " + latitude + " Долгота : " + longitude);

    }
}
