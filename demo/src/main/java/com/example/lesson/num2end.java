package com.example.lesson;
import java.util.Arrays;
/*
Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
*/

public class num2end {
    public static void main(String[] args) {
        int[] num = new int[] { 3, 2, 2, 4, 3 };
        int val = 2;

        int[] num2 = new int[num.length];
        int r = num.length;
        int l = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == val) {
                num2[r - 1] = num[i];
                r = r - 1;
            } else {
                num2[l] = num[i];
                l = l + 1;
            }
        }
        System.out.println(Arrays.toString(num2));
    }
}
