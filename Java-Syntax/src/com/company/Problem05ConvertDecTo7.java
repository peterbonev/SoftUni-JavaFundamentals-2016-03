package com.company;

import java.util.Scanner;

public class Problem05ConvertDecTo7 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter first number:");
        String input = Input.next();
        int base7 = Integer.parseInt(input);
        int[] converted = new int[input.length()];
        int result = 0;
        int power = 7;
        int base = 1;
        for (int i = 0; i < input.length(); i++)
        {

            converted[i] = base7 % power;
            result += base*converted[i];
            base *=10;
            base7 /= 7;
        }

        System.out.print(result);

    }
}
