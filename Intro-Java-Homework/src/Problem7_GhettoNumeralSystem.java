import java.util.Scanner;


public class Problem7_GhettoNumeralSystem {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] digits = new char[input.length()];
        input.getChars(0,input.length(),digits,0);
        String[] CodingTable = {"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};

        for (int i : digits)
            System.out.print(CodingTable[i-48]);

    }
}
