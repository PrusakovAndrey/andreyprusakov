package com.example.lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) throws FileNotFoundException {
        // task1();
        // task2();
        task3();
    }

    public static void task1() throws FileNotFoundException {
        String path = "HW2_task1.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String baseLine = scanner.nextLine();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < baseLine.length(); i++) {
            if (baseLine.charAt(i) != '{'
                    && baseLine.charAt(i) != '}'
                    && baseLine.charAt(i) != '"'
                    && baseLine.charAt(i) != ' ') {
                char t = baseLine.charAt(i);
                line.append(t);
            }
        }
        String newLine = line.toString();
        String[] tVal = newLine.split("[ : \\ ,]");
        ArrayList<String> criterias = new ArrayList();
        ArrayList<String> values = new ArrayList();
        for (int i = 0; i < tVal.length; i++) {
            if (i % 2 == 0) {
                criterias.add(tVal[i]);
            } else {
                values.add(tVal[i]);
            }
            scanner.close();
        }

        StringBuilder result = new StringBuilder("SELECT * FROM students WHERE ");

        for (int i = 0; i < values.size(); i++) {
            Boolean check = values.get(i).equals("null");
            if (check == false) {
                result.append(criterias.get(i) + " = '" + values.get(i) + "' ");
            }
        }
        System.out.println(result);
    }

    public static void task2() {// Реализуйте алгоритм сортировки пузырьком числового массива, результат после
                                // каждой итерации запишите в лог-файл.
        int[] arr = new int[] { 4, 3, 1, 3, 2, };
        try (FileWriter fw = new FileWriter("HW2_task2.txt", false)) {
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    try (FileWriter fw = new FileWriter("HW2_task2.txt", true)) {
                        fw.write(Arrays.toString(arr) + "\n");
                        fw.flush();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }


    public static void task3() throws FileNotFoundException {
        String path = "HW2_task3.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String baseLine = scanner.nextLine();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < baseLine.length(); i++) {
            if (baseLine.charAt(i) != '{'
                    && baseLine.charAt(i) != '}'
                    && baseLine.charAt(i) != '"'
                    && baseLine.charAt(i) != '['
                    && baseLine.charAt(i) != ']'
                    && baseLine.charAt(i) != ' ')
            {
                char t = baseLine.charAt(i);
                line.append(t);
            }
        }
        String newLine = line.toString();
        String[] tVal = newLine.split("[ : \\ ,]");
        ArrayList<String> student = new ArrayList();
        ArrayList<String> mark = new ArrayList();
        ArrayList<String> subject = new ArrayList();
        for (int i = 1; i < tVal.length; i=i+6) {
            student.add(tVal[i]);
        }
        for (int i = 3; i < tVal.length; i=i+6) {
            mark.add(tVal[i]);
        }
        for (int i = 5; i < tVal.length; i=i+6) {
            subject.add(tVal[i]);
        }
            scanner.close();
            System.out.println(student);
            System.out.println(mark);
            System.out.println(subject);
            
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < student.size(); i++) {
                    result.append("Студент "+ student.get(i) + " получил " + mark.get(i) + " по предмету " + subject.get(i)+"\n");
                }
                System.out.println(result);
            }
        }

