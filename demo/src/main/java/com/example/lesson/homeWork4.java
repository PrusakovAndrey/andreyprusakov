package com.example.lesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.basic.DefaultMenuLayout;

import org.w3c.dom.Node;

public class homeWork4 {
    public static void main(String[] args) {
        // task1();
        // task2();
        task3();
        
    }

    public static void task1() {
        /*
         * Пусть дан LinkedList с несколькими элементами.
         * Реализуйте метод, который вернет “перевернутый” список.
         */

        LinkedList<Integer> ll = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            ll.add(rnd.nextInt(10));
        }
        System.out.println(ll);

        LinkedList<Integer> nll = new LinkedList<>();
        int length = ll.size();
        for (int i = 0; i < length; i++) {
            nll.add(ll.removeLast());
        }
        System.out.println(nll);
        System.out.println(ll);
    }

    public static void task2() {
        /*
         * Реализуйте очередь с помощью LinkedList
         * со следующими методами:
         * enqueue() - помещает элемент в конец очереди,
         * dequeue() - возвращает первый элемент из очереди и удаляет его,
         * first() - возвращает первый элемент из очереди, не удаляя.
         */
        Queue<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(ll);
        System.out.println(enqueue(ll, 91));
        System.out.println(dequeue(ll));
        System.out.println(ll);
        System.out.println(first(ll));
        System.out.println(ll);
    }

    private static Queue<Integer> enqueue(Queue<Integer> list, int n) {
        list.add(n);
        return list;
    }

    private static Integer dequeue(Queue<Integer> list) {
        int n = list.peek();
        list.remove(1);
        return n;
    }

    private static Integer first(Queue<Integer> list) {
        return (list.peek());
    }

    public static void task3() {
        /*
         * Напишите постфиксный калькулятор.
         * Пользователь вводит данные и операции в обратной польской записи.
         * Калькулятор вычисляет результат и проверяет, что в стэке получилось
         * единственное число.
         * Например:
         * 5 4 3 − + => 5 1 + => 6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение = ");
        String userInput = scanner.nextLine();
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < userInput.length(); i++) {
            Character exp = userInput.charAt(i);
            if (Character.isDigit(exp)) {
                st.push(Character.digit(exp, 10));
            } else {
                switch (exp) {
                    case '+':
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case '-':
                        res = st.pop() - st.pop();
                        st.push(res);
                        break;
                    case '*':
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case '/':
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
