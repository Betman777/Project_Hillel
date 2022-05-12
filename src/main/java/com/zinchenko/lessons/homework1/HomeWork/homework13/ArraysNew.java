package com.zinchenko.lessons.homework1.HomeWork.homework13;

public class ArraysNew {


    public double findAverage(int[][]array) {
        int sum = 0;
        int count=0;
        double average;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
                sum += array[i][j];
            }
        }
        average =(double) sum / count;

        return average;
    }

    public boolean isSquare(int[][]arraySquare) {
        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare[i].length; j++) {
                if (arraySquare[i].length != arraySquare[j].length) {
                    return false;
                }
                }

            }return true;

        }
    }