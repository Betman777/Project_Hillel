package com.zinchenko.lessons.homework1.HomeWork.homework14;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    WATER("Минеральная вода"),
    COLA("Кока кола");

    private String title;

    DrinksMachine(String title){
        this.title = title;
    }


    public String getTitle() {
        return title;
    }
}
