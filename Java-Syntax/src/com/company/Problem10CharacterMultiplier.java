package com.company;

import java.util.Scanner;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter the strings:");
        String[] targets = Input.nextLine().split(" ");

        CharacterMultiplier(targets);
    }
    private static void CharacterMultiplier(String[] targets) {

        int result = 0;
        if (targets[0].length() == targets[1].length())
        {
            for (int i = 0; i < targets[0].length(); i++)
            {
                result += (int)targets[0].charAt(i)*(int)targets[1].charAt(i);
            }
        }
        else
        {
            if (targets[0].length() > targets[1].length())
            {
                for (int i = 0; i < targets[0].length(); i++)
                {
                    if (i < targets[1].length())
                        result += (int)targets[0].charAt(i)*(int)targets[1].charAt(i);
                    else
                        result += (int)targets[0].charAt(i);
                }
            }
            if (targets[0].length() < targets[1].length())
            {
                for (int i = 0; i < targets[1].length(); i++)
                {
                    if (i < targets[0].length())
                        result += (int)targets[1].charAt(i)*(int)targets[0].charAt(i);
                    else
                        result += (int)targets[1].charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}
