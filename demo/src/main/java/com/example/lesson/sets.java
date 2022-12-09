package com.example.lesson;

//import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class sets {
    public static void main(String[] args) {
        /* 1. Напишите метод, который заполнит массив из 1000 элементов случайными 
        числами от 0 до 24. 
        2. Создайте метод, в который передайте заполненный выше массив, 
        и с помощью Set вычислите процент уникальных значений в данном массиве, 
        и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных 
        чисел * 100 / общее количество чисел в массиве. */
       
        System.out.println(percentage(arr()) + "%");
    }

public static int[] arr() {
    Random rnd = new Random();
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
        array[i] = rnd.nextInt(25);
    }
    return array;
}

public static double percentage(int[] arr) {
    HashSet<Integer> mySet = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        mySet.add(arr[i]);
    }
    double len = arr.length;
    return (mySet.size()*100/len);
    
}
}
