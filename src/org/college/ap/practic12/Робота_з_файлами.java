package org.college.ap.practic12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Робота_з_файлами {
    public static void main(String[] args) {
        menu();
    }

    static void menu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("\n1: Запис у файл");
            System.out.printf("\n2: Прочитати файл");
            System.out.printf("\n3: Вихід з меню");

            try {
                int userChoice = scanner.nextInt();
                scanner.nextLine();

                if (userChoice == 1) {
                    write();
                } else if (userChoice == 2) {
                    read();
                } else if (userChoice == 3) {
                    break;
                } else {
                    throw new IllegalArgumentException("Помилка: нелогічний вибір");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.printf("Повторіть спрообу.\n");
            }
        }
    }

    static void write() {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("practice12.txt", true);

            System.out.printf("Введіть текст, який хочете додати до документу:\n");
            String text = sc.nextLine();

            fw.write(text + "\n");
            fw.close();

            System.out.println("Текст додано у файл...");
        } catch (IOException e) {
            System.out.println("Помилка при записуванні текста у файл...");
        }
    }

    static void read() {

        try {
            FileReader fr = new FileReader("practice12.txt");
            Scanner flscanner = new Scanner(fr);

            System.out.printf("\nFile content:\n");
            while (flscanner.hasNextLine()) {
                System.out.println(flscanner.nextLine());
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Помилка при прочитуванні файла...");
        }
    }
}
