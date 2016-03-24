package com.company;

import java.util.Scanner;

public class Problem01RectangleArea {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String[] Sides = Input.nextLine().split(" ");

        int Area = Integer.parseInt(Sides[0])*Integer.parseInt(Sides[1]);
        System.out.printf("%d", Area);

    }
}
