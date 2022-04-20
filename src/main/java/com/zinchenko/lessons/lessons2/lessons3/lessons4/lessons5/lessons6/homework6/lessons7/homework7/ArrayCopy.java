package com.zinchenko.lessons.lessons2.lessons3.lessons4.lessons5.lessons6.homework6.lessons7.homework7;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] source = new int[]{45, 22, 11, 6};
        int[] target = new int[]{1, 2, 11, 9};
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
        target = sourceNew(target, source);
        System.out.println(Arrays.toString(target));
    }

    public static int[] sourceNew(int[] target, int[] source) {
        int[] result = new int[target.length + source.length];
        for (int i = 0; i < target.length; i++) {
            result[i] = target[i];
        }
        for (int i = 0; i < source.length; i++) {
            result[target.length + i] = source[i];
        }
        return result;

    }


}






