package org.college.ap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите целое число ...");
        int userID = scanner.nextInt();
        System.out.println("Вы ввели целое число: " + userID);

        System.out.println("Введите целое число с плавающей точкой ...");
        float userFloat = scanner.nextFloat();
        System.out.println("Вы ввели целое число с плавающей точкой: " + userFloat);

        scanner.nextLine();

        System.out.println("Введите строку ...");
        String userInput = scanner.nextLine();
        System.out.println("Вы ввели строку:" + userInput);

        System.out.println("Введите какое-то логиское значение ... (True/False)");
        boolean userBoolean = scanner.nextBoolean();
        System.out.println("Вы ввели логичное значение: " + userBoolean);


        System.out.format("Целое число в десятичном формате: %d%n", userID);
        System.out.format("Число с плавающей точкой в десятичном формате: %.2f%n", userFloat);
        System.out.format("Строка: %-20s%n", userInput);
        System.out.format("Логическое значение: %b%n", userBoolean);


        System.out.format("Целое число в шестнадцатеричном формате: %x%n", userID);



        System.out.format("Целое число с шириной поля 10: %10d%n", userID);
        System.out.format("Число с плавающей точкой с шириной поля 15: %15.3f%n", userFloat);
        System.out.format("Строка с шириной поля 30: %-30s%n", userInput);


        System.out.format("Логическое значение: %b%n", userBoolean);


        scanner.close();
    }
}
