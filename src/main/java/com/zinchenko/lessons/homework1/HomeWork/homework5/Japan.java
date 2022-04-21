package com.zinchenko.lessons.homework1.HomeWork.homework5;
//        В Японии числа 4 и 9 считаются несчастливыми. Вам нужно пронумеровать
//        100 космических шаттлов для перевозки людей на Марс так, чтобы в
//        номерах шаттлов не попадалось несчастливых чисел. Напишите функцию,
//        которая выводит все номера таких шаттлов.

// 1 2 3 5 6 7 8 10 11 145


// 40- 49
// 14
// 54
// 90 - 91
class Japan {
    public static void main(String[] args) {
        getShuttleNumber();

    }

    public static void getShuttleNumber() {
        int countShuttle = 0;
        int number;
        while (countShuttle <= 100) {

            if (((countShuttle == 4)) || (countShuttle == 9) || ((countShuttle % 2) * 4 == 0)
                    || ((countShuttle % 4) * 10 == 0) || (countShuttle / 10 == 4) || (countShuttle / 10 == 9)
                    || ((countShuttle % 9) == 2))
                continue;
            countShuttle++;
            System.out.println("countShuttle = " + countShuttle);
        }


//        public static boolean check ( int number){
//            if ((number = (countShuttle == 4)) || (countShuttle == 9) || ((countShuttle % 2) * 4 == 0)
//                    || ((countShuttle % 4) * 10 == 0) || (countShuttle / 10 == 4) || (countShuttle / 10 == 9)
//                    || ((countShuttle % 9) == 2))
//                return true;

    }
}














