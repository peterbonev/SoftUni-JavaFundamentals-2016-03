package com.company;

import java.util.Scanner;

public class Problem04CalculateExpression {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter first number:");
        double a = Input.nextDouble();
        System.out.printf("Enter second number:");
        double b = Input.nextDouble();
        System.out.printf("Enter third number:");
        double c = Input.nextDouble();
        double F1base = (Math.pow(a, 2.0) + Math.pow(b, 2.0)) / (Math.pow(a, 2.0) - Math.pow(b, 2.0));
        double F1Power = (a + b + c) / Math.sqrt(c);
        double F1Result = Math.pow(F1base, F1Power);
        double F2Result = Math.pow((Math.pow(a, 2.0) + Math.pow(b, 2.0) - Math.pow(c, 3.0)), a - b);
        double Differ = Math.abs((a + b + c) / 3 - (F1Result + F2Result) / 2);
        System.out.printf("%.2f, %.2f, %.2f", F1Result, F2Result, Differ);
    }
}
