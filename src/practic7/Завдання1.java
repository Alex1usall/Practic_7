package practic7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Завдання1 {
    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();

        int x = 5;

        int [][] array = new int [x][]; //створення масиву

        for (int i = 0; i < x; i++) {
            array[i] = new int[i + 1]; // довжина рядка зростає як піраміда
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sr.nextInt(100);
            }
            /* заповнення масиву рандомними значеннями*/

            System.out.println(Arrays.toString(array[i])); // выводим массив
        }

        for  (int i = array.length - 1; i >=0; i--) {
            System.out.println(Arrays.toString(array[i])); // выводим массив в обратном порядке
        }


    }
}
