package com.example.lesson;
import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
    }

    public static void task1() { // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
                                 // чисел от 1 до n)
        int n = 6;
        System.out.println(n * (n + 1) / 2);
    }

    public static void task2() { // Вывести все простые числа от 1 до 1000
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = i > 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }

    public static void task3() { // Реализовать простой калькулятор
        System.out.println(" Введите выражение используя пробел в качестве делителя: ");
        String name = new Scanner(System.in).nextLine();
        String[] parts = name.split(" ");
        char operation = parts[1].charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = Integer.valueOf(parts[0]) + Integer.valueOf(parts[2]);
                break;
            case '-':
                result = Integer.valueOf(parts[0]) - Integer.valueOf(parts[2]);
                break;
            case '*':
                result = Integer.valueOf(parts[0]) * Integer.valueOf(parts[2]);
                break;
            case '/':
                result = Integer.valueOf(parts[0]) / Integer.valueOf(parts[2]);
                break;
        }
        System.out.println(name + " = " + result);
    }
}