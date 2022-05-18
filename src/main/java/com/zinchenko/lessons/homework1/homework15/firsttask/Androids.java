package com.zinchenko.lessons.homework1.homework15.firsttask;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("This android calling");
    }

    @Override
    public void sms() {
        System.out.println("This android send SMS ");

    }

    @Override
    public void internet() {
        System.out.println("This android use internet");

    }

    @Override
    public void linuxOS() {
        System.out.println("This android use LinuxOS");
    }
}
