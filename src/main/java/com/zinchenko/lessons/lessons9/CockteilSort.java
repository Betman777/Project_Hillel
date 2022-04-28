package com.zinchenko.lessons.lessons9;

import java.util.Arrays;

public class CockteilSort {
    public static void main(String[] args) {
        int[] array = createArray(5);
        int[] newArray = myNewCopyArray(array);
        System.out.println("Origin massive" + Arrays.toString(array));
        System.out.println("Copy massive" + Arrays.toString(newArray));
        System.out.println("Coctail sort " + Arrays.toString(coctailSort(newArray)));
    }

    public static int[] coctailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int j = start; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (array[k] < array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    swapped = true;

                }
            }
            start++;
            if (!swapped) {
                break;
            }
        }return array;
    }

    public static int[] myNewCopyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] createArray(int length) {
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = (int) (Math.random() * 11);

        }return myArray;


    }
}