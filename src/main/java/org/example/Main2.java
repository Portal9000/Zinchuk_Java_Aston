package org.example;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        // Exercise 2
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = in.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        in.close();
    }
}
