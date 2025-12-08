package org.college.ap.pracric8;

import java.util.Scanner;
public class Завдання1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово, чтоб проверить на палидром");

        String input = sc.nextLine();

        String rT =  new StringBuilder(input).reverse().toString();

        if (input .equals(rT)) {
            System.out.println("Слово есть полидромом");
        }
        else{
            System.out.println("Слово НЕ есть полидромом");
        }

    sc.close();
    }
}