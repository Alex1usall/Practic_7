package practic7;

import java.util.Scanner;
import java.security.SecureRandom;

public class Завдання5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();

        System.out.println("Введите размер квадратной матрицы:");
        int n = sc.nextInt();   // Создаем квадратную матрицу

        int[][] array = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sr.nextInt(10); // Заполняем матрицу случайными числами
            }
        }

        System.out.println("Матрица:");
        print(array);


        int[][] transposed = transpose(array);

        System.out.println("Транспонированная матрица:");
        print(transposed); // Создаем транспонированную матрицу

        sc.close();
    }


    static void print(int[][] m) {
        for (int[] row : m) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println(); // Вывод матрицы
        }
    }


    static int[][] transpose(int[][] m) {
        int n = m.length;
        int[][] t = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[j][i] = m[i][j]; // Метод транспонирования
            }
        }
        return t;
    }
}
