package com.example.lesson;

public class lineInArray {
   
/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], 
вывести максимальное количество подряд идущих 1.
*/
    public static void main(String[] args) {
        int[] num = new int[] {1,1,1,0,0,1,1,1,1,0,1};
        int count = 0, temp = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                temp = temp+1;
            } else {
                if(temp > count){
                    count = temp;
                    temp = 0;
                }
            }
        }
        System.out.println(count);
    }
}

