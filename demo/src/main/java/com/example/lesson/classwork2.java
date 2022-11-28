package com.example.lesson;

import java.io.FileWriter;
import java.io.IOException;

public class classwork2 {
    public static void main(String[] args) {
        System.out.println(altCharacters(10, '!', '+'));
        System.out.println(compress("aaaabbbccd"));
        file();
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
}


// string repa