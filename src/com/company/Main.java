package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //region Задание 1
        int[] arr = {1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //endregion

        //region Звдание 2
        int[] arr2 = new int[8];
        int number = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = number;
            number += 3;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //endregion

        //region Звдание 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        //endregion

        //region Звдание 4
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (j == i) {
                    arr4[i][i] = 1;
                    System.out.print(arr4[i][j] + " ");
                } else if (i == i) {
                    arr4[i][arr4[i].length - 1 - i] = 1;
                    System.out.print(arr4[i][j] + " ");
                } else {
                    arr4[i][j] = 0;
                    System.out.print(arr4[i][j] + " ");
                }
            }
            System.out.println();
        }
        //endregion

        //region Звдание 5 Альтернатива
        //Моё нутро подсказывает мне что вы мне скажете почему не через for
        int[] arr5 = {15, 5, 8, 30, 3, 1, 55};
        System.out.println(Arrays.stream(arr5).max());
        System.out.println(Arrays.stream(arr5).min());
        //endregion


        //region Звдание 5
        int[] arr6 = {15, 5, 8, 30, 3, 1, 55};
        int min = arr6[0];
        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            } else if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("Минимальное значение " + min + "\n" + "Максимальное значение " + max);

        //Вопрос как инициализировать масив при вызове метода
        //У меня НИКАК не получается
        // calculateNum({2,4,5});  не работает     а как??
        calculateNum();
        moveArray(2);

        //endregion
    }




    public static void calculateNum() {
        int[] sixArr = {2, 2, 2, 5, 1};
        int sum1 = 0;
        for (int i = 0; i < sixArr.length; i++) {
            sum1 = sum1 + sixArr[i];
            int sum2 = 0;
            for (int j = i + 1; j < sixArr.length; j++) {
                sum2 = sum2 + sixArr[j];
            }
            if (sum1 == sum2) {
                System.out.println(sum1 + "=" + sum2 + " " + true);
            } else if (sum1 != sum2) {
                System.out.println(sum1 + "≠" + sum2 + " " + false);
            }
        }

    }

    public static void moveArray(int n) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (n < 0) {
            for (int i = 0; i > n; i++) {
                moveArrayLeft(array);
            }


        } else {
            for (int i = 0; i > n; i++) {
                moveArrayRight(array);
            }

        }

    }

    public static void moveArrayRight(int[] input) {
        int number = input[0];
        input[0] = input[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            input[input.length - 1] = input[input.length - i - 1];
        }
        input[1] = number;
    }

    public static void moveArrayLeft(int[] input) {
        int number = input[input.length - 1];
        input[0] = input[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            input[i - 1] = input[i];
        }
        input[input.length - 2] = number;

    }


}