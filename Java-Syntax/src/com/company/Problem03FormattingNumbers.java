package com.company;

import java.util.Scanner;


public class Problem03FormattingNumbers {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter first number:");
        int FirstNumber = Input.nextInt();
        System.out.printf("Enter second number:");
        float SecondNumber = Input.nextFloat();
        System.out.printf("Enter third number:");
        float ThirdNumber = Input.nextFloat();

        System.out.printf("%-10x, %10s, %10.2f, %-10.3f", FirstNumber, String.format("%10s",Integer.toBinaryString(FirstNumber)).replace(' ', '0'), SecondNumber, ThirdNumber);
    }
}
