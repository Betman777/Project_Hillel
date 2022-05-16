package com.zinchenko.lessons.homework1.HomeWork.homework14;


import java.util.Scanner;

public class MainDrinksMachine {
    private static Scanner scanner = new Scanner(System.in);
    public static int total = 0;

    public static void main(String[] args) {
        runPreparation();
        System.out.println("Всего к оплате : " + total);

    }

    private static void runPreparation() {
        System.out.println();

        System.out.println("В ассортименте нашего аппарата такие напитки : COFFEE,TEA," +
                "LEMONADE,MOJITO,WATER,COLA");
        System.out.println();
        System.out.println("Введите название выбранного напитка ");

        DrinksMachine drinksMachine = null;
        boolean stop = false;

        while (!stop) {
            while (!stop) {
                String drinksChoice;
                drinksChoice = scanner.next();
                try {
                    drinksMachine = DrinksMachine.valueOf(drinksChoice.toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(" Ошибка ввода ");
                    stop = drinksChoice.equals("NO".toUpperCase());
                }
            }
            if (stop) {
                break;
            }

            int count = 0;
            int price = 0;

            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("Вы выбрали " + drinksMachine.getTitle() + " стоимостью " + Drinks.COFFEE_PRICE);
                    count = getNumber();
                    price = makeCoffee(count);
                    System.out.println(" К оплате " + price + " за " + count + " кофе ");
                    total += price;
                    break;
                }
                case TEA -> {
                    System.out.println("Вы выбрали " + drinksMachine.getTitle() + " стоимостью " + Drinks.TEA_PRICE);
                    count = getNumber();
                    price = makeTea(count);
                    System.out.println(" К оплате " + price + " за " + count + " чая ");
                    total += price;
                    break;
                }
                case LEMONADE -> {
                    System.out.println("Вы выбрали " + drinksMachine.getTitle() + " стоимостью " + Drinks.LEMONADE_PRICE);
                    count = getNumber();
                    price = makeLemonade(count);
                    System.out.println(" К оплате " + price + " за " + count + " лимонада ");
                    total += price;
                    break;
                }
                case MOJITO -> {
                    System.out.println("Вы выбрали " + drinksMachine.getTitle() + " стоимостью " + Drinks.MOJITO_PRICE);
                    count = getNumber();
                    price = makeMojito(count);
                    System.out.println(" К оплате " + price + " за " + count + " мохито ");
                    total += price;
                    break;
                }
                case WATER -> {
                    System.out.println("Вы выбрали " + drinksMachine.getTitle() + " стоимостью " + Drinks.WATER_PRICE);
                    count = getNumber();
                    price = makeWater(count);
                    System.out.println(" К оплате " + price + " за " + count + " минеральной воды ");
                    total += price;
                    break;
                }
                case COLA -> {
                    System.out.println("Вы выбрали " + drinksMachine.getTitle() + " стоимостью " + Drinks.COLA_PRICE);
                    count = getNumber();
                    price = makeCocaCola(count);
                    System.out.println(" К оплате " + price + " за " + count + " Кока - Колы ");
                    total += price;
                    break;
                }
            }
            System.out.println("Хотите еще что то");
            System.out.println(" Введите " + " NO " + "если хотите выйти ");

        }
    }

    public static int makeCoffee(int count) {return count * Drinks.COFFEE_PRICE;}

    public static int makeTea(int count) {return count * Drinks.TEA_PRICE;}

    public static int makeLemonade(int count) {return count * Drinks.LEMONADE_PRICE;}

    public static int makeMojito(int count) {return count * Drinks.MOJITO_PRICE;}

    public static int makeWater(int count) {return count * Drinks.WATER_PRICE;}

    public static int makeCocaCola(int count) {return count * Drinks.COLA_PRICE;}


    public static int getNumber() {
        System.out.println("Выбирете количество :");
        while (true) {
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                return n;
            } else {
                System.out.println("Entered the number ");
                System.out.println("Wrong input");
                scanner.next();

            }
        }
    }

}
