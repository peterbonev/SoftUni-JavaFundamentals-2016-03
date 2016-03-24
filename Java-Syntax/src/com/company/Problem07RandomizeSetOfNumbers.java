package com.company;

import java.util.Scanner;

public class Problem07RandomizeSetOfNumbers {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter first number:");
        int minimum = Input.nextInt();
        System.out.printf("Enter second number:");
        int maximum = Input.nextInt();
        int[] numbers = new int[Math.abs(maximum - minimum)];
        for (int i = 0; i < Math.abs(maximum - minimum); i++) {
            if (minimum <= maximum) {
                if (minimum + (int) (Math.random() * 10) <= maximum && minimum <= maximum - (int) (Math.random() * 10))
                    numbers[i] = minimum + (int) (Math.random() * 10);
                else
                    numbers[i] = maximum - i;
            } else {
                if (maximum + (int) (Math.random() * 10) <= minimum && maximum <= minimum - (int) (Math.random() * 10))
                    numbers[i] = maximum + (int) (Math.random() * 10);
                else
                    numbers[i] = minimum - i;
            }

        }
        for (int j : numbers)
            System.out.print(j + " ");
    }
}