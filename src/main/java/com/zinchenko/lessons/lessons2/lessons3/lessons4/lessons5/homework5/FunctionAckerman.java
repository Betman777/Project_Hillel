package com.zinchenko.lessons.lessons2.lessons3.lessons4.lessons5.homework5;

public class FunctionAckerman {
    public static void main(String[] args) {
        int a;
        a = getA(2, 5);
        System.out.println(a);
    }

    public static int getA(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return getA(m - 1, 1);
        } else {
            return getA(m - 1, getA(m, n - 1));

        }
    }
}

