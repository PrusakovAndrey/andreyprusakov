package com.example.lesson;

import java.util.Arrays;

/*Во фразе "Добро пожаловать на курс по Java" 
переставить слова в обратном порядке. */
public class stringSplit {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] words = s.split(" ");
        String[] newWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            newWords[words.length-1-i] = words[i];
        }
        
        
        System.out.println(Arrays.toString(newWords));
        
        
        
    }
}
