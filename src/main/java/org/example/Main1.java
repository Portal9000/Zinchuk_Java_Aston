package org.example;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        // Exercise 1
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите любое число (отделение дробной части необходимо проводить через запятую): ");
        try {
            Double x = in.nextDouble();
            if (x > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            System.out.println("Введено не число.");
        }
        in.close();
    }
}