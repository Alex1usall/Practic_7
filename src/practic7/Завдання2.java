package practic7;

import java.security.SecureRandom;
import java.util.Arrays;
import java.lang.Math;
public class Завдання2 {
    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();

        int row = 3;
        int colw = 3;
        double [][] array = new double [row][colw]; // создаем массив размером 3х3

        System.out.println("Массив:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colw; j++) {
                array[i][j] = sr.nextDouble(100); // заполняем массив рандомными числами

            }
            System.out.println(Arrays.toString(array[i])); // выводим массив
        }

        System.out.println("Исправленный массив:");
        for  (int i = 0; i < row; i++) {
            for (int j = 0; j < colw; j++) {

                if (i % 2 == 1 || j % 2 == 1) {
                    array[i][j] = Math.sqrt(array[i][j]); /* проверяем, если значение
                    имеет парный парное значение в ряде или в столбце*/
                }

            }
            System.out.println(Arrays.toString(array[i])); // выводим исправленный массив
        }




    }
}
