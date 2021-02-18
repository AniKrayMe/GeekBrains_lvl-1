package com.company;



public class Main {
    public static void main(String[] args) {

        calculateFloatNumber(1.5f, 5.2f, 2.5f, 3.5f);
        calculateNum2(10, 5);
        calculateNum3(-6);
        calculateNum4(-5);
        printName("Учиха Мадара");
        calculateGivenYear(2004);

        //region Задание №2
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        float num5 = 2.5f;
        double num6 = 3.5;
        char cr = '&';
        boolean isTrue = true;
        //endregion


    }


    //region Задание №3
    public static void calculateFloatNumber(float a, float b, float c, float d) {
        float result;
        if (d != 0) {
            result = a * (b + (c / d));
            System.out.println(result);
        } else {
            System.out.println("На ноль делить нельзя ");
        }
    }
    //endregion

    //region Задание №4
    public static void calculateNum2(int num1, int num2) {
        int sum = num1 + num2;
        boolean result;
        if (sum >= 10 && sum <= 20) {
            System.out.println(result = true);
        } else {
            System.out.println(result = false);


        }
    }
    //endregion

    //region Задание №5
    public static void calculateNum3(int number) {
        if (number >= 0) {
            System.out.println(number + " Положительное число");
        } else {
            System.out.println(number + " Отрицательное число");
        }

    }

    //endregion

    //region Задание №6
    public static void calculateNum4(int number) {
        boolean result;
        if (number >= 0) {
            System.out.println(result = false);
        } else {
            System.out.println(result = true);
        }

    }

    //endregion

    //region Задание №7
    public static void printName(String name) {
        System.out.println("Привет, " + name);
    }
    //endregion

    //region Задание №8
    public static void calculateGivenYear(int number) {
        if (((number % 4 == 0) && (number % 100 != 0)) || number % 400 == 0) {
            System.out.println(number+" год является високосным");
        }else {
            System.out.println(number + " не является високосным");
        }
    }
    //endregion
}
