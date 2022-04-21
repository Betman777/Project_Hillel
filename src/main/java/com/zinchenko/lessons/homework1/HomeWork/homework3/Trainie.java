package com.zinchenko.lessons.homework1.HomeWork.homework3;

public class Trainie {
    public static void main(String[] args) {
/*
        int a = 2;
        int b = 5;
        int c = 15;

        double d = 44.54;
        double d2 = 44.44;

        ;

       // System.out.println(Math.round(d2));//метод округляет дабл и флоат
        int a1 = 0;
        int a2 = 20;

       System.out.println(a1 +(int)(Math.random()*a2));
      System.out.println(a1 +(int)(Math.random()*a2));
      System.out.println(a1 +(int)(Math.random()*a2));

        System.out.println(a1 +(int)(Math.random()*a2));//генерится  от 10 до 30

        System.out.println(new Random().nextInt(a2));
        System.out.println(new Random().nextInt(a2));
        System.out.println(new Random().nextInt(a2));
        System.out.println(new Random().nextInt(a2));//рандомные числа
*/
// ПРАКТИКА
     //   a. |a - b| / (a+ b)3 - ^c
        // b. (a + b) / 12 * c % 4 + |b|

        //c.Расчет зарплаты
       // i.
        //Дано: зарплаты трех работников за 1 месяц ( a,b,c)
        //i1.
        //Рассчитать:
        //1. для каждого работника сумму зарплаты за 10 лет
        //2.вычесть 5% налог
        //3. посчитать среднее арифметическое по трем суммам за 10 лет
        //4.вывести суммы зарплат за 10 лет с учетом вычета налогов и среднего арифметического
        //

        //
//        int a = 2;
//        int b = -3;
//        int c = 16;
//
//        double result = Math.abs(a-b) / (a+b) * 3 - Math.sqrt(c);
//        System.out.println(result);
//        System.out.println(Math.abs(a-b));
//        System.out.println(Math.abs(a-b) / (a+b));
//        System.out.println(Math.abs(a-b) / (a+b)*3);
//        System.out.println(Math.abs(a-b) / (a+b) * 3 - Math.sqrt(c));
//
//        System.out.println();
//
//        double result2 = (a+b) / 12 * c % 4 + Math.abs(b);
//        System.out.println((a+b));
//        System.out.println((double) (a+b)/12);
//        System.out.println((double) (a+b)/12 * c);
//        System.out.println((double) (a+b)/12 * c % 4);
//        System.out.println((double) (a+b)/12 * c % 4 + Math.abs(b));
//
//        System.out.println();
//
//        double salary1 = 500;
//        double salary2 = 1500;
//        double salary3 = 3500;
//
//        double salary1For10Years  = salary1 * 120;
//        double salary2For10Years  = salary2 * 120;
//        double salary3For10Years  = salary3 * 120;
//
//        System.out.println(salary1For10Years);
//        System.out.println(salary2For10Years);
//        System.out.println(salary3For10Years);
//
//        double salary1For10YearsWhisOutTax = salary1For10Years - salary1For10Years*0.05;
//        double salary2For10YearsWhisOutTax = salary2For10Years - salary2For10Years*0.05;
//        double salary3For10YearsWhisOutTax = salary3For10Years - salary3For10Years*0.05;
//
//        double sum = salary1For10YearsWhisOutTax+salary2For10YearsWhisOutTax+salary3For10YearsWhisOutTax;
//        double avg = (salary1For10YearsWhisOutTax+salary2For10YearsWhisOutTax+salary3For10YearsWhisOutTax)/3;
//        System.out.println(sum);
//        System.out.println(avg);
//
//        System.out.println();
//        System.out.println();
        // d. Дети слепили снеговика из трех идеальных форм шаров снега.Шары
        //получились радиусами 1м, 0.5м, 0.2м. Учитывая что коэфициент плотности снежных шаров равен 0.7 кг/м3
        //найти сколько весит снеговик

        float ball1 = 1f;
        float ball2 = 0.5f;
        float ball3 = 0.2f;
final float DESTINY_FACTOR = 0.7f;
//4/3* 3.14 * r^3
double volumeBall1 =(double) 4/3 * Math.PI * Math.pow(ball1,3);
double volumeBall2 = (double) 4/3 * Math.PI * Math.pow(ball2,3);
double volumeBall3 =(double) 4/3 * Math.PI * Math.pow(ball3,3);
        System.out.println(volumeBall1);
        System.out.println(volumeBall2);
        System.out.println(volumeBall3);

        double wightball = (volumeBall1+volumeBall2+volumeBall3)*DESTINY_FACTOR;
        System.out.println(wightball);



    }
}
