package com.volkodav4ik;

public class HW7T1 {

    private static final int HOUR = 24;
    private static final int MINUT = 60;

    public static void main(String[] args) {
        String sHour = "";
        String sMinute = "";
        int counter = 0;
        for (int i = 0; i < HOUR; i++) {
            if (i < 10) {
                sHour = "0" + i;
            } else {
                sHour = String.valueOf(i);
            }
            for (int j = 0; j < MINUT; j++) {
                if (j < 10) {
                    sMinute = "0" + j;
                } else {
                    sMinute = String.valueOf(j);
                }
                StringBuilder tmpSb = new StringBuilder(sMinute);
                tmpSb.reverse();
                if (sHour.equals(tmpSb.toString())) {
                    counter++;
                }
            }
        }
        System.out.println("Found " + counter + " coincidences");
    }
}
