import java.util.Scanner;
import animals.*;

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

        /*Employee[] perEmployee = new Employee[5];
        perEmployee = createEmployee(perEmployee);
        for (int i=0; i<perEmployee.length; i++) {
            if (perEmployee[i].getAge()>40) {
                perEmployee[i].getFullInfo();
            }
        }*/


    }

   /* public static Employee[] createEmployee(Employee[] arrEmployee) {
        arrEmployee[0] = new Employee("Иванов", "Директор", "1@2.ru", "+79171112222",99900.5f,53);
        arrEmployee[1] = new Employee("Петров", "Бухгалтер", "2@2.ru", "+79171113333",79900.0f,43 );
        arrEmployee[2] = new Employee("Сидоров", "Технолог", "3@2.ru", "+79171114444",79400.3f,39 );
        arrEmployee[3] = new Employee("Игнатов", "Менеджер", "4@2.ru", "+79171115555",59350.0f,33 );
        arrEmployee[4] = new Employee("Соловьева", "Уборщица", "5@2.ru", "+79171116666",29000.0f,62 );
        return (arrEmployee);
    }*/

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
