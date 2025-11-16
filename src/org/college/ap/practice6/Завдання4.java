package org.college.ap.practice6;

import java.lang.Math;
public class Завдання4 {

    public static void main(String[] args) {

        int count = 0;
        int dg = 0;

        System.out.println("Синусы от 0° до 90°:");

        for (int degree = 0; degree <= 90; degree++) {

            double radians = Math.toRadians(degree);
            double sin = Math.sin(radians);

            System.out.printf(" sin " + dg++ + " = %.4f " + " |", sin);

            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}