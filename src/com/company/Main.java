package com.company;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final int MONTHS = 12;
    private static String[] monthOfTheYear =
            {"January", "February", "March", "April",
                    "May", "June", "July", "August",
                    "September", "October", "November", "December"};
    private static int[] rainAmount = new int[MONTHS];
    private static int i;
    private static int sum = 0;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("1. INFO : ");
        System.out.println("---------");
        System.out.println("Good to know: A rain gauge (also known as an udometer, pluviometer, or an ombrometer) " +
                "\nis an instrument used by meteorologists and hydrologists to gather and measure the amount of " +
                "\nliquid precipitation (usually in mm) over an area in a predefined period of time.");
        System.out.println();
        System.out.println("2. PROGRAM : Nairobi Rainfall 2018");
        System.out.println("----------------------------------");
        populateRainFall();
        printAllRainFallByMonth();
        sumOfRainfall();
        averageRainfall(rainAmount);
        highestRainfall();
        lowestRainfall();
        System.out.println("Enter an amount of rainfall to check if it happened this year or not : ");
        int checkValue = scanner.nextInt();
        checkRainfall(rainAmount, checkValue);
        System.out.println("THANK YOU! SEE YOU SOON");
        System.out.println("------------------------");
    }

    private static void populateRainFall() {
        for (int i = 0; i < MONTHS; i++) {
            System.out.println("Enter amount of rainfall for "
                    + monthOfTheYear[i] + " : ");
            rainAmount[i] = scanner.nextInt();
            while (rainAmount[i] < 0) {
                System.out.println("The amount of rainfall must be higher than Zero (0), Thanks!!");
                rainAmount[i] = scanner.nextInt();
            }
        }
    }

    private static void sumOfRainfall() {
        for (i = 0; i < MONTHS; i++) {
            sum = sum + rainAmount[i];
        }
        System.out.println("The TOTAL amount of rainfall this year is : " + sum);
    }

    private static void averageRainfall(int[] a) {
        int sum = 0;
        for (int i = 0; i < MONTHS; i++)
            sum += a[i];
        System.out.println("The AVERAGE amount rainfall this year is : " + sum / MONTHS);
    }

    private static void highestRainfall() {
        int max = rainAmount[0];
        for (i = 0; i < MONTHS; i++) {
            if (rainAmount[i] > max) {
                max = rainAmount[i];
            }
        }
        System.out.println("The HIGHEST amount rainfall this year  is : " + max);
    }

    private static void lowestRainfall() {
        int max = rainAmount[0];
        for (i = 0; i < MONTHS; i++) {
            if (rainAmount[i] < max) {
                max = rainAmount[i];
            }
        }
        System.out.println("The LOWEST amount rainfall this year  is : " + max);
    }

    private static void checkRainfall(int[] array, int numberToCheck) {
        int found = 0;
        for (int element : array) {
            if (element == numberToCheck) {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            System.out.println("This amount of rainfall entered did happen this year.");
        } else {
            System.out.println("The amount of rainfall entered Never Happened this year");
        }
    }

    private static void printAllRainFallByMonth() {
        for (i = 0; i < MONTHS; i++) {
            sum += rainAmount[i];
            System.out.print("The amount entered for ");
            System.out.print(monthOfTheYear[i] + " : ");
            System.out.print(rainAmount[i]);
            System.out.print(" (mm) of rainfall.\n");
            System.out.println("-------------------------------------------------------");
        }
    }
}
