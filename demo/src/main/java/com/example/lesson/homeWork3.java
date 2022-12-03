package com.example.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class homeWork3 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
    }

    // Реализовать алгоритм сортировки слиянием.
    public static void task1() {
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }
 
    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }
 
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        
        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        
        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    // Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
    public static void task2() {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);
        listInt.add(8);
        listInt.add(9);
        listInt.add(0);

        // listInt.removeIf(i -> (i > 5));
        for (int i = 0; i < listInt.size(); i++) {
            if(listInt.get(i) % 2 == 0) listInt.remove(i);
        }
        System.out.println(listInt);
    }

    // Задан целочисленный список ArrayList.
    // Найти минимальное, максимальное и среднее арифметичское этого списка.
    public static void task3() {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(15);
        listInt.add(12);
        listInt.add(13);
        listInt.add(14);
        
        System.out.println("Max = " + Collections.max(listInt));
        System.out.println("Min = " + Collections.min(listInt));
        Integer sum = 0;
        for (Integer d : listInt)
            sum += d;
        System.out.println("Avg = " + sum / listInt.size());
    }

    /*4*. (Необязательная задача повышенной сложности)
    Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
    Разность:
    A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
    B - A = все числа из второй коллекции, которые не содержатся в первой
    Симметрическая разность:
    A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
*/
    public static void task4() {
        Random rnd = new Random();
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arrA.add(rnd.nextInt(10));
        }
        for (int i = 0; i < 9; i++) {
            arrB.add(rnd.nextInt(10));
        }
        
        ArrayList<Integer> a_b = new ArrayList<>();
        ArrayList<Integer> b_a = new ArrayList<>();
        ArrayList<Integer> aAb = new ArrayList<>();

        for (int i = 0; i < arrA.size(); i++) {
            if(arrB.contains(arrA.get(i)) == false && a_b.contains(arrA.get(i)) == false){
                a_b.add(arrA.get(i));
            }
        }
        for (int i = 0; i < arrB.size(); i++) {
            if(arrA.contains(arrB.get(i)) == false && b_a.contains(arrB.get(i)) == false){
                b_a.add(arrB.get(i));
            }
        }
        for (int i = 0; i < a_b.size(); i++) {
            aAb.add(a_b.get(i));
        }
        for (int i = 0; i < b_a.size(); i++) {
            aAb.add(b_a.get(i));
        }
        

        System.out.println(arrA + "\n" + arrB + "\n" + a_b + "\n" + b_a + "\n" + aAb);
    }
}
