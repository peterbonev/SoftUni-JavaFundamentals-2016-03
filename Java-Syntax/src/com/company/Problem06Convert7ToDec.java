package com.company;

import java.util.Scanner;

public class Problem06Convert7ToDec {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter first number:");
        String input = Input.next();
        int base7 = Integer.parseInt(input);
        int[] converted = new int[input.length()];
        int result = 0;
        int power = 10;
        int base = 1;
        for (int i = 0; i < input.length(); i++)
        {

            converted[i] = base7 % power;
            result += base*converted[i];
            base *=7;
            base7 /= 10;
        }

        System.out.print(result);

    }
}
