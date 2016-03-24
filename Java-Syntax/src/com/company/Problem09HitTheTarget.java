package com.company;

import java.util.Scanner;

public class Problem09HitTheTarget {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter the target number:");
        int target = Integer.parseInt(Input.nextLine());

        for (int i = 1; i <= 20; i++)
        {
            for (int j = 1; j <=20; j++)
            {
                if (i + j == target)
                    System.out.println(i + " + " + j + " = " + target);
            }
        }
        for (int i = 1; i <= 20 ; i++)
        {
            for (int j = 1; j <= 20; j++)
            {
                if (i - j == target)
                    System.out.println(i + " - " + j + " = " + target);
            }
        }
    }
}
