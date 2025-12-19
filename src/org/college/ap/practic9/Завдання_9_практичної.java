package org.college.ap.practic9;

import java.util.Scanner;
public class Завдання_9_практичної {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Введите нормер функции, которую хотите использовать (1,2,3): ");


            String useStr = sc.nextLine();
            String b;

            if (useStr.equals("1")) {
                b = split();
                System.out.println(b);
            } else if (useStr.equals("2")) {
                b = reversal();
                System.out.println(b);
            } else if (useStr.equals("3")) {
                b = rtSplit();
                System.out.println(b);
            }

            sc.close();

    }

    public static String split() {
        Scanner sc = new Scanner(System.in);

        String input;

        examination:
        do {
            int i = 0;
            System.out.println("Введіть нове значення:");
            input = sc.nextLine();
            String[] words = input.trim().split(" ");

            if (words.length >= 2) {


                for (String word : words) {
                    if (word.length() >= 3) {
                        i++;

                    }
                    if (i >= 2){
                        break  examination;
                    }
                }
            }
        }
        while (true);

        return input;
        //треба зробити через мітку :(
        // я зробив через мітку :)
    }

    public static String reversal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите рядок, чтоб его перевернуть:");

        String input = sc.nextLine();
        String rT =  new StringBuilder(input).reverse().toString();

        return rT;
    }

    public static String rtSplit(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку, чтоб перевернуть в ней слова:");
        String input = sc.nextLine();

        String [] words = input.trim().split(" ");
        StringBuilder rt = new StringBuilder();

        for (String word : words){
            rt.append(new StringBuilder(word).reverse()).append(" ");
        }

        return rt.toString().trim();
    }

}

