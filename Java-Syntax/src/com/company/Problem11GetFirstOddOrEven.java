package com.company;

import java.util.Scanner;

public class Problem11GetFirstOddOrEven {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String[] targets = Input.nextLine().split(" ");
        String[] command = Input.nextLine().split(" ");
        GetFirstOddOrEven(targets, command);
    }
    private static void GetFirstOddOrEven(String[] targets, String[] command) {

        int counter = 0;

        if (command[2].compareTo("odd") == 0)
        {
            for (int i = 0; i < targets.length; i++)
            {
                if (Integer.parseInt(targets[i]) % 2 == 1)
                {
                    if (counter <= Integer.parseInt(command[1]))
                        System.out.print(Integer.parseInt(targets[i])+" ");
                    counter++;
                }
            }
        }

        if (command[2].compareTo("even") == 0)
        {
            for (int i = 0; i < targets.length; i++)
            {
                if (Integer.parseInt(targets[i]) % 2 == 0)
                {
                    if (counter <= Integer.parseInt(command[1]))
                        System.out.print(Integer.parseInt(targets[i])+" ");
                    counter++;
                }
            }
        }
    }
}
