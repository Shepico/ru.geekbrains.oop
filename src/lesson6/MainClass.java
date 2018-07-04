package lesson6;

import java.util.Scanner;
import lesson6.animals.*;

public class MainClass {
    private static Scanner sc = new Scanner(System.in);
    private static Cat[] cats = new Cat[3];
    private static Dog[] dogs = new Dog[3];

    public static void main (String[] args) {
        int action;
        while (true) {
            System.out.print("Введите действие: 1-бег, 2-прыжок, 3-плавание ");
            action = sc.nextInt();
            if (action>0 & action<4) {
                break;
            }
        }
        System.out.println();
        System.out.print("Введите дистанцию - ");
        int distance = sc.nextInt();

        fillArray();
        motionCat(action, distance);
        motionDog(action, distance);

    }

    private static void fillArray() {
       cats[0] = new Cat("barsik", 150, 2);
       cats[1] = new Cat("rygik", 275, 1);
       cats[2] = new Cat("vaska");

       dogs[0] = new Dog("bobik", 300, 0, 8);
       dogs[1] = new Dog("tuzik", 550, 1, 12);
       dogs[2] = new Dog("mars");
   }

   private static void motionCat(int action, int distance) {
       switch (action){
           case 1:{
               for (int i = 0; i < cats.length ; i++) {
                   cats[i].run(distance);
               }
               break;
           }
           case 2:{
               for (int i = 0; i < cats.length ; i++) {
                   cats[i].jumpOver(distance);
               }
               break;
           }
           case 3:{
               for (int i = 0; i < cats.length ; i++) {
                   cats[i].swim(distance);
               }
               break;
           }
       }
   }

    private static void motionDog(int action, int distance) {
        switch (action){
            case 1:{
                for (int i = 0; i < dogs.length ; i++) {
                    dogs[i].run(distance);
                }
                break;
            }
            case 2:{
                for (int i = 0; i < cats.length ; i++) {
                    dogs[i].jumpOver(distance);
                }
                break;
            }
            case 3:{
                for (int i = 0; i < cats.length ; i++) {
                    dogs[i].swim(distance);
                }
                break;
            }
        }
    }


}
