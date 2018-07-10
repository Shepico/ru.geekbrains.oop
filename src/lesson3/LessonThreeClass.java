package lesson3;

import java.util.Random;
import java.util.Scanner;

public class LessonThreeClass {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String args[]) {
        /*String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic"};
        String strGW = words[rand.nextInt(words.length)];
        boolean res = false;
        res = game(strGW);
        if (res == true) {
            System.out.println("Вы угадали");
        } else System.out.println("Вы не угадали");*/
        game2();
    }

    public static boolean game(String wordGW) {
        String result = "";
        int shot=0;
        //System.out.println(wordGW);
        do {
            shot +=1;
            result = "";
            System.out.print("Введите загаданное слово: - ");
            String wordUser = sc.next();
            if (wordUser.equals(wordGW)) {
                return true;
            }

            int lengthWord = wordGW.length() < wordUser.length() ? wordGW.length() : wordUser.length();
            for (int i = 0; i < lengthWord; i++) {
                if (wordGW.charAt(i) == wordUser.charAt(i)) {
                    result = result + wordGW.charAt(i);
                } else result = result + "#";
            }
            if (result.length() < 16) {
                for (int i = result.length() - 1; i < 15; i++) {
                    result = result + "#";
                }
            }
            System.out.println(result);
        } while (shot < 5);
        return false;
    }

    public static void game2(){
        int qst=1;
        do {
            int mystNum = rand.nextInt(9);
            System.out.println(mystNum);
            for (int i=1; i<4; i++){
                System.out.print("Введите число - ");
                int res = sc.nextInt();
                if (res<mystNum) {
                    System.out.println("Названное число меньше");
                }else if (res>mystNum) {
                    System.out.println("Названное число больше");
                }else {
                    System.out.println("Вы угадали");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1-да, / 0-нет");
            qst = sc.nextInt();
        } while (qst != 0);

    }
}
