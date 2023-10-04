package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        // Exercise 3
        Scanner in = new Scanner(System.in);
        System.out.printf("Укажите размер массива: ");
        int x = in.nextInt();
        int num[] = new int[x];
        for (int i = 0; i < num.length;) {
            System.out.printf("Введите " + (++i) + " элемент массива: ");
            num[i-1] = in.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(num));
        System.out.println("Элементы массива, кратные 3 (при наличии): ");
        for (int value : num) {
            if (value % 3 == 0) {
                System.out.println(value);
            }
        }
        in.close();
    }
}
