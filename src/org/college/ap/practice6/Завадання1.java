package org.college.ap.practice6;

import java.security.SecureRandom;
public class Завадання1 {

    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();
        int[] a = {sr.nextInt(100), sr.nextInt(100), sr.nextInt(100), sr.nextInt(100), sr.nextInt(100)};

        int doubles = 0;
        int undoubles = 0;

        for (int vl : a) {
            if (vl % 2 == 0) {
                doubles++;
            }
            else {
                undoubles++;
            }
        }

        System.out.println("Массив: ");
        for (int x : a ){
            System.out.println(x);
        }

        System.out.println("Количество парных " + doubles);
        System.out.println("Количество не парных " +  undoubles);






    }
}