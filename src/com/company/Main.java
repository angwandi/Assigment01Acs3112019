package com.company;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] monthOfTheYear =
            {"January", "February", "March", "April",
            "May", "June", "July", "August",
                    "September", "October", "November", "December"};
    private static int size = monthOfTheYear.length;
    private static int[] month = new int[size];
    private static int i;
    private static int sum = 0;

    public static void main(String[] args) {
        System.out.println("Enter the monthly rainfall starting with January : ");
        populateRainFall();
        sumOfRainfall();
        averageRainfall(month);
        highestRainfall();
        lowestRainfall();
        System.out.println("Enter a rainfall to check if it happened this yeah : ");
        int checkValue = scanner.nextInt();
        checkRainfall(month, checkValue);
        System.out.println();
        System.out.println("THANK YOU! SEE YOU SOON");
        System.out.println("------------------------");
        System.out.println();
    }

    private static void populateRainFall() {
        for (int i = 0; i < size; i++) {
            month[i] = scanner.nextInt();
            for (int j = 0; j < size; j++) {
                monthOfTheYear[0] = monthOfTheYear[i];
            }
            System.out.println(monthOfTheYear[i]);
        }
        System.out.println("Rainfall from January to December respectively are as follows : ");
        System.out.println(Arrays.toString(month));
    }

    private static void sumOfRainfall() {
        for (i = 0; i < size; i++) {
            sum = sum + month[i];
        }
        System.out.println("The TOTAL SUM of rainfall this year is : " + sum);
    }

    private static void averageRainfall(int[] a) {
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum += a[i];
        System.out.println("The AVERAGE rainfall this year is : " + sum / size);
    }

    private static void highestRainfall() {
        int max = month[0];
        for (i = 0; i < size; i++) {
            if (month[i] > max) {
                max = month[i];
            }
        }
        System.out.println("The HIGHEST rainfall this year  is : " + max);
    }

    private static void lowestRainfall() {
        int max = month[0];
        for (i = 0; i < size; i++) {
            if (month[i] < max) {
                max = month[i];
            }
        }
        System.out.println("The LOWEST rainfall this year  is : " + max);
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
            System.out.println("It did happen");
        } else {
            System.out.println("Never Happened");
        }
    }
}
