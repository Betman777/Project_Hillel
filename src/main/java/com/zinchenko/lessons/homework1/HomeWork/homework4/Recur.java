package com.zinchenko.lessons.homework1.HomeWork.homework4;

public class Recur {
    public class Solution {
        public static int recursion(int m, int n) {
            // Базовый случай
            if (m == 0) {
                return n + 1;
            } // Шаг рекурсии / рекурсивное условие
            else if (n == 0 && m > 0) {
                return recursion(m - 1, 1);
            } // Шаг рекурсии / рекурсивное условие
            else {
                return recursion(m - 1, recursion(m, n - 1));
            }
        }

        public static void main(String[] args) {
            System.out.println(recursion(3, 2)); // вызов рекурсивной функции
        }
    }
}
