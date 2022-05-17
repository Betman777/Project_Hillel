package com.zinchenko.lessons.homework1.homework15;

public class iPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println(" This iphone begin calling");
    }

    @Override
    public void sms() {
        System.out.println(" This iphone send SMS");

    }

    @Override
    public void internet() {
        System.out.println(" This iphone internet access");

    }

    @Override
    public void iOS() {
        System.out.println(" This iphone use iOS");
    }
}
