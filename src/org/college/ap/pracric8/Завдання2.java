package org.college.ap.pracric8;

import java.util.Scanner;
public class Завдання2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ведите любую строку:");

        String input = sc.nextLine();
        String rT = "";

//        String rT = new StringBuffer(input).reverse().toString();
//
//        System.out.println(rT);

        /* сдклать вместо StringBuffer черкз .charAt*/

        for  (int i = input.length() - 1; i >= 0; i--) {
            rT += input.charAt(i);
        }
        System.out.println(rT);

        sc.close();
    }
}
