package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        game();

    }
    static void game() {
        int exit = 1;
        while (exit == 1) {
            Scanner scannerExit = new Scanner(System.in);
            System.out.println("-----------Print 1 to START-----------");
            System.out.println("-----------Print 0 for Exit-----------");
            exit = scannerExit.nextInt();
            if (exit == 1) {
                Random randomNumber = new Random();
                int randomNum = randomNumber.nextInt(9);
                System.out.println("Угадайте число от 1 до 10" + "\n" + "У вас 3 попытки");
                for (int times = 0; times < 3; times++) {
                    Scanner scanner = new Scanner(System.in);
                    int input = scanner.nextInt();
                    if (randomNum == input) {
                        System.out.println("Вы Выграли!!!");
                        break;
                    } else if (randomNum > input) {
                        System.out.println("Загадоное число больше");
                    } else if (randomNum < input) {
                        System.out.println("Загадоное число Меньше");
                    }
                    if (times == 2 && input != randomNum) {
                        System.out.println("ВЫ проиграли((");
                    }
                }
            }else if (exit==0){
                break;
            }
            else {
                System.out.println("Incorrect Input");
            }

        }
    }
}
