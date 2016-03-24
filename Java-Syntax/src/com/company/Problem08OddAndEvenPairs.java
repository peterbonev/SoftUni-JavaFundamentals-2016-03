package com.company;

import java.util.Scanner;

public class Problem08OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter first number:");
        String[] numbers = (Input.nextLine()).split(" ");

        if (numbers.length % 2 !=0)
            System.out.println("Invalid length");
        else {
            for (int i = 0; i < numbers.length; i += 2) {
                if (Integer.parseInt(numbers[i]) % 2 == 0 && Integer.parseInt(numbers[i + 1]) % 2 == 0)
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> both are even");

                else if (Integer.parseInt(numbers[i]) % 2 == 1 && Integer.parseInt(numbers[i + 1]) % 2 == 1)
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> both are odd");
                else
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> different");

            }
        }
    }
}
