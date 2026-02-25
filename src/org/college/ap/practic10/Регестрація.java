package org.college.ap.practic10;

import java.util.Scanner;
import java.util.ArrayList;

public class Регестрація {

    static ArrayList<String> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void menu (String[] args) {
        while (true) {
            showMenu();
            String choice = readLine("Оберіть дію: ");

            switch (choice) {
                case "1":
                    addUser();
                    break;
                case "2":
                    removeUser();
                    break;
                default:
                    System.out.printf("Невірний вибір!\n");
            }
        }
    }

    public static void showMenu() {
        System.out.println("----- МЕНЮ -----");
        System.out.println("1 - Додати користувача");
        System.out.println("2 - Видалити користувача");
    }

    public static void addUser() {
        String login = login();
        String password = password();

        users.add(login);
        System.out.printf("Користувача додано!\n");
    }

    public static void removeUser() {
        String login = readLine("Введіть логін для видалення: ");

        if (users.remove(login)) {
            System.out.printf("Користувача видалено.\n");
        } else {
            System.out.printf("Користувача не знайдено.\n");
        }
    }

    public static String login (){
        String usLog = sc.nextLine();

        System.out.println("Введіть логін (не менше 5-ти символів):");

        //перевірка на пробіли та пусте поле у логіні
        while (true) {
            try {

                if (usLog.isBlank()) {
                    throw new IllegalArgumentException("Помилка: Поле пусте, або містить тільки пробіли");
                }
                if (usLog.contains(" ")) {
                    throw new IllegalArgumentException("Помилка: Поле містить пробіли");
                }
                if (usLog.length() < 5) {
                    throw new IllegalArgumentException("Помилка: поле має бути не менше ніж в 5 символів");
                }
                return usLog;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.printf("Повторіть спробу.\n");
            }

        }
    }

    public static String password() {
        String usPassword = sc.nextLine();

        System.out.println("Введіть пароль (не менше 10-ти символів. Тільки на лотиіні!):");

        //перевірка на пробіли та пусте поле у паролі
        while (true) {
            try {

                if (usPassword.isBlank()) {
                    System.out.println("Помилка: Поле пусте, або містить тільки пробіли");
                }
                if (usPassword.contains(" ")) {
                    throw new IllegalArgumentException("Помилка: Поле містить пробіли");
                }
                if (usPassword.length() < 10) {
                    throw new IllegalArgumentException("Помилка: поле має бути не менше ніж в 10 символів");
                }

                String lower = usPassword.toLowerCase();

                if (lower.contains("admin") ||
                        lower.contains("pass") ||
                        lower.contains("password") ||
                        lower.contains("qwerty") ||
                        lower.contains("ytrewq")) {

                    throw new IllegalArgumentException("Ошибка: строка содержит запрещённые слова!");
                }

                int digitCount = 0;
                int specialCount = 0;

                for (int i = 0; i < usPassword.length(); i++) {
                    char ch = usPassword.charAt(i);

                    if (Character.isDigit(ch)) {
                        digitCount++;
                    } else if (Character.isLetter(ch)) {
                        // проверяем, что буквы только английские
                        if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                            throw new IllegalArgumentException("Ошибка: только английские буквы!");
                        }
                    } else if (!Character.isLetterOrDigit(ch)) {
                        specialCount++;
                    }
                }

                if (digitCount < 3) {
                    throw new IllegalArgumentException("Ошибка: минимум 3 цифры!");
                }

                if (specialCount < 1) {
                    throw new IllegalArgumentException("Ошибка: минимум 1 специальный символ!");
                }

                return  usPassword;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.printf("Повторіть спрообу.\n");
            }
        }
    }
    public static String readLine(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
