//public class my {
//    public static void main(String[] args) {
//        my game = new my();
//        game.startGame();
//    }
//
//
//    static class Player {
//        int number = 0;
//
//        void guess() {
//            number = (int) (Math.random() * 10);
//        }
//    }
//
//
//    void startGame() {
//        Player p1 = new Player();
//        Player p2 = new Player();
//        Player p3 = new Player();
//
//        int guessp1 = 0;
//        int guessp2 = 0;
//        int guessp3 = 0;
//
//        boolean p1W = false;
//        boolean p2W = false;
//        boolean p3W = false;
//
//        int targetNumber = (int) (Math.random() * 10);
//        System.out.println("Я загадал число от 0 до 9");
//
//
//        System.out.println("Число, которое нужно угадать " + targetNumber);
//
//            p1.guess();
//            p2.guess();
//            p3.guess();
//
//            guessp1 = p1.number;
//            guessp2 = p2.number;
//            guessp3 = p3.number;
//
//            System.out.println("Первый игрок думает, что это число " + guessp1);
//            System.out.println("Второй игрок думает, что это число " + guessp2);
//            System.out.println("Третий игрок думает, что это число " + guessp3);
//
//            if (guessp1 == targetNumber) {
//                p1W = true;
//            }
//            if (guessp2 == targetNumber) {
//                p2W = true;
//            }
//            if (guessp3 == targetNumber) {
//                p3W = true;
//            }
//
//            if (guessp1 == targetNumber){
//                System.out.println("В этой игре победил игрок 1");
//                return;
//            }
//            if (guessp2 == targetNumber){
//                System.out.println("В этой игре победил игрок 2");
//                return;
//            }
//            if (guessp3 == targetNumber){
//                System.out.println("В этой игре победил игрок 3");
//                return;
//            }
//
//            else {
//                System.out.println("Никто не угадал. Переигрываем...\n");
//
//            }
//        }
//    }


//import java.security.SecureRandom;
//
//public class my {
//    public static void main(String[] args) {
//        SecureRandom rand = new SecureRandom();
//        int a = rand.nextInt();
//        int b = rand.nextInt(100);
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}