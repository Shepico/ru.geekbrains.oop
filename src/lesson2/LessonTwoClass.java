package lesson2;

import java.util.Arrays;

public class LessonTwoClass {
    public static void main(String[] args) {
        zeroForOne();
        arrEight();
        multiplyTwo();
        diagonalSquare();
        minMaxElement();
        checkBalanceResult();
        int []arr={1,2,3,4,5};
        displaceElement(arr, 2);
    }
    //Пункт 1
    public static void zeroForOne () {
        int [] arr = {1, 1, 0, 1, 0, 0, 0, 1};
        System.out.println("Исходный массив - " + Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==0) {
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
        }
        System.out.println("Замененный массив - " + Arrays.toString(arr));
    }

    //Пункт 2
    public static void arrEight () {
        int [] arr = new int [8];
        for (int i=0, j=0; i<8; i++, j+=3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Пункт 3
    public static void multiplyTwo() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив - " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Замененный массив - " + Arrays.toString(arr));
    }
    //Пункт 4
    public static void diagonalSquare () {
        int [][]arr = new int[10][10];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if ((i==j) || (i+j==arr[i].length-1)){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = 0;
                }
            }
        }
        //вывод
        /*for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
    }
    //Пункт 5
    public static void minMaxElement() {
        int [] arr = {1, 5, 3, 24, 11, 4, 5, -2, 4, 8, 9, 1};
        int min=0, max=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min) {
                min=arr[i];
            }else if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min - "+min);
        System.out.println("Max - "+max);
    }

    //Пункт 6
    public static void checkBalanceResult(){
        boolean res;
        int [] arr={2, 1, 4, 4, 6, 2, 3};
        res = checkBalance(arr);
        System.out.println(res);
    }

    public static boolean checkBalance(int []arr) {
        int fullSumm=0;
        int leftSumm=0;
        for (int i=0; i<arr.length; i++){
            fullSumm = fullSumm + arr[i];
        }
        for (int i=0; i<arr.length; i++){
            leftSumm = leftSumm + arr[i];
            if (leftSumm == fullSumm - leftSumm) {
                return true;
            }
        }
        return false;
    }

    //Пункт 7
    public static void displaceElement (int []arr, int pos){
        int oldElement=0;
        if (pos < 0) {
            for (int n=0; n>pos; n--) {
                oldElement = arr[0];
                for (int i=0; i<arr.length; i++) {
                    if ( i == arr.length-1) {
                        arr[i] = oldElement;
                    } else {
                        arr[i] = arr[i+1];
                    }
                }
            }
        } else if (pos > 0) {
            for (int n=0; n<pos; n++) {
                oldElement = arr[arr.length-1];
                for (int i=arr.length-1; i>=0; i--) {
                    if ( i == 0) {
                        arr[i] = oldElement;
                    } else {
                        arr[i] = arr[i-1];
                    }
                }
            }
        }
        System.out.println();
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
