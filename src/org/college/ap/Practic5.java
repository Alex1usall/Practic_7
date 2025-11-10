package org.college.ap;

import java.lang.Math;
import java.security.SecureRandom;

public class Practic5 {


    // Завдання 1 варіант 16
    public static final double A = 9.6; // Константа А
    public static final double B = 8.2; //Константа В
    public static final double C = 2; // Константа С
    public static final double K = 0.7; //Константа К
    public static final double E = Math.E; // Константа число Эйлера

    public static void main(String[] args) {

    double powC = Math.pow(C, 2) ; // Число C в квадрате
    double AC = (A + powC); // А + С в квадрате
    double logAC = Math.log(AC); // Логорифм АС

    double r = C/B; // деление числа С на число В
    double sinR = Math.sin(r); // синус деления С на В

    double X = logAC + sinR; // Логорифм АС + Синус СВ

    System.out.println(X);



    double kc = -1*K*C; // Число -КС
    double E_kc = Math.pow(E,kc); // Число Е в степени -КС
    double Z = Math.sqrt(C+A); // корень из СА
    double I = Math.abs(C+B); // модуль СВ
    double F = Math.sqrt(I); // корень модуля СВ
    double N = C+Z; // Число С + корень из СА
    double M = C - F; // Число С - корень модуля СВ
    double G = N/M; // (С + корень модуля СВ) + (С - корень модуля СВ)

    double Y = E_kc * G; // Число Е в степени -КС * (С + корень модуля СВ) + (С - корень модуля СВ)
    System.out.println(Y);


    //Завдання 2 варіант 16
        SecureRandom rand = new SecureRandom();
        double f = 0;
        double x = rand.nextDouble(7.001);
        double a = rand.nextDouble(100);
        double b =  rand.nextDouble(100);

        if (x >= 0 && x < 1) {
            f = Math.sin(x + 1);
            System.out.println("При x є [0;1) f(x) = " + f);
        }
        else if (x >= 1 && x < 7) {
            double z = Math.pow(x, 2);
            f = a * z + 2 * b * x - 4;
            System.out.println("При x є[0;7) f(x) = " + f);
        }
        else if (x == 7 ) {
            double y = a*x+b;
            f = Math.pow(y, -1);
            System.out.println("При x=7 f(x) = " + f);
        }
        System.out.format("Итог: f(%.3f) = %.5f%n", x, f);
    }
}
