package org.college.ap.pracric8;

import java.util.Scanner;
public class Завдання3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите какой-то текст:");
        String str =  sc.nextLine();

        String [] words = str.trim().split("\\s+");

    String shorter = "";
    String longer = "";

    for (String w : words) {
        if (w.startsWith("")) {

            if (shorter.equals("") || w.length() < shorter.length()) {
                shorter = w;
            }

            if (longer.equals("") || w.length() > longer.length()) {
                longer = w;
            }
        }
    }

        System.out.println("Самое короткое слово: " + shorter);
        System.out.println("Самое длинное слово: " + longer);

        sc.close();
    }

}
