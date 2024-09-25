package com.epam.rd.autotasks.meetastranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        // Читаємо рядок із System.in
        Scanner scanner = new Scanner(System.in);

        // Читаємо введений рядок
        String input = scanner.nextLine();

        // Виводимо "Hello, <введений рядок>"
        System.out.println("Hello, " + input);

        // Закриваємо сканер
        scanner.close();
    }
}
