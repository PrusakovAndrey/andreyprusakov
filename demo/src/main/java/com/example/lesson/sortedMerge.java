package com.example.lesson;

public class sortedMerge {

    public static int[] ch(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int[] temp1 = new int[arr.length / 2];
        System.arraycopy(arr, 0, temp1, 0, arr.length / 2);

        int[] temp2 = new int[arr.length / 2];
        System.arraycopy(arr, arr.length / 2, temp2, 0, arr.length / 2);

        temp1 = ch(temp1);
        temp2 = ch(temp2);

        return temp2;
    }

    /*
     * public static int[] splArr(int[] arrA) {
     * if (arrA == null) {
     * return null;
     * }
     * if (arrA.length < 2) {
     * return arrA;
     * }
     * int[] arrayB = new int[arrA.length / 2];
     * int[] arrayC = new int[arrA.length - arrA.length / 2];
     * 
     * System.arraycopy(arrA, 0, arrayB, 0, arrA.length / 2);
     * System.arraycopy(arrA, arrA.length / 2, arrayC, 0, arrA.length - arrA.length
     * / 2);
     * 
     * arrayB = splArr(arrayB);
     * arrayC = splArr(arrayC);
     * 
     * return mergeArr(arrayB, arrayC);
     * 
     * }
     * 
     * public static int[] mergeArr(int[] arrA, int[] arrB) {
     * int[] arrRes = new int[arrA.length + arrB.length];
     * int pos_A = 0, pos_B = 0;
     * 
     * for (int i = 0; i < arrRes.length; i++) {
     * if (pos_A == arrA.length) {
     * arrRes[i] = arrB[i - pos_B];
     * pos_B++;
     * } else if (pos_B == arrB.length) {
     * arrRes[i] = arrA[i - pos_A];
     * pos_A++;
     * } else if (arrA[i - pos_A] < arrB[i - pos_B]) {
     * arrRes[i] = arrA[i - pos_A];
     * pos_B++;
     * } else {
     * arrRes[i] = arrB[i - pos_B];
     * pos_A++;
     * }
     * }
     * return arrRes;
     * }
     */

}
