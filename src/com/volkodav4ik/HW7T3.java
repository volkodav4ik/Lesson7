package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;

public class HW7T3 {

    private static final int MAX_VALUE = 100000;
    private static final int QUANTITY_OF_VALUE = 15;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int quant = RANDOM.nextInt(QUANTITY_OF_VALUE);
        int[] arr = new int[quant];
        createAndInitArr(arr);
        System.out.println("Sourse array:" + Arrays.toString(arr));
        System.out.println("Array after transformation:" + Arrays.toString(newArr(arr)));
    }

    private static int[] newArr(int[] arr) {
        double mean = 0;
        for (int value : arr) {
            mean += value;
        }
        mean = mean / arr.length;
        int newArrLen = 0;
        for (int value : arr) {
            if (value > mean) {
                newArrLen++;
            }
        }
        int[] newArr = new int[newArrLen];
        int k = 0;
        for (int value : arr) {
            if (value > mean) {
                newArr[k] = value;
                k++;
            }
        }
        return newArr;
    }

    private static void createAndInitArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_VALUE);
        }
    }
}