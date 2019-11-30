package com.volkodav4ik;

import java.util.Scanner;

public class HW7T4 {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MONTH = 12;
    private static final double INTEREST_RATE = 1.015;

    public static void main(String[] args) {
        System.out.println("Please, enter deposit amount:");
        double deposit = SCANNER.nextDouble();
        System.out.println("Please, enter deposit term, years:");
        int years = SCANNER.nextInt();
        System.out.printf("The deposit amount after %d years will be %.2f $", years, finalDepositAmount(years, deposit));
    }

    private static double finalDepositAmount(int years, double deposit) {
        for (int i = 1; i <= MONTH * years; i++) {
            deposit = deposit * INTEREST_RATE;
        }
        return deposit;
    }
}