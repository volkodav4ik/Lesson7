package com.volkodav4ik;

public class HW7T2 {

    private static final int DECIM = 10;
    private static final int MAX_VALUE = 999;

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 0; i <= MAX_VALUE; i++) {
            int tmpLeft = (i / DECIM / DECIM) + ((i / DECIM) % DECIM) + (i % DECIM);
            for (int j = 0; j <= MAX_VALUE; j++) {
                int tmpRight = (j / DECIM / DECIM) + ((j / DECIM) % DECIM) + (j % DECIM);
                if (tmpLeft == tmpRight) {
                    counter++;
                }
            }
        }
        System.out.println("You can get " + counter + " lucky ticket from 1M tickets");
    }
}