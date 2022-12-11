package com.example.lesson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class homeWork5 {
    public static void main(String[] args) {
        // task1();
        // task2();
    }

    public static void task1() {
        /*
         * Реализуйте структуру телефонной книги с помощью HashMap,
         * учитывая, что один человек может иметь несколько телефонов.
         */

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        ArrayList<String> numbers1 = new ArrayList<String>();
        numbers1.add("1234125");
        numbers1.add("1478124980");
        phoneBook.put("Kate", numbers1);

        ArrayList<String> numbers2 = new ArrayList<String>();
        numbers2.add("89162693379");
        numbers2.add("89162617643");
        phoneBook.put("David", numbers2);

        ArrayList<String> numbers3 = new ArrayList<String>();
        numbers3.add("895555693379");
        phoneBook.put("Migel", numbers2);

        System.out.println(phoneBook);
    }

    public static void task2() {
        /*
         * Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
         * Написать программу, которая найдет и выведет повторяющиеся имена
         * с количеством повторений. Отсортировать по убыванию популярности.
         */
        String s = "Иван, Петр, Альбина, Иван, Маргарита, Альбина, Сергей, Сергей, Иван, Иван, Альбина";
        String[] listOfEmployee = s.split(", ");
        HashMap<String, Integer> collected = new HashMap<>();
        for (int i = 0; i < listOfEmployee.length; i++) {
            collected.putIfAbsent(listOfEmployee[i], 0);
            collected.replace(listOfEmployee[i], collected.get(listOfEmployee[i]) + 1);
        }

        Map<String, Integer> sortedMap = collected.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        for (Map.Entry<String, Integer> entry: sortedMap.entrySet())
             if (entry.getValue() > 1)
                 System.out.println(entry);
        }

    public static void task3() {
        
    }
}
