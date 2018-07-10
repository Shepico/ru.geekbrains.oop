package lesson1;

public class LessonOneClass {
    public static void main(String[] args) {
        itemTwo();
        itemThree();
        itemFour();
        itemFive(0);
        itemSix();
        itemSeven("Павел");
        itemEightStar(1996); // 2000 - каждый сотый, каждый 400 не подобрал, но должно работать 
    }
// Второй пункт
    public static void itemTwo() {
        byte a = 127;
        short b = 32767;
        int c = 2147482647;
        long d = 865732211133L;
        float e = 120.52f;
        double f = 120.3111212;
        boolean g = true;
        char h = 'c';
    }
// Третий пункт
    public static void itemThree() {
        float result;
        result = itemThreeCalculate(1f,25.12f, 11.3f,4f);
        System.out.println("Пункт 3. Результат = " + result);
    }

    public static float itemThreeCalculate(float a, float b, float c, float d) {
        return (a*(b + (c /d)));
    }
// Четвертый пункт
    public static void itemFour(){
        boolean result;
        result = itemFourTrue(5,7);
        System.out.println("Пункт 4. Результат = " + result);
    }

    public static boolean itemFourTrue(int a, int b){
        int summa = a + b;
        if (summa > 9 && summa <21) {
            return true;
        }
        return false;
    }
// Пятый пункт
    public static void itemFive(int a){
        if (a<0){
            System.out.println("Пункт 5. Число отрицательное");
        }else {
            System.out.println("Пункт 5. Число положительное");
        }

    }
// Шестой пункт
    public static void itemSix(){
        byte a = -5;
        boolean result;
        result = itemSixBool (a);
        System.out.println("Пункт 6. Результат = " + result);
    }

    public static boolean itemSixBool(byte a){
        if (a<0){
            return true;
        }
        return false;
    }

// Седьмой пункт
    public static void itemSeven(String str) {
        System.out.println("Пункт 7. Привет, " + str);
    }
// Восьмой пункт
    public static void itemEightStar( int year){
        int modResultFour = year % 4; //каждый четвертый
        int modResultFour100 = (year / 4) % 100; //Проверяем не 100 ли, не високосный
        int modResultFour400 = (year / 4) % 400; //Проверяем не 400 ли, високосный
        if ((modResultFour == 0 && modResultFour100 != 0) || (modResultFour400 == 0)) {
            System.out.println("Пункт 8. Это високосный год");
        } else {
            System.out.println("Пункт 8. Это не високосный год");
        }

    }
}


