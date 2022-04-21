package com.zinchenko.lessons.homework1.HomeWork.homework7;

import java.util.Arrays;

public class Random1 {
    public static void main(String[] args) {
        arrayMaxMin();
    }

    public static void arrayMaxMin() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println("Arrays number : " + Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Maximal element  : " + max + "\n" + " Minimal element : " + min);
    }
}