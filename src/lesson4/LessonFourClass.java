package lesson4;

import java.util.Random;
import java.util.Scanner;

public class LessonFourClass {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static char[][] map;

    static final char DOT_EMPTY = '*';
    static final char DOT_PLAYER = 'X';
    static final char DOT_BOT = 'O';

    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            stepPlayer();
            printMap();
            if (checkWin(DOT_PLAYER)) {
                System.out.println("Вы победили");
                break;
            }
            if (checkMapFull()) {
                System.out.println("Ничья");
                break;
            }
            stepBot();
            printMap();
            if (checkWin(DOT_BOT)) {
                System.out.println("Победил соперник");
                break;
            }
            if (checkMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }
        }
    }

    public static void printMap() {
        for (int i=0; i<=SIZE; i++) {
            System.out.printf("%2s", i);
        }
        System.out.println();
        for (int i=0; i<SIZE; i++){
            System.out.printf("%2s",i+1);
            for (int j=0; j<SIZE; j++) {
                System.out.printf("%2s",map[i][j]);
            }
            System.out.println();
        }
    }

    public static void stepPlayer () {
        int x;
        int y;
        do {
            System.out.println("Введите свой ход в формате X Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        } while (!checkStep(x,y));
        map[x][y] = DOT_PLAYER;
    }

    public static boolean checkStep (int x, int y) {
        if (x>=0 & y>=0 & x < SIZE & y < SIZE) {
            if (map[x][y] == DOT_EMPTY) {
                return (true);
            }
        }
        return (false);
    }
    //
    public static void stepBot(){
        int x;
        int y;

        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while(!checkStep (x,y));
        map[x][y] = DOT_BOT;
        System.out.println("БОТ сходил Стр=" + (x+1) + " Кол=" + (y+1));

    }

    //

    public static boolean checkWin (char dot){
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                if (checkLine(i, j, 1, 0, dot) || checkLine(i, j, 0, 1, dot) || checkLine(i, j, 1, 1, dot) || checkLine(i, j, 1, -1, dot)) {
                    return true;
                }
            }
        }
        return (false);
    }

    public static boolean checkLine(int cx, int cy, int vx, int vy, char dot) {
        //Уход за пределы поля
        if (cx + vx * DOTS_TO_WIN - 1 > SIZE - 1 || cy + vy * DOTS_TO_WIN - 1 > SIZE - 1 || cy + vy * DOTS_TO_WIN - 1 < 0) {
            return false;
        }

        //Проверка постройки линии
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cx + i * vx][cy + i * vy] != dot) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkMapFull() {
        for(int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return (false);
                }
            }
        }
        return (true);
    }
}