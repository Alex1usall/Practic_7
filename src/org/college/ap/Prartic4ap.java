package org.college.ap;

import java.util.Scanner;

//Завдання 1(1)
//public class Prartic4ap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double x, a, b, f;
//        double a;
//        double b;
//        double f;
//        System.out.print("Введіть a: ");
//        a = sc.nextDouble();
//
//        System.out.print("Введіть b: ");
//        b = sc.nextDouble();
//
//        System.out.print("Введіть x: ");
//        x = sc.nextDouble();
//
//        if (x >= 1 && x < 3) {
//            f = 9 / (a * x);
//        } else if (x == 3) {
//            f = Math.abs(a * Math.pow(x, 2) + x + b);
//        } else {
//            f = Double.NaN;
//            System.out.println("x не належить проміжку [1,3]");
//        }
//
//        System.out.println("f(x) = " + f);
//    }
//}

//Завдання 2(1)
//public class Prartic4ap {
//    public static void main(String[] args) {
//        int i = 3210;
//        int j = 123;
//
//        while (i >= j) {
//
//            System.out.format("Реверс числа: %04d%n",  i);
//            i--;
//        }
//    }
//}

//Завдання 3(4) ЧЕСТНО В ЗАГАЛІ НЕ ЗРОЗУМІВ, ЯК ТРЕБА БУЛО ЗРОБИТИ, ТОМУ ГПТ БУВ В ДОПОМОГУ
public class Prartic4ap {
    public static void main(String[] args) {
        int n = 10;

        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.println("    -----------------------------------------");


        for (int i = 1; i <= n; i++) {

            System.out.printf("%2d |", i);

            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

