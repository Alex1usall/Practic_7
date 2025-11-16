package org.college.ap.practice6;

import java.util.Scanner;
import java.security.SecureRandom;
public class Завдання3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();

        System.out.println("Введи сколько значений хочешь в массиве");
        int a = sc.nextInt();

        int [] b = new int [a];

        System.out.println("Твой массив:");
        for (int i = 0; i < b.length; i++){
            b[i] = sr.nextInt(100);
            System.out.println(b[i]);
        }

        System.out.println("Введи индекс числа, котороое хочешь изменить");
        int x = sc.nextInt();

        System.out.println("Введи число на которое хочешь поменять значение");
        b[x] = sc.nextInt();
        System.out.println("Значение массива изменено успешно");

        System.out.println("Измененный массив");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

    sc.close();
    }
}
