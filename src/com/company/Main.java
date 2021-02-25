package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final int SIZE = 3;
    static final char DOT_EMPTY = '*';
    static final char DOT_X = 'X';
    static final char DOT_0 = '0';


    public static void main(String[] args) {

        initializeMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)|| checkWin2(DOT_X)) {
                System.out.println("Вы победили");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)|| checkWin2(DOT_0)) {
                System.out.println("Победил Компютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра окончена");
    }


    static void initializeMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
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
        Scanner sc = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void aiTurn() {
        Random rand = new Random();

        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;

    }


    static boolean checkWin(char symb) {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkWin2(char symb) {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == 3) {
                return true;
            }

        }
        return false;
    }

    static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
