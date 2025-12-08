package org.college.ap.pracric8;

import java.util.Scanner;
public class Завдання5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст");
        String str = sc.nextLine();

        String bW = "бляха";

        String censor = "[*****]";

        String [] words = str.trim().split("\\s+");

        String result = "";

        for (String w : words) {
            if (w.startsWith("")) {


                if (w.equals ("бляха")) {
                    result += censor + "";
                }
                else {
                    result += w + "";


                }
            }
        }

        System.out.println(result);

        sc.close();

    }
}
