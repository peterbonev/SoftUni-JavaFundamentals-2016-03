package com.company;

import java.util.Scanner;

public class Problem02TriangleArea {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String[] coordinates1 = Input.nextLine().split(" ");
        String[] coordinates2 = Input.nextLine().split(" ");
        String[] coordinates3 = Input.nextLine().split(" ");

        double Area = (Double.parseDouble(coordinates1[0])*(Double.parseDouble(coordinates2[1])-Double.parseDouble(coordinates3[1])) +
                Double.parseDouble(coordinates2[0])*(Double.parseDouble(coordinates3[1]) - Double.parseDouble(coordinates1[1])) +
                Double.parseDouble(coordinates3[0])*(Double.parseDouble(coordinates1[1]) -  Double.parseDouble(coordinates2[1])))/2;

        System.out.println(Math.round(Math.abs(Area)));
    }
}
