package com.zinchenko.lessons.homework1.homework15;

import java.util.Arrays;

public class MainSmartphone {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.linuxOS();

        System.out.println("***************");
        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.iOS();

    }
}