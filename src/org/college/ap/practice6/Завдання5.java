package org.college.ap.practice6;

import java.util.Scanner;
import java.security.SecureRandom;
public class Завдання5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();

        System.out.println("Напиши размер массива");
        int size = sc.nextInt();
        int [] a = new int [size];

        System.out.println("Твой массив:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sr.nextInt(100);
            System.out.println(a[i]);
        }

        System.out.println("Напиши в порядок на который проверить массив (Возростание / Убывание)");
        String choose = sc.next();

        sc.nextLine();

        boolean increasing = true;
        boolean decreasing = true;

        for  (int i = 0; i < a.length -1; i++) {
            if (choose.equals ("Убывание")) {

                if (a[i] > a[i+1]) {
                    increasing = false;
                }

                else  {
                    decreasing = false;
                }
            }

            else if (choose.equals("Возрастание")) {
                if (a[i] > a[i+1]) {
                    increasing = false;
                }

                else {
                    decreasing = false;
                }
            }
            else {
                System.out.println("Было введено непонятный ответ. Введит коректный ответ, показаный выше в скобках");
            }
        }


        if (increasing) {
            System.out.println("Массив в порядке возрастания");
        }
        else if (decreasing) {
            System.out.println("Массив в порядке убывания");
        }
        else {
            System.out.println("Массив не имеет порядка");
        }


        sc.close();
    }
}
