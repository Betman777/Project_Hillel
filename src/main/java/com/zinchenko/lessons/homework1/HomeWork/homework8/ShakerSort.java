package com.zinchenko.lessons.homework1.HomeWork.homework8;

import java.util.Arrays;

public class ShakerSort {
    public static void main (String[] args) {

        int[] massive = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) ((Math.random() * 10) - 5);

        }
        System.out.print(Arrays.toString(massive));

        int left = 1;
        int right = massive.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (massive[i - 1] > massive[i]) {
                    int temp = massive[i];
                    massive[i] = massive[i - 1];
                    massive[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (massive[i - 1] > massive[i]) {
                    int temp = massive[i];
                    massive[i] = massive[i - 1];
                    massive[i - 1] = temp;
                }
            }

            right--;
        } while (left <= right);
        for (int i = 0; i < massive.length; i++) {


        }
        System.out.print(Arrays.toString(massive));

    }
}