package com.example.lesson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class classwork2 {
    public static void main(String[] args) {
        // System.out.println(altCharacters(10, '!', '+'));
        // System.out.println(compress("aaaabbbccd"));
        // file();

        seminar3task1();

    }

    private static String altCharacters(int length, char c1, char c2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                builder.append(c1);
            } else {
                builder.append(c2);
            }
        }
        return builder.toString();
    }

    private static String compress(String str) {
        int count = 1;
        StringBuilder builder1 = new StringBuilder();
        builder1.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count = count + 1;
            } else {
                builder1.append(count);
                builder1.append(str.charAt(i));
                count = 1;
            }
        }
        builder1.append(count);
        return builder1.toString();
    }

    // Напишите метод, который составит строку, состоящую из 100 повторений слова
    // TEST и метод,
    // который запишет эту строку в простой текстовый файл, обработайте исключения.
    private static String repeatTest(String word, int count) {
        return word.repeat(count);
    }

    private static void file() {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            String text = repeatTest("TEST", 100);
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
    /* Реализовать консольное приложение, которое в цикле:
Принимает от пользователя строку вида 
text~num
Нужно разделить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
    public static void seminar3task1(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> strings = new LinkedList<>();
        while(true) {
            System.out.printf("Введите текст в формате ТЕКСТ - индекс где индекс <= %d", strings.size());
            System.out.println();

            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("quit")) break;
            String[] parts = userInput.split("-");

            if (parts.length != 2) throw new IllegalStateException("некорректный ввод");
            if (parts[0].equals("print")){
                System.out.println(strings.remove(Integer.parseInt(parts[1])));
            }
            else{
                strings.add(Integer.parseInt(parts[1]),parts[0]);
            }
            System.out.println(strings);
        }
        scanner.close();
    }
}


