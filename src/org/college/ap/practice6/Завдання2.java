package org.college.ap.practice6;

import java.util.Scanner;

public class Завдання2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Напиши количество углов в многоугольнике");

        int n = sc.nextInt();
        int[] x = new int[n];

        System.out.println("Введите углы многоугольника:");

        for (int i = 0; i < n; i++) {
            System.out.print("Угол " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {  // <---- исправлено
            sum += x[i];
        }

        int formul = 180 * (n - 2);

        System.out.println("Сумма углов = " + sum);
        System.out.println("По формуле 180*(n-2) = " + formul);

        if (sum == formul) {
            System.out.println("Такой многоугольник МОЖЕТ существовать.");
        } else {
            System.out.println("Такой многоугольник НЕ может существовать.");
        }

        sc.close();
    }
}
