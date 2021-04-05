package lesson4;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static char[][] map;
    public static final int SIZE = 9;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил AI");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена!");

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }


    public static void aiTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean checkWin(char symb) {
       int result = 0;
        for (int offsetX = 0; offsetX <= SIZE - DOTS_TO_WIN; offsetX++) {
            for (int offsetY = 0; offsetY <= SIZE - DOTS_TO_WIN; offsetY++) {

                result = 0;
                for (int i = 0; i < DOTS_TO_WIN; i++) {
                    for (int j = 0; j < DOTS_TO_WIN; j++) {
                        if (map[i+offsetX][j+offsetY] == symb) result++;
                        else result = 0;
                        if (result == DOTS_TO_WIN) return true;
                    }
                }
                result = 0;
                for (int i = 0; i < DOTS_TO_WIN; i++) {
                    for (int j = 0; j < DOTS_TO_WIN; j++) {
                        if (map[j+offsetY][i+offsetX] == symb) result++;
                        else result = 0;
                        if (result == DOTS_TO_WIN) return true;
                    }
                }
                result = 0;
                for (int i = 0; i < DOTS_TO_WIN; i++) {
                    if (map[i+offsetX][i+offsetY] == symb) result++;
                    else result = 0;
                    if (result == DOTS_TO_WIN) return true;

                }
                result = 0;
                for (int i = DOTS_TO_WIN - 1; i >= 0; i--) {
                    if (map[i+offsetX][i+offsetX] == symb) result++;
                    else result = 0;
                    if (result == DOTS_TO_WIN) return true;

                }
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
